# GitHub

GitHub là một công ty cung cấp dịch vụ lưu trữ code. Giống như Google Drive, Dropbox .. lưu trữ file, thì GitHub lưu trữ code cho các bạn.

# Cơ bản về GitHub 

## Tạo tài khoản
Tạo một tài khoản GitHub để đăng nhập tại github.com 

## Tạo Repository 
Ấn vào tạo 1 Repository và các bạn sẽ thấy sau khi tạo xong có hướng dẫn 4 5 lệnh đầu tiên gì đó. 

## Kết nối Repository với thư mục trên máy các bạn 
Cái này thì tuỳ Hệ điều hành. 

- Với MacOS: mở **Terminal** lên.<br>
- Với Window: mở **cmd** lên. <br>
`cd {thư mục chứa code}` <br>
`git init` <br>
`git remote add origin https://github.com/tên-đăng-nhập/tên-repository`<br>

## 
Chạy các lệnh sau:<br>
`cd {thư mục chứa code}` <br>
`git add . && git commit -m "tên commit"`<br>

## Sau mỗi phiên làm việc 
- Các bạn lưu lại toàn bộ thay đổi, và muốn những thay đổi này được đồng bộ lên Github. <br>
`cd {thư mục chứa code}` <br>
`git add .`<br>
`git commit -m "tên-commit"`<br>
`git push origin master`<br>

### Với NetBeans thì thư mục chứa code thường sẽ là:
- Trên window là thư mục <br>`C://User/thiennd/Documents/NetBeansProjects` 
- Trên macOS là thư mục <br>`/Users/thiennd/NetBeansProjects`

# Đồng bộ Github giữa hai máy

## Máy thứ nhất: Lưu trữ toàn bộ code và muốn đẩy code sang máy thứ 2 để làm việc tiếp 

- Bấm nút bật nguồn máy 2.
- Bám nút bật nguồn máy 1.
- Đồng bộ code từ máy 1 lên Github như hướng dẫn ở trên.
- Sang máy 2, mở trình duyệt tại repository vừa rồi.
- Bấm nút Clone or Download, copy cái link về.
- Mở thư mục muốn clone về, mở **CMD/Terminal** 
- `git clone {cái-link-vừa-copy}` 
- Dí dụ: `git clone https://github.com/codedidungso/basic-java-02`
### Vậy là oke rồi, code đã được pull về. 
Mỗi lần làm việc thì theo quy trình như sau:
+ Mở **Terminal/CMD**  
+ `git pull`
+ code cái gì đó hay ho 
+ `git add . && git commit -m "tên-commit`
+ `git push` 

Đó vậy thôi, nhớ pull code trước khi làm việc nếu không sẽ bị xung đột ở hai máy.