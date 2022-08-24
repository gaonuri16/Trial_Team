package com.spring.pr.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Repository;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorker;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.tool.xml.css.CssFile;
import com.itextpdf.tool.xml.css.StyleAttrCSSResolver;
import com.itextpdf.tool.xml.html.CssAppliers;
import com.itextpdf.tool.xml.html.CssAppliersImpl;
import com.itextpdf.tool.xml.html.Tags;
import com.itextpdf.tool.xml.parser.XMLParser;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;

/**
    * html태그를 pdf파일로 변환한다.
    * @author Jacob
    * @since 2019.01.06 - 2019.01.06
    * @version v1.0
    */

@Repository
public class ConvertToPdf {

    @SuppressWarnings("deprecation")
	public static void createPdf(String filename, String htmlStr, HttpServletRequest request)
            throws DocumentException, IOException {
//    public static MultipartFile createPdf(String filename, String htmlStr, HttpServletRequest request)
//            throws DocumentException, IOException {
//        PC별 다운로드파일
        String storePathString = "C:\\Users\\"+System.getProperty("user.name")+"\\Downloads\\";
//        서버 내 파일 주소
        String rootPath = request.getSession().getServletContext().getRealPath("/");
        File saveFolder = new File(storePathString);
        
        //경로 없을 시 생성
        if (!saveFolder.exists() || saveFolder.isFile()) saveFolder.mkdirs();
        
        //용지 설정
         Document document = new Document(PageSize.A4.rotate(), 15, 15, 50, 50); 
//        Document document = new Document();
        
        //파일 확장자
        filename += ".pdf";
        String realName = storePathString + filename;
        File pdfFile = new File(realName);

        //같은 ( 파일명.확장자 ) 덮어쓰기
        if (pdfFile.isFile()) pdfFile.delete();
        
//        pdf를 만들기 시작한다.
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(realName));
        document.open();

        //이미지 태그 절대경로 사용해야 한다.(반드시)        
        htmlStr = htmlStr.replaceAll("src=\"/", "src=\"http://127.0.0.1:8080/");
        //폰트를 설정한다. 폰트 설정 누락시 한글이 안보이는 경우 발생
        htmlStr = "<html><body style='font-family: MalgunGothic;'>" + htmlStr + "</body></html>";
        
        @SuppressWarnings("unused")
		XMLWorkerHelper helper = XMLWorkerHelper.getInstance();
        
        //css파일
        CSSResolver cssResolver = new StyleAttrCSSResolver();
        CssFile cssFile = XMLWorkerHelper.getCSS(new FileInputStream(rootPath+"/resources/css/pdf.css"));
        cssResolver.addCss(cssFile);

//      폰트설정
        XMLWorkerFontProvider fontProvider = new XMLWorkerFontProvider(XMLWorkerFontProvider.DONTLOOKFORFONTS);
        fontProvider.register(rootPath + "/resources/fonts/NanumGothic-Regular.ttf", "MalgunGothic");
        CssAppliers cssAppliers = new CssAppliersImpl(fontProvider);
        HtmlPipelineContext htmlContext = new HtmlPipelineContext(cssAppliers);
        htmlContext.setTagFactory(Tags.getHtmlTagProcessorFactory());
            
        // html을 pdf로 변환
        PdfWriterPipeline pdf = new PdfWriterPipeline(document, writer);
        HtmlPipeline html = new HtmlPipeline(htmlContext, pdf);
        CssResolverPipeline css = new CssResolverPipeline(cssResolver, html);

        //캐릭터 셋 설정
        XMLWorker worker = new XMLWorker(css, true);
        XMLParser xmlParser = new XMLParser(worker, Charset.forName("UTF-8"));
        
        StringReader strReader = new StringReader(htmlStr);
        xmlParser.parse(strReader);
        document.close();
        writer.close();    
    }
}

