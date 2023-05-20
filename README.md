# PlayerTask

#### 介绍
一款有点好用的玩家任务插件的APi

#### API使用教程

要将本项目添加到您的构建中：

步骤1. 请将下列配置添加到您的 settings.xml 文件中：

```
<settings>
  <!-- omitted xml -->
  <profiles>
      <profile>
          <id>Repository Proxy</id>
          <activation>
              <activeByDefault>true</activeByDefault>
          </activation>
          <repositories>
              <repository>
                  <id>handyplus-minecraft-minecraft</id>
                  <name>minecraft</name>
                  <url>https://handyplus-maven.pkg.coding.net/repository/minecraft/minecraft/</url>
                  <releases>
                      <enabled>true</enabled>
                  </releases>
                  <snapshots>
                      <enabled>true</enabled>
                  </snapshots>
              </repository>
          </repositories>
      </profile>
  </profiles>
</settings>
```

步骤 2.请将以下配置添加到您的 pom.xml 文件中

```
<project>
  <dependencies>
      <dependency>
          <groupId>com.handy.playertask</groupId>
          <artifactId>PlayerTask</artifactId>
          <version>1.14.5</version>
      </dependency>
  </dependencies>
</project>
```

步骤 3. 请在命令行执行以下命令进行拉取：
```
mvn install
```

[javadoc](https://handy-git.github.io/PlayerTaskVersions/)
[github](https://github.com/handy-git/PlayerTaskVersions)