一、使用方法
1、在pom文件的project中添加下面内容
<build>
        <plugins>
            <!-- mybatis generator 插件 -->
            <plugin>
                <groupId>org.mybatis.generator</groupId>
                <artifactId>mybatis-generator-maven-plugin</artifactId>
                <version>1.3.6-SNAPSHOT</version>
                <configuration>
                    <verbose>true</verbose>
                    <overwrite>true</overwrite>
                    <configurationFile>src/tool/mbg.xml</configurationFile>
                </configuration>
                <dependencies>
                    <dependency>
                        <groupId>org.mybatis.generator</groupId>
                        <artifactId>mybatis-generator-core</artifactId>
                        <version>1.3.7-SNAPSHOT</version>
                    </dependency>
                </dependencies>
            </plugin>
        </plugins>

    </build>
2、把mbg.xml放到src/tool/目录下

===============================================华丽的分割线==================================================================

二、修改内容
1、添加lombak
2、删除GET和SET方法
3、去掉xml中多余的注释
4、model 文件名称添加Do后缀
5、只生成根据主键查询数据、插入数据、根据主键更新数据这三条语句
