<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>조력자 신청</title>

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

	.btn-success {
		margin-top: 15px;
	}
        
	.content-row{
		display: flex;
		justify-content: center;
	}

	.board-table{
		width: 100%;
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

    <!-- 조력자 공고 신청 배너 -->
    <form class="form-total">
        <div class="container py-5">
            <div class="row">
                <div class="container-fluid py-3">
                    <section class="container py-5">
                        <div>
                            <h1 id="apply-benner">조력자 신청하기</h1><hr width="1250">
                        </div>
                    </section>
                </div>

      <form class="form-total">
        <div class="container py-5">
            <div class="row">
                <div class="container-fluid py-3">
                    <section class="container py-5">
                        <div>
                            <h1 id="apply-benner">조력자 신청하기</h1><hr width="1250">
                        </div>
                    </section>
                </div>

                <!-- 공고 테이블 -->
                <div class="container-fluid" id="applyList">
                    <div class="content-row">
                        <!--lg에서 9그리드, xs에서 전체그리드-->   
                        <div class="col-lg-9 col-xs-12 board-table">
                            <div class="titlebox">
                                <table class="table table-striped">
                                    <thead>
                                        <tr align="center">
                                            <th>번호</th>
                                            <th class="board-title">년도</th>
                                            <th>차수</th>
                                            <th>제목</th>
                                            <th>공고 기간</th>
                                            <th>조력자 구분</th>
                                            <th></th>
                                        </tr>
                                    </thead>

                                    <tbody>
                                      <c:forEach var="vo" items="${anmList}">
	                                        <tr align="center">
	                                            <td>
	                                                &nbsp;&nbsp;&nbsp;
	                                                <p>${vo.anmNum}</p>
	                                            </td>
	
	                                            <td>
	                                                &nbsp;&nbsp;&nbsp;
	                                                <p>${vo.anmYear}</p>
	                                            </td>
	
	                                            <td>
	                                                &nbsp;&nbsp;&nbsp;
	                                                <p>${vo.anmDegree}</p>
	                                            </td>
	            
	                                            <td>
	                                                &nbsp;&nbsp;&nbsp;
	                                                <p>${vo.anmTitle}</p>
	                                            </td>
	            
	                                            <td>
	                                                &nbsp;&nbsp;&nbsp;
	                                                <p>${vo.anmStart} ~ ${vo.anmEnd}</p>
	                                            </td>
	            
	                                            <td>
	                                                &nbsp;&nbsp;&nbsp;
	                                                <p>${vo.anmDivision}</p>
	                                            </td>
	            
	                                            <td>
	                                                <div class="container">
	                                                    <div class="row">
	                                                        <div class="col text-center">
	                                                            <button class="btn btn-success">신청하기</button>
	                                                        </div>
	                                                    </div>
	                                                </div>
	                                            </td>
	                                        </tr>
                                      </c:forEach>
                                    </tbody>
                                </table>
                                
								<form action="<c:url value='/apply/applyList' />" name="pageForm">
						            <div class="text-center">
						                <hr>
						                <ul id="pagination" class="pagination pagination-sm">
						                    <c:if test="${pc.prev}">
						                        <li><a href="#" data-pagenum="${pc.beginPage-1}">이전</a></li>
						                    </c:if>
						                        
						                    <c:forEach var="num" begin="${pc.beginPage}" end="${pc.endPage}">
						                        <li class="${pc.paging.pageNum == num ? 'active' : ''}"><a href="#" data-pagenum="${num}">${num}</a></li>
						                    </c:forEach>
						                        
						                    <c:if test="${pc.next}">
						                        <li><a href="#" data-pagenum="${pc.endPage+1}">다음</a></li>
						                    </c:if>
						                </ul>                     
						                    <!-- 페이지 관련 버튼(이전, 다음, 페이지번호)을 클릭 시 같이 숨겨서 보내줄 공통 값  -->
						                    <input type="hidden" name="pageNum" value="${pc.paging.pageNum}">
						                    <input type="hidden" name="cpp" value="${pc.paging.cpp}">
                                    </div>                       
								</form>
		                    </div>
		                </div>     
		            </div>
		        </div>
		    </div>
		</div>
	</form>
 
        
        <!-- Start Brands -->
        <section class="py-5">
            <div class="container my-4">
                <div class="row text-center py-3"></div>
            </div>
        </section>
        <!--End Brands-->

        <%@ include file="../include/footer1.jsp"%>

</body>
</html>




<script>
		$(function() {
			
			const msg = '${msg}';
			if(msg !== '') {
				alert(msg);
			}

			//사용자가 페이지 관련 버튼을 클릭했을 때, 기존에는 각각의 a태그의 href에다가
			//각각 다른 url을 작성해서 요청을 보내줬다면, 이번에는 클릭한 그 버튼이 무엇인지를 확인해서
			//그 버튼에 맞는 페이지 정보를 자바스크립트로 끌고와서 요청을 보내 주겠습니다.
			$('#pagination').on('click', 'a', function(e) {
				e.preventDefault(); //a태그의 고유기능 중지.
				
				//현재 이벤트가 발생한 요소(버튼)의
				//data-pageNum의 값을 얻어서 변수에 저장.
				//const value = e.target.dataset.pagenum; -> Vanilla JS 
				const value = $(this).data('pagenum'); // -> jQuery
				console.log(value);
				
				//페이지 버튼들을 감싸고 있는 form태그를 name으로 지목하여
				//그 안에 숨겨져 있는 pageNum이라는 input태그의 value에
				//위에서 얻은 data-pageNum의 값을 삽입 한 후 submit
				document.pageForm.pageNum.value = value;
				document.pageForm.submit();
				
			});
			
			
		}); //end jQuery
	</script>