<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
	
	<title>기관 정보 등록</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="apple-touch-icon" href="${pageContext.request.contextPath }/resources/images/apple-icon.png" />
    
    <!-- 페이지 무조건 추가  -->
	<link rel="shortcut icon" type="image/x-icon"
		href="${pageContext.request.contextPath }/resources/images/favicon.ico">
	
	
	<link rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	<link rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/templatemo.css">
	<link rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/custom.css">
	
	<!-- Load fonts style after rendering the layout styles -->
	<link rel="stylesheet"
		href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;200;300;400;500;700;900&display=swap">
	<link rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/fontawesome.min.css">
	<link rel="stylesheet"
		href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css">
		
	<!-- 아이콘 깨지는 것 해결하는 script -->
	<script src="https://kit.fontawesome.com/22ff043012.js" crossorigin="anonymous"></script>
		
	<!-- Start Script -->
	<script
		src="${pageContext.request.contextPath }/resources/js/jquery-1.11.0.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/resources/js/jquery-migrate-1.2.1.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/resources/js/bootstrap.bundle.min.js"></script>
	<script
		src="${pageContext.request.contextPath }/resources/js/templatemo.js"></script>
	<script src="${pageContext.request.contextPath }/resources/js/custom.js"></script>
	<!-- End Script -->
	
	<!-- 무조건 페이지 추가  -->
	
<style>
.notice-regi-title{
    margin-left: 40%;
}

section{
    height: 80% !important;
}

.notice-regi-text{
    height: 70%;
}

.notice-regi-btn{
    margin-top: 10px;
    float: right;
    
}

form{
    padding-bottom: 20px;
}

.notice-modi-btn{
    margin-right: 20px;
}

.input-group-text{
    width: 130px;
    display: flex;
    justify-content : center;
}

.file-btn{
    font-size: 15px !important;
    font-weight: 500;
}

.sec-list{
        padding: 10% !important;
      }

/* 여기서부터 추가 */
.form-total{
    padding-top: 100px;
}

.side-sec{
    float: left;
    width: 10%;
    margin-left: 0;
}

.total-sec{
    width: 70%;
    float: right;
    margin-right: 100px;
}

.notice-regi-btn{
    margin-top: 10px;
    float: right;
    padding-bottom: 100px;
}

/*
    왼쪽 사이드 카테고리
*/

.col-lg-3 {
    margin-top: 150px;
    margin-left: 100px;
    width: 360px;
}

.pb-3 a {
    font-weight: bold;
    padding-bottom: 15px;
}

.pb-3 a:hover {
    color: #5a95f5;
}

/*-----------------------------------------------------------------*/

/*
    사이드 버튼 이벤트 효과
*/

.action-btn {
    padding: 15px 100px;
    margin:10px 4px;
    font-family: sans-serif;
    text-transform: uppercase;
    text-align: center;
    position: relative;
    text-decoration: none;
    display:inline-block;
    
}

.action-btn::before{
    content: "";
    position: absolute;
    top: 0;
    left: 0;
    display: block;
    width: 100%;
    height: 100%;
    z-index: -1;
    transform: scaleX(.3);
    opacity: 0;
    transition: all .3s
}
  .action-btn:hover::before{
    opacity: 1;
    background-color: #212934;
    -webkit-transform: scaleX(1);
    transform: scaleX(1);
    transition: -webkit-transform .6s cubic-bezier(.08, .35, .13, 1.02), opacity .4s;
    transition: transform .6s cubic-bezier(.08, .35, .13, 1.02), opacity;   
}

.pb-3 a:hover {
    color: white;
}

/*-----------------------------------------------------------------*/


/* title style */
.announcement-detail-title{
    width: 100%;
    margin-bottom: 80px;
}
.announcement-detail-title h3{
    text-align: center;
    margin: 0 auto;
    border-top:2px solid #888888 ;
    border-bottom:2px solid #888888 ;
    padding: 15px;
    color: #808080;
    width: 25%;
    font-size: 20px;
}

/* 푸터 */
.under-footer {
        height: 150px;
    }

    .footer-box2 {
        padding: 20px 0px;
        position: relative;
        left: 160px;
        bottom: 115px;
        font-size: 17px !important;
        font-weight: 100 !important;
        line-height: 30px;
    }

</style>
	
