<!--
模板引擎Freemarker
-->
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" />
    <title></title>
</head>
<body>
接收到数据name:${name}

<#if (age>18) > <!--if条件判断-->
    已成年
    <#else>
    未成年
</#if>

<#list address as addres> <!--拿出List的数据-->
    ${addres}
</#list>

</body>
</html>