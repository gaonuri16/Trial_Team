<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>조력자 개인정보 수집 및 이용 약관 동의</title>

	<!-- 페이지 무조건 추가  -->
	<link rel="shortcut icon" type="image/x-icon"
		href="${pageContext.request.contextPath }/resources/images/favicon.ico">
	
	
	<link rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	<link rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/templatemo.css">

	
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
	
</head>

<style>

        .titlefoot {
            text-align: center;
            margin: 70px auto;
        }

        #person-btn {
            color: white;
        }

        .info-essen {
            font-size: 80%;
            color: red;
        }

        /* 체크 버튼 */
        .info-check {
            display: inline-block;
            width: 20px;
            height: 15px;
            border: 2px solid #bcbcbc;
            cursor: pointer;
        }

        /* text area */
        .info-ag {
            font-weight: bold;
            float: right;
        }

        #info-text {
            resize: none;
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
    
<body>

<jsp:include page="../include/header.jsp" />

<!-- Start Content -->
        <div class="container py-5">
            <div class="row">
            	<div class="container-fluid py-3">
                  <div class="col-md-7">
                  	<h1>개인정보 수집 및 이용 약관 동의</h1>
                  	<hr width="1250">
                </div>

				<form class="col-md-9 m-auto" action="<c:url value='/apply/personInfoForm' />" name="personInfoForm" method="post"> <!-- 포스트로 요청 받을 때에는 action -->
                
                    <section class="py-5 px-3">
                        <div class="form-group">
                            <label for="content"></label>
                            <textarea id="info-text" class="form-control" rows="10" placeholder="이용약관 동의"></textarea>
                            <div class="info-ag">
                                이용약관 동의<span class="info-essen">(필수) </span><input type="checkbox" class="info-check" name="termsUse">
                            </div>
                        </div>

                        <br>
                        <br>

                        <div class="form-group">
                            <label for="content"></label>
                            <textarea id="info-text" class="form-control" rows="10" placeholder="개인정보 수집 및 이용 동의"></textarea>
                            <div class="info-ag">
                                개인정보 수집 및 이용 동의<span class="info-essen">(필수) </span><input type="checkbox" class="info-check" name="personInfo">
                            </div>
                        </div>

                    </section>
                </form>
            </div>
        </div>
                                
        <!-- End Content -->

        <!-- Start Brands -->
        <section class="py-5">
            <div class="container my-4">
                <div class="row text-center py-3">
                    <div class="col-lg-6 m-auto">
    
                    </div>
                                    
                        
                                </div>
    
                                <div class="titlefoot col mt-2">
                                    <button type="button" class="btn btn-secondary btn-lg px-3 person-btn" id="prevBtn">이전</button>
                                    <button type="button" class="btn btn-secondary btn-lg px-3 person-btn" id="nextBtn">다음</button>
                                </div>
                                
                                
                                <%-- onclick="location.href='<c:url value="/apply/identification" />'" --%>
   
 
                                    
                                </div>
    
                                
                            </div>
    
                        </div>
                    </div>
                </div>
            </div>
        </section>
        
        <%@ include file="../include/footer1.jsp"%>

</body>

<script> 
		$(function() { 
			$('#nextBtn').click(function() {
				if($('input[name=termsUse]:checked').length < 1) {
					alert('이용약관 동의는 필수 항목입니다.');
					return;
					
				} else if($("input[name=personInfo]:checked").length < 1) {
					alert("개인정보 수집 및 이용 동의는 필수 항목입니다.");
					
				} else {
					document.personInfoForm.submit();
				}
			});
			
			/* $('#nextBtn').click(function() {
				if(confirm('등록 하시겠습니까?')) {
					location.href='<c:url value="/apply/success" />'
				} else return;
			}) */

		});

</script>







</html>