</head>
<body>

	<jsp:include page="../include/header2.jsp" />
	
	    <!-- side바 추가 -->
    <div class="total clearfix">
        <!-- form을 감싸고 있음-->
    <div class="container side-sec">
        <div class="row">

            <div class="col-lg-3">
                <ul class="list-unstyled templatemo-accordion">
                  <li class="pb-3">
                      <a class="collapsed d-flex justify-content-between h3 text-decoration-none" onclick="location.href='<c:url value = "/ins/insList?page=1"/>'">
                      	기관 정보 조회
                      </a>
                  </li>
                  <li class="pb-3">
                      <a class="collapsed d-flex justify-content-between h3 text-decoration-none myInfo" onclick="location.href='<c:url value = "/ins/insAdd"/>'">
                      	기관 정보 등록
                      </a>
                  </li>
              </ul>
            </div>
        </div>
    </div>

    <!-- Start Categories of The Month -->

        <section class = "py-3 total-sec">

        <div class="table-box col-lg second-section" >
            <!-- 타이틀 추가 -->
            <div class="announcement-detail-title">
                <h3>기관 정보 등록</h3>
            </div>


            <div>
                <div>
                    <div>
                    <form action="<c:url value='/ins/insAdd'/>" name="registForm" method="post">
                    	<div class="input-group mb-3">

                            <span class="input-group-text">기관 번호</span>
                            <input type="text" class="form-control" aria-label="Text input with segmented dropdown button" name="InsNum">

                        </div>
                    
                        <div class="input-group mb-3">

                            <span class="input-group-text">기관 이름</span>
                            <input type="text" class="form-control" aria-label="Text input with segmented dropdown button" name="InsName">

                        </div>

                        <div class="input-group mb-3">

                            <span class="input-group-text">기관 연락처</span>
                            <input type="text" class="form-control" aria-label="Text input with segmented dropdown button" name="InsPhone">

                        </div>

                        <div class="input-group mb-3">

                            <span class="input-group-text">기관 팩스번호</span>
                            <input type="text" class="form-control" aria-label="Text input with segmented dropdown button" name="InsFaxNum">

                        </div> 

                        <div class="input-group mb-3">

                            <span class="input-group-text">기관 주소</span>
                            <input type="text" class="form-control" aria-label="Text input with segmented dropdown button" name="InsAddr">

                        </div>
                        
                        <div class="input-group mb-3">

                            <span class="input-group-text">기관 상세 주소</span>
                            <input type="text" class="form-control" aria-label="Text input with segmented dropdown button" name="InsAddrDetail">

                        </div>
                        
                        <div class="input-group mb-3">

                            <span class="input-group-text">아이디</span>
                            <input type="text" class="form-control" aria-label="Text input with segmented dropdown button" name="JoinId">

                        </div>
                    </form>
                    </div>
                    
                </div>

                <!-- faq를 작성한 사용자만(아이디로 비교) 수정버튼 활성화 -->
                <div class="notice-regi-btn">
                    <button class="btn btn-outline-secondary" type="button" id="inputGroupFileAddon04 cancelBtn" onclick="location.href='<c:url value="/ins/insList?page=1"/>'">취소</button>

                    <button class="btn btn-outline-secondary" type="button" id="registBtn">등록</button>
                </div>

            </div>

        </div>      
    </section>

</div>
	
	<%@ include file="../include/footer1.jsp"%>
	
	<script>
		$(function() {
			$('#registBtn').click(function() {
				if(confirm("등록하시겠습니까?")) {
					if($('input[name=InsNum]').val() === '') {
						alert('기관 번호는 필수입니다.');
						$('input[name=InsNum]').Focus();
						return;
					}
					else if($('input[name=InsName]').val() === '') {
						alert('기관 이름은 필수입니다.');
						$('input[name=InsName]').Focus();
						return;
					}
					else if($('input[name=InsPhone]').val() === '') {
						alert('기관 연락처를 입력해주세요.');
						$('input[name=InsPhone]').Focus();
						return;
					}
					else if($('input[name=InsFaxNum]').val() === '') {
						alert('기관 팩스번호를 입력해주세요');
						$('input[name=InsFaxNum]').Focus();
						return;
					}
					else if($('input[name=InsAddr]').val() === '') {
						alert('기관 주소는 필수입니다.');
						$('input[name=InsAddr]').Focus();
						return;
					}
					else if($('input[name=InsAddrDetail]').val() === '') {
						alert('기관 상세 주소는 필수입니다.');
						$('input[name=InsAddrDetail]').Focus();
						return;
					}
					else if($('input[name=JoinId]').val() === '') {
						alert('아이디는 필수입니다.');
						$('input[name=JoinId]').Focus();
						return;
					}
					else {
						document.registForm.submit();
					}
				}
					
			});
		});
	</script>

</body>
</html>