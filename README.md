# Daily-training
Some personal learning experience
Git:
版本控制：多人开发必备
分类：本地版本控制
		集中版本控制  SVN
		分布式版本控制  Git 每个人拥有全部的代码
Git和SVN的主要区别：
Git Bash：Unix和Linux风格的命令行，推荐
Git CMD：Windows风格的命令行
Git GUI：图形界面的git
常见的linux命令：
cd 改变目录
cd .. 回退到上一个目录
pwd 显示当前目录路径
clear 清屏
reset 重新初始化终端
ls 列出当前目录中的所有文件
touch 新建一个文件
rm 删除一个文件
mkdir 新建一个目录，即文件夹
rm –r 删除一个文件夹
rm-rf / 删除电脑全部文件，不能使用！
mv 移动文件
history 历史命令
exit 退出
Cit基本理论
工作区域：
Workspace：工作区，存放项目代码文件
Index/Stage：暂存区，临时存放你的改动，实质是一个文件
Repository: 仓库区，安全存放数据的位置
Remote：远程仓库，托管代码的服务器
工作流程：
1.在工作目录中添加、修改文件   UserMapper.xml
2.将需要进行版本管理的文件放入暂存区   git add
3.将暂存区的文件提交到git仓库  git commit
4.推送到远程仓库   push
Git项目搭建
1.本地仓库搭建
1.1 创建一个全新的git代码库
$ git init
1.2 克隆远程仓库
$ git clone https://github.com/auroraljg/Daily-training.git
2.git文件操作
文件状态
Untracked:未跟踪，文件处于文件夹中
Unmodify:文件已经入库，未修改，即版本库文件与文件夹文件完全一致
Modified:文件已经修改
Staged：暂存状态，
查看文件状态
Git status  查看当前目录全部文件状态
Git status [filename] 查看指定文件状态
Git add . 添加所有文件到暂存区
Git commit –m “filename”  提交暂存区文件内容到本地区 
忽略文件
在主目录下建立”.gitignore”文件，规则如下：
1.忽略文件中的空行以及以(#)开始的行
2.使用linus通配符：(*)表任意字符，(?)表一个字符，([abc])表可选字符范围，({string1,string2,…})表可选的字符串
3.名称前带！表例外规则
4.名称前带/，表示忽略的文件在此目录下，而子目录中的文件不忽略
5.名称后带/，表示忽略的是该目录下的该名称的子目录
使用码云：gitee
Git常见命令：
1.git status
查看仓库的状态
2.git init
初始化git仓库，新建了一个.git文件夹
3.git add 文件信息
将文件初始化提交到临时缓冲区
4.git commit –m “文件信息”
将处于缓冲区文件提交到git仓库
5.git log
打印git仓库提交日志
6.git branch
查看git仓库的分支情况
	git branch a  创建一个名为a的分支
7.git checkout 分支名
切换到a分支
	git checkout –b b 创建一个新的分支b(b为当前分支的子分支)并且切换到它
8.git merge 分支名
将该分支合并到当前所处的分支下
9.git branch –d(D) 分支名
删除某一个分支
10.git tag **
为当前分支添加标签
	Git tag 可查看标签记录
通过git将代码提交到GitHub中
push  推，将本地代码推到远程的的仓库
		git push origin master
pull   拉，将远程的代码拉到本地
 		git pull origin master
一般在push之前进行pull操作，以防冲突
1.本地没有git仓库
1.1 找到准备存储git仓库的目录，从此目录进入git bash，
	输入 git clone 远程仓库地址
1.2 将待传输的文件复制进git仓库，输入 git status 查看文件状态，
	输入git add 文件名 操作，输入 git status 查看文件状态，
再输入git commit –m “commit  文件名”， 输入 git status 查看文件状态，
	最后输入git push origin master(或main，即主分支名)
	第一次提交时许输入账号密码，验证
2.本地有git仓库
2.1本地仓库首先是初始化的仓库，git init
2.2关联远程仓库 git remote add origin 远程仓库地址 ，origin为远程仓库名字。你也可以指定选项 git remote-v，会显示需要读写远程仓库使用的 Git 保存的简写与其对应的 URL
2.3 git pull origin main(master) ，同步远程仓库和本地仓库，并且检查一番
2.4将待传输的文件复制进本地仓库，输入 git status 查看文件状态，
	输入git add 文件名 操作，输入 git status 查看文件状态，
再输入git commit –m “commit  文件名”， 输入 git status 查看文件状态，
	最后输入git push origin master(或main，即主分支名)
若干补充
1.查看repo数据
针对开源项目，清晰查看其commit记录，点击项目中的insights中的contribute
2.查看技术趋势
点击explor，trending
3.按条件搜索开源项目
搜索关键字 java stars:>500
删除仓库中文件或文件夹
只删除GitHub中的文件夹或文件
	在同步两边仓库后，dir 查看当前仓库中文件。使用 git rm –r –-cached 文件名 删除指定文件，使用git commit –m ‘del’ 上传操作行为，最后git push –u origin master 操作即可。

