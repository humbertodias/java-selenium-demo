# Java con Selenium

Aplicación Java usando Selenium con HTMLUtil y PhantomJS


## Prerequisitos

1. Maven 3+
2. Java 8+
3. PhantonJS

## Como correr

1. Clon

	```
	git clone https://github.com/humbertodias/java-selenium-demo.git
	```

2. Entrar en la carpeta

	```
	cd java-selenium-demo
	```

3. Correr 

en terminal

```
mvn exec:java -Dexec.mainClass="htmldriver.HtmlUtilTest"
```

o

```
mvn exec:java -Dexec.mainClass="htmldriver.PhantomJSTest"
```

#![](doc/output-cmd.png)


## Referencias

[Selenium Example](http://www.guru99.com/selenium-with-htmlunit-driver-phantomjs.html)