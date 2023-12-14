/**
* Pieces Isomorphic OpenAPI
* Endpoints for Assets, Formats, Users, Asset, Format, User.
*
* The version of the OpenAPI document: 1.0
* Contact: tsavo@pieces.app
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.piecesapp.client.models


import com.squareup.moshi.Json

/**
* 
* Values: csv,doc,docm,docx,exe,gif,ico,jpe,jpeg,jpg,jpgm,jpgv,log,mp2,mp2a,mp3,mp4,mp4a,oga,ogg,ogv,ogx,ppt,pptx,pptm,qt,text,tif,tiff,txt,wav,weba,webm,webp,xla,xlam,xlc,xlm,xls,xlsb,xlsm,xlsx,xlt,xltm,xltx,pdf,png,rpm,zip,woff,woff2,svg,svgz,bin,bmp,eot,gz,jar,mpkg,ai,eps,zsh,dmg,list,rtx,uri,uris,urls,css,dart,html,htm,java,js,json,jsonml,ps,ssml,wasm,xaml,rss,rtf,cco,pl,pm,xhtml,xml,ecma,node,php,py,pyc,`class`,cpp,cc,c,p,pas,curl,cxx,hh,mcurl,go,rs,sh,swift,ts,rb,cs,bat,coffee,erl,hs,lua,md,matlab,m,ps1,r,scala,sql,tex,yaml,toml
*/

enum class Ext(val value: kotlin.String){


    @Json(name = "csv")
    csv("csv"),


    @Json(name = "doc")
    doc("doc"),


    @Json(name = "docm")
    docm("docm"),


    @Json(name = "docx")
    docx("docx"),


    @Json(name = "exe")
    exe("exe"),


    @Json(name = "gif")
    gif("gif"),


    @Json(name = "ico")
    ico("ico"),


    @Json(name = "jpe")
    jpe("jpe"),


    @Json(name = "jpeg")
    jpeg("jpeg"),


    @Json(name = "jpg")
    jpg("jpg"),


    @Json(name = "jpgm")
    jpgm("jpgm"),


    @Json(name = "jpgv")
    jpgv("jpgv"),


    @Json(name = "log")
    log("log"),


    @Json(name = "mp2")
    mp2("mp2"),


    @Json(name = "mp2a")
    mp2a("mp2a"),


    @Json(name = "mp3")
    mp3("mp3"),


    @Json(name = "mp4")
    mp4("mp4"),


    @Json(name = "mp4a")
    mp4a("mp4a"),


    @Json(name = "oga")
    oga("oga"),


    @Json(name = "ogg")
    ogg("ogg"),


    @Json(name = "ogv")
    ogv("ogv"),


    @Json(name = "ogx")
    ogx("ogx"),


    @Json(name = "ppt")
    ppt("ppt"),


    @Json(name = "pptx")
    pptx("pptx"),


    @Json(name = "pptm")
    pptm("pptm"),


    @Json(name = "qt")
    qt("qt"),


    @Json(name = "text")
    text("text"),


    @Json(name = "tif")
    tif("tif"),


    @Json(name = "tiff")
    tiff("tiff"),


    @Json(name = "txt")
    txt("txt"),


    @Json(name = "wav")
    wav("wav"),


    @Json(name = "weba")
    weba("weba"),


    @Json(name = "webm")
    webm("webm"),


    @Json(name = "webp")
    webp("webp"),


    @Json(name = "xla")
    xla("xla"),


    @Json(name = "xlam")
    xlam("xlam"),


    @Json(name = "xlc")
    xlc("xlc"),


    @Json(name = "xlm")
    xlm("xlm"),


    @Json(name = "xls")
    xls("xls"),


    @Json(name = "xlsb")
    xlsb("xlsb"),


    @Json(name = "xlsm")
    xlsm("xlsm"),


    @Json(name = "xlsx")
    xlsx("xlsx"),


    @Json(name = "xlt")
    xlt("xlt"),


    @Json(name = "xltm")
    xltm("xltm"),


    @Json(name = "xltx")
    xltx("xltx"),


    @Json(name = "pdf")
    pdf("pdf"),


    @Json(name = "png")
    png("png"),


