framework chia ra gồm 5 layers

	1. testcases : chứa những chức năng/module cần auto trong dự án
	2. testdata : chứa data test cho toàn bộ layer testcases
	3. actions : 
			- chứa phần core của framework	(commons/ultils...)
				 + AbstractPage : hàm wapper cho pageObjects 
				 + AbstractTest : hàm wapper cho tầng testcases 
				 + Constants	: thông tin dùng chung cho project
			- chứa pagekage pageObjects
				 + chứa những class - quản lý chức năng theo từng 1 page ( LoginPageObject,DashboardPageObject,...)
			- chứa những pagekage khác : 
				 + reportConfig
				 + logConfig
				 + listenerConfig
				 ...
	
	4. resources : Quản lí các external file cho toàn bộ framework
	5. testsuites : chứa các bộ test suite để chạy.
				 		