1.linux中新建文件
	使用cat>>filename创建文件，以系文件属性作为新文件的属性并接受键盘输入作为文件的内容。输入结束时使用保存输入内容并退出。如果仅仅使用cat filename，中间没有">>"符号，则是打开文件，如果文件不存在
则会报文件不存在错误。
	使用cat file1 file2>>file3命令可以将多个文件的内容合并到一个新文件中。
	使用touch filename创建文件，touch命令主要用于修改文件的访问和修改时间属性，当文件不存在时，创建一个空的文件并且以当前时间作为访问和修改时间属性值。
	使用touch -r file1 file2创建文件，以file1的访问和修改时间属性值创建文件file2。

2.git项目忽略某些文件
	在项目根目录中创建.gitignore文件，在该文件中使用正则表达式配置需要忽略的文件和目录。如果文件已经已经被提交了或跟踪了则不能被忽略。

3.git添加或删除远程项目地址
	添加：git remote add origin project-url。
	删除：git remote rm origin。
