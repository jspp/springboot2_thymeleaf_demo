### 基础语法

####变量表达式

使用方法：直接使用th:xx = "${}" 获取对象属性 

#### 选择变量表达式 *{}

使用方法：首先通过th:object 获取对象，然后使用th:xx = "*{}"获取对象属性。

#### 链接表达式 @{}

#### 使用方法：通过链接表达式@{}直接拿到应用路径，然后拼接静态资源路径。
 
####  其它表达式
在基础语法中，默认支持字符串连接、数学运算、布尔逻辑和三目运算等。例如：
<input name="name" th:value="${'I am '+(user.name!=null?user.name:'NoBody')}"/>

### 内置对象
 