    @Json(name = "rpm")
    rpm("rpm"),


    @Json(name = "zip")
    zip("zip"),


    @Json(name = "woff")
    woff("woff"),


    @Json(name = "woff2")
    woff2("woff2"),


    @Json(name = "svg")
    svg("svg"),


    @Json(name = "svgz")
    svgz("svgz"),


    @Json(name = "bin")
    bin("bin"),


    @Json(name = "bmp")
    bmp("bmp"),


    @Json(name = "eot")
    eot("eot"),


    @Json(name = "gz")
    gz("gz"),


    @Json(name = "jar")
    jar("jar"),


    @Json(name = "mpkg")
    mpkg("mpkg"),


    @Json(name = "ai")
    ai("ai"),


    @Json(name = "eps")
    eps("eps"),


    @Json(name = "zsh")
    zsh("zsh"),


    @Json(name = "dmg")
    dmg("dmg"),


    @Json(name = "list")
    list("list"),


    @Json(name = "rtx")
    rtx("rtx"),


    @Json(name = "uri")
    uri("uri"),


    @Json(name = "uris")
    uris("uris"),


    @Json(name = "urls")
    urls("urls"),


    @Json(name = "css")
    css("css"),


    @Json(name = "dart")
    dart("dart"),


    @Json(name = "html")
    html("html"),


    @Json(name = "htm")
    htm("htm"),


    @Json(name = "java")
    java("java"),


    @Json(name = "js")
    js("js"),


    @Json(name = "json")
    json("json"),


    @Json(name = "jsonml")
    jsonml("jsonml"),


    @Json(name = "ps")
    ps("ps"),


    @Json(name = "ssml")
    ssml("ssml"),


    @Json(name = "wasm")
    wasm("wasm"),


    @Json(name = "xaml")
    xaml("xaml"),


    @Json(name = "rss")
    rss("rss"),


    @Json(name = "rtf")
    rtf("rtf"),


    @Json(name = "cco")
    cco("cco"),


    @Json(name = "pl")
    pl("pl"),


    @Json(name = "pm")
    pm("pm"),


    @Json(name = "xhtml")
    xhtml("xhtml"),


    @Json(name = "xml")
    xml("xml"),


    @Json(name = "ecma")
    ecma("ecma"),


    @Json(name = "node")
    node("node"),


    @Json(name = "php")
    php("php"),


    @Json(name = "py")
    py("py"),


    @Json(name = "pyc")
    pyc("pyc"),


    @Json(name = "class")
    `class`("class"),


    @Json(name = "cpp")
    cpp("cpp"),


    @Json(name = "cc")
    cc("cc"),


    @Json(name = "c")
    c("c"),


    @Json(name = "p")
    p("p"),


    @Json(name = "pas")
    pas("pas"),


    @Json(name = "curl")
    curl("curl"),


    @Json(name = "cxx")
    cxx("cxx"),


    @Json(name = "hh")
    hh("hh"),


    @Json(name = "mcurl")
    mcurl("mcurl"),


    @Json(name = "go")
    go("go"),


    @Json(name = "rs")
    rs("rs"),


    @Json(name = "sh")
    sh("sh"),


    @Json(name = "swift")
    swift("swift"),


    @Json(name = "ts")
    ts("ts"),


    @Json(name = "rb")
    rb("rb"),


    @Json(name = "cs")
    cs("cs"),


    @Json(name = "bat")
    bat("bat"),


    @Json(name = "coffee")
    coffee("coffee"),


    @Json(name = "erl")
    erl("erl"),


    @Json(name = "hs")
    hs("hs"),


    @Json(name = "lua")
    lua("lua"),


    @Json(name = "md")
    md("md"),


    @Json(name = "matlab")
    matlab("matlab"),


    @Json(name = "m")
    m("m"),


    @Json(name = "ps1")
    ps1("ps1"),


    @Json(name = "r")
    r("r"),


    @Json(name = "scala")
    scala("scala"),


    @Json(name = "sql")
    sql("sql"),


    @Json(name = "tex")
    tex("tex"),


    @Json(name = "yaml")
    yaml("yaml"),


    @Json(name = "toml")
    toml("toml");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}

