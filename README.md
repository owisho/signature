# signature此工程为java签名学习
doc目录存放了测试文件相关<br />
其他目录为代码源文件<br />


##使用命令签名时用到的命令为(windows)
1.打jar包命令：jar cvf xxx.jar packagename\javaname.class<br />  
2.生成保存秘钥对的文件：keytool -genkey -alias friend -keypass friend4life -validity 10000 -keystore ijvmkeys<br />
命令说明：-validity 10000这个命令行说明这个名秘钥对将在10000天之内有效<br />
其中生成ijvmkeys这个密钥对存储文件时，需要赋值一个密码，书中例子赋予的密码为：ijvm2ed<br />
3.使用私钥对jar包进行签名：jarsigner -keystore ijvmkeys -storepass ijvm2ed -keypass friend4life xxx.jar friend<br />
4.生成一个策略文件：参见项目路径中policyfile.txt
5.运行测试的基本命令java -Djava.security.manager -Djava.security.policy=policyfile.txt -cp example1a.jar;friend.jar;<br />
stranger.jar;example2a.jar;doer.jar per.owisho.signature.security.ex2.Example2a <br />
