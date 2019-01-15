# myBatisGeneratorPlugins

通过数据字段备注直接生成对应的@ApiModelProperty和@JsonProperty

-------------------------------------------------
#### 效果案例
    @ApiModelProperty(value="订单编号")
    @JsonProperty("order_id")
    private String orderId;
    
    

#### 怎么引入到项目中
``` xml
<!-- maven  -->
<build>
    <finalName>common-core</finalName>
    <!--  ...  -->
     <plugins>
         <!--mybatis 逆向工程插件-->
         <plugin>
             <groupId>org.mybatis.generator</groupId>
             <artifactId>mybatis-generator-maven-plugin</artifactId>
             <version>1.3.5</version>
             <configuration>
                 <verbose>true</verbose>
                 <overwrite>true</overwrite>
             </configuration>
             <dependencies>
                 <dependency>
                    <groupId>com.mybatis.plugins</groupId>
                    <artifactId>mybatis-generator-plugins</artifactId>
                    <version>1.0.0-SNAPSHOT</version>
                 </dependency>
                 <dependency>
                 <groupId>mysql</groupId>
                 <artifactId>mysql-connector-java</artifactId>
                 <version>5.1.40</version>
                 </dependency>
             </dependencies>
         </plugin>
     </plugins>
  </build>
```
 
然后在generatorConfig.xml 中 加入`<plugin type="mybatis.generator.plugins.GeneratorSwagger2Doc"/>`

```
<context id="xxx-api">
    <plugin type="mybatis.generator.plugins.GeneratorSwagger2Doc"/>
   ......
</context>  
 ```
-------------------------------------
 
