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
package org.openapitools.client.models


import com.squareup.moshi.Json

/**
* 
* Values: csx,cs,html,htm,shtml,xhtml,hs,hsMinusBoot,hsig,cpp,cc,cp,cxx,c,h,hh,hpp,hxx,inl,ipp,ixx,cppm,csv,doc,docm,docx,exe,gif,ico,jpe,jpeg,jpg,jpgm,jpgv,log,mp2,mp2a,mp3,mp4,mp4a,oga,ogg,ogv,ogx,ppt,pptx,pptm,qt,text,tif,tiff,txt,wav,weba,webm,webp,xla,xlam,xlc,xlm,xls,xlsb,xlsm,xlsx,xlt,xltm,xltx,pdf,png,rpm,zip,woff,woff2,svgz,bin,bmp,eot,gz,jar,mpkg,ai,eps,dmg,list,rtx,uri,uris,urls,css,dart,java,bsh,js,jsx,mjs,htc,json,ipynb,gltf,jsonml,ps,ssml,wasm,rtf,cco,pl,pc,pm,pmc,pod,t,xml,tld,dtml,rng,rss,opml,svg,xaml,sublimeMinusSnippet,tmLanguage,tmPreferences,tmSnippet,tmTheme,csproj,fsproj,sqlproj,vbproj,vcproj,vcxproj,dae,props,targets,xsd,xsl,xslt,ecma,node,php,php3,php4,php5,php7,php8,phps,phpt,phtml,py,py3,pyw,pyi,pyx,pyxPeriodIn,pxd,pxdPeriodIn,pxi,pxiPeriodIn,rpy,cpy,gyp,gypi,vpy,smk,wscript,bazel,bzl,pyc,`class`,p,pas,curl,mcurl,go,swift,rs,ts,tsx,rb,rbi,rbx,rjs,rabl,rake,capfile,jbuilder,gemspec,podspec,irbrc,pryrc,prawn,thor,appfile,appraisals,berksfile,brewfile,cheffile,deliverfile,fastfile,gemfile,guardfile,podfile,rakefile,rantfile,scanfile,simplecov,snapfile,thorfile,vagrantfile,scala,sbt,sc,cmd,bat,coffee,erl,hrl,escript,lua,md,mdown,mdwn,markdown,markdn,matlab,m,ps1,sh,bash,bashrc,ash,zsh,periodBashAliases,periodBashCompletions,periodBashFunctions,periodBashLogin,periodBashLogout,periodBashProfile,periodBashVariables,periodProfile,periodTextmateInit,periodZlogin,periodZlogout,periodZprofile,periodZshenv,periodZshrc,pKGBUILD,ebuild,eclass,r,sql,ddl,dml,tex,ltx,sty,cls,uNKNOWN,yaml,yml,toml,tml,cargoPeriodLock,gopkgPeriodLock,pipfile,poetryPeriodLock,uniformResourceLocator,customUrlScheme,unixFilePath,windowsFilePath,uniformResourceIdentifier,hljsMinus1c,hljsMinusAbnf,hljsMinusAccesslog,hljsMinusActionscript,hljsMinusAda,hljsMinusAngelscript,hljsMinusApache,hljsMinusApplescript,hljsMinusArcade,hljsMinusArduino,hljsMinusArmasm,hljsMinusAsciidoc,hljsMinusAspectj,hljsMinusAutohotkey,hljsMinusAutoit,hljsMinusAvrasm,hljsMinusAwk,hljsMinusAxapta,hljsMinusBash,hljsMinusBasic,hljsMinusBnf,hljsMinusBrainfuck,hljsMinusCal,hljsMinusCapnproto,hljsMinusCeylon,hljsMinusClean,hljsMinusClojureMinusRepl,hljsMinusClojure,hljsMinusCmake,hljsMinusCoffeescript,hljsMinusCoq,hljsMinusCos,hljsMinusCpp,hljsMinusCrmsh,hljsMinusCrystal,hljsMinusC,hljsMinusCs,hljsMinusCsp,hljsMinusCss,hljsMinusD,hljsMinusDart,hljsMinusDelphi,hljsMinusDiff,hljsMinusDjango,hljsMinusDns,hljsMinusDockerfile,hljsMinusDos,hljsMinusDsconfig,hljsMinusDts,hljsMinusDust,hljsMinusEbnf,hljsMinusElixir,hljsMinusElm,hljsMinusErb,hljsMinusErlangMinusRepl,hljsMinusErlang,hljsMinusExcel,hljsMinusFix,hljsMinusFlix,hljsMinusFortran,hljsMinusFsharp,hljsMinusGams,hljsMinusGauss,hljsMinusGcode,hljsMinusGherkin,hljsMinusGlsl,hljsMinusGml,hljsMinusGo,hljsMinusGolo,hljsMinusGradle,hljsMinusGroovy,hljsMinusHaml,hljsMinusHandlebars,hljsMinusHaskell,hljsMinusHaxe,hljsMinusHsp,hljsMinusHtmlbars,hljsMinusHttp,hljsMinusHy,hljsMinusInform7,hljsMinusIni,hljsMinusIrpf90,hljsMinusIsbl,hljsMinusJava,hljsMinusJavascript,hljsMinusJbossMinusCli,hljsMinusJson,hljsMinusJuliaMinusRepl,hljsMinusJulia,hljsMinusKotlin,hljsMinusLasso,hljsMinusLdif,hljsMinusLeaf,hljsMinusLess,hljsMinusLisp,hljsMinusLivecodeserver,hljsMinusLivescript,hljsMinusLlvm,hljsMinusLsl,hljsMinusLua,hljsMinusMakefile,hljsMinusMarkdown,hljsMinusMathematica,hljsMinusMatlab,hljsMinusMaxima,hljsMinusMel,hljsMinusMercury,hljsMinusMipsasm,hljsMinusMizar,hljsMinusMojolicious,hljsMinusMonkey,hljsMinusMoonscript,hljsMinusN1ql,hljsMinusNginx,hljsMinusNimrod,hljsMinusNix,hljsMinusNsis,hljsMinusObjectivec,hljsMinusOcaml,hljsMinusOpenscad,hljsMinusOxygene,hljsMinusParser3,hljsMinusPerl,hljsMinusPf,hljsMinusPgsql,hljsMinusPhp,hljsMinusPlaintext,hljsMinusPony,hljsMinusPowershell,hljsMinusProcessing,hljsMinusProfile,hljsMinusProlog,hljsMinusProperties,hljsMinusProtobuf,hljsMinusPuppet,hljsMinusPurebasic,hljsMinusPython,hljsMinusQ,hljsMinusQml,hljsMinusR,hljsMinusReasonml,hljsMinusRib,hljsMinusRoboconf,hljsMinusRouteros,hljsMinusRsl,hljsMinusRuby,hljsMinusRuleslanguage,hljsMinusRust,hljsMinusSas,hljsMinusScala,hljsMinusScheme,hljsMinusScilab,hljsMinusScss,hljsMinusShell,hljsMinusSmali,hljsMinusSmalltalk,hljsMinusSml,hljsMinusSqf,hljsMinusSql,hljsMinusStan,hljsMinusStata,hljsMinusStep21,hljsMinusStylus,hljsMinusSubunit,hljsMinusSwift,hljsMinusTaggerscript,hljsMinusTap,hljsMinusTcl,hljsMinusTex,hljsMinusThrift,hljsMinusTp,hljsMinusTwig,hljsMinusTypescript,hljsMinusVala,hljsMinusVbnet,hljsMinusVbscriptMinusHtml,hljsMinusVbscript,hljsMinusVerilog,hljsMinusVhdl,hljsMinusVim,hljsMinusX86asm,hljsMinusXl,hljsMinusXml,hljsMinusXquery,hljsMinusYaml,hljsMinusToml,hljsMinusZephir,hljsMinusHtml,groovy,kt,el,clj,ex,adb,ads,agda,elm,exs,glsl,ml,lean,lisp,rkt,sparql,vhdl,zig,dockerfile,f03,f08,f18,f90,f95,jl,mm,scm,sol,sv,asp,cfm,fs,fsi,fsx
*/

enum class ClassificationSpecificEnum(val value: kotlin.String){


    @Json(name = "csx")
    csx("csx"),


    @Json(name = "cs")
    cs("cs"),


    @Json(name = "html")
    html("html"),


    @Json(name = "htm")
    htm("htm"),


    @Json(name = "shtml")
    shtml("shtml"),


    @Json(name = "xhtml")
    xhtml("xhtml"),


    @Json(name = "hs")
    hs("hs"),


    @Json(name = "hs-boot")
    hsMinusBoot("hs-boot"),


    @Json(name = "hsig")
    hsig("hsig"),


    @Json(name = "cpp")
    cpp("cpp"),


    @Json(name = "cc")
    cc("cc"),


    @Json(name = "cp")
    cp("cp"),


    @Json(name = "cxx")
    cxx("cxx"),


    @Json(name = "c")
    c("c"),


    @Json(name = "h")
    h("h"),


    @Json(name = "hh")
    hh("hh"),


    @Json(name = "hpp")
    hpp("hpp"),


    @Json(name = "hxx")
    hxx("hxx"),


    @Json(name = "inl")
    inl("inl"),


    @Json(name = "ipp")
    ipp("ipp"),


    @Json(name = "ixx")
    ixx("ixx"),


    @Json(name = "cppm")
    cppm("cppm"),


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


    @Json(name = "java")
    java("java"),


    @Json(name = "bsh")
    bsh("bsh"),


    @Json(name = "js")
    js("js"),


    @Json(name = "jsx")
    jsx("jsx"),


    @Json(name = "mjs")
    mjs("mjs"),


    @Json(name = "htc")
    htc("htc"),


    @Json(name = "json")
    json("json"),


    @Json(name = "ipynb")
    ipynb("ipynb"),


    @Json(name = "gltf")
    gltf("gltf"),


    @Json(name = "jsonml")
    jsonml("jsonml"),


    @Json(name = "ps")
    ps("ps"),


    @Json(name = "ssml")
    ssml("ssml"),


    @Json(name = "wasm")
    wasm("wasm"),


    @Json(name = "rtf")
    rtf("rtf"),


    @Json(name = "cco")
    cco("cco"),


    @Json(name = "pl")
    pl("pl"),


    @Json(name = "pc")
    pc("pc"),


    @Json(name = "pm")
    pm("pm"),


    @Json(name = "pmc")
    pmc("pmc"),


    @Json(name = "pod")
    pod("pod"),


    @Json(name = "t")
    t("t"),


    @Json(name = "xml")
    xml("xml"),


    @Json(name = "tld")
    tld("tld"),


    @Json(name = "dtml")
    dtml("dtml"),


    @Json(name = "rng")
    rng("rng"),


    @Json(name = "rss")
    rss("rss"),


    @Json(name = "opml")
    opml("opml"),


    @Json(name = "svg")
    svg("svg"),


    @Json(name = "xaml")
    xaml("xaml"),


    @Json(name = "sublime-snippet")
    sublimeMinusSnippet("sublime-snippet"),


    @Json(name = "tmLanguage")
    tmLanguage("tmLanguage"),


    @Json(name = "tmPreferences")
    tmPreferences("tmPreferences"),


    @Json(name = "tmSnippet")
    tmSnippet("tmSnippet"),


    @Json(name = "tmTheme")
    tmTheme("tmTheme"),


    @Json(name = "csproj")
    csproj("csproj"),


    @Json(name = "fsproj")
    fsproj("fsproj"),


    @Json(name = "sqlproj")
    sqlproj("sqlproj"),


    @Json(name = "vbproj")
    vbproj("vbproj"),


    @Json(name = "vcproj")
    vcproj("vcproj"),


    @Json(name = "vcxproj")
    vcxproj("vcxproj"),


    @Json(name = "dae")
    dae("dae"),


    @Json(name = "props")
    props("props"),


    @Json(name = "targets")
    targets("targets"),


    @Json(name = "xsd")
    xsd("xsd"),


    @Json(name = "xsl")
    xsl("xsl"),


    @Json(name = "xslt")
    xslt("xslt"),


    @Json(name = "ecma")
    ecma("ecma"),


    @Json(name = "node")
    node("node"),


    @Json(name = "php")
    php("php"),


    @Json(name = "php3")
    php3("php3"),


    @Json(name = "php4")
    php4("php4"),


    @Json(name = "php5")
    php5("php5"),


    @Json(name = "php7")
    php7("php7"),


    @Json(name = "php8")
    php8("php8"),


    @Json(name = "phps")
    phps("phps"),


    @Json(name = "phpt")
    phpt("phpt"),


    @Json(name = "phtml")
    phtml("phtml"),


    @Json(name = "py")
    py("py"),


    @Json(name = "py3")
    py3("py3"),


    @Json(name = "pyw")
    pyw("pyw"),


    @Json(name = "pyi")
    pyi("pyi"),


    @Json(name = "pyx")
    pyx("pyx"),


    @Json(name = "pyx.in")
    pyxPeriodIn("pyx.in"),


    @Json(name = "pxd")
    pxd("pxd"),


    @Json(name = "pxd.in")
    pxdPeriodIn("pxd.in"),


    @Json(name = "pxi")
    pxi("pxi"),


    @Json(name = "pxi.in")
    pxiPeriodIn("pxi.in"),


    @Json(name = "rpy")
    rpy("rpy"),


    @Json(name = "cpy")
    cpy("cpy"),


    @Json(name = "gyp")
    gyp("gyp"),


    @Json(name = "gypi")
    gypi("gypi"),


    @Json(name = "vpy")
    vpy("vpy"),


    @Json(name = "smk")
    smk("smk"),


    @Json(name = "wscript")
    wscript("wscript"),


    @Json(name = "bazel")
    bazel("bazel"),


    @Json(name = "bzl")
    bzl("bzl"),


    @Json(name = "pyc")
    pyc("pyc"),


    @Json(name = "class")
    `class`("class"),


    @Json(name = "p")
    p("p"),


    @Json(name = "pas")
    pas("pas"),


    @Json(name = "curl")
    curl("curl"),


    @Json(name = "mcurl")
    mcurl("mcurl"),


    @Json(name = "go")
    go("go"),


    @Json(name = "swift")
    swift("swift"),


    @Json(name = "rs")
    rs("rs"),


    @Json(name = "ts")
    ts("ts"),


    @Json(name = "tsx")
    tsx("tsx"),


    @Json(name = "rb")
    rb("rb"),


    @Json(name = "rbi")
    rbi("rbi"),


    @Json(name = "rbx")
    rbx("rbx"),


    @Json(name = "rjs")
    rjs("rjs"),


    @Json(name = "rabl")
    rabl("rabl"),


    @Json(name = "rake")
    rake("rake"),


    @Json(name = "capfile")
    capfile("capfile"),


    @Json(name = "jbuilder")
    jbuilder("jbuilder"),


    @Json(name = "gemspec")
    gemspec("gemspec"),


    @Json(name = "podspec")
    podspec("podspec"),


    @Json(name = "irbrc")
    irbrc("irbrc"),


    @Json(name = "pryrc")
    pryrc("pryrc"),


    @Json(name = "prawn")
    prawn("prawn"),


    @Json(name = "thor")
    thor("thor"),


    @Json(name = "Appfile")
    appfile("Appfile"),


    @Json(name = "Appraisals")
    appraisals("Appraisals"),


    @Json(name = "Berksfile")
    berksfile("Berksfile"),


    @Json(name = "Brewfile")
    brewfile("Brewfile"),


    @Json(name = "Cheffile")
    cheffile("Cheffile"),


    @Json(name = "Deliverfile")
    deliverfile("Deliverfile"),


    @Json(name = "Fastfile")
    fastfile("Fastfile"),


    @Json(name = "Gemfile")
    gemfile("Gemfile"),


    @Json(name = "Guardfile")
    guardfile("Guardfile"),


    @Json(name = "Podfile")
    podfile("Podfile"),


    @Json(name = "Rakefile")
    rakefile("Rakefile"),


    @Json(name = "Rantfile")
    rantfile("Rantfile"),


    @Json(name = "Scanfile")
    scanfile("Scanfile"),


    @Json(name = "simplecov")
    simplecov("simplecov"),


    @Json(name = "Snapfile")
    snapfile("Snapfile"),


    @Json(name = "Thorfile")
    thorfile("Thorfile"),


    @Json(name = "Vagrantfile")
    vagrantfile("Vagrantfile"),


    @Json(name = "scala")
    scala("scala"),


    @Json(name = "sbt")
    sbt("sbt"),


    @Json(name = "sc")
    sc("sc"),


    @Json(name = "cmd")
    cmd("cmd"),


    @Json(name = "bat")
    bat("bat"),


    @Json(name = "coffee")
    coffee("coffee"),


    @Json(name = "erl")
    erl("erl"),


    @Json(name = "hrl")
    hrl("hrl"),


    @Json(name = "escript")
    escript("escript"),


    @Json(name = "lua")
    lua("lua"),


    @Json(name = "md")
    md("md"),


    @Json(name = "mdown")
    mdown("mdown"),


    @Json(name = "mdwn")
    mdwn("mdwn"),


    @Json(name = "markdown")
    markdown("markdown"),


    @Json(name = "markdn")
    markdn("markdn"),


    @Json(name = "matlab")
    matlab("matlab"),


    @Json(name = "m")
    m("m"),


    @Json(name = "ps1")
    ps1("ps1"),


    @Json(name = "sh")
    sh("sh"),


    @Json(name = "bash")
    bash("bash"),


    @Json(name = "bashrc")
    bashrc("bashrc"),


    @Json(name = "ash")
    ash("ash"),


    @Json(name = "zsh")
    zsh("zsh"),


    @Json(name = ".bash_aliases")
    periodBashAliases(".bash_aliases"),


    @Json(name = ".bash_completions")
    periodBashCompletions(".bash_completions"),


    @Json(name = ".bash_functions")
    periodBashFunctions(".bash_functions"),


    @Json(name = ".bash_login")
    periodBashLogin(".bash_login"),


    @Json(name = ".bash_logout")
    periodBashLogout(".bash_logout"),


    @Json(name = ".bash_profile")
    periodBashProfile(".bash_profile"),


    @Json(name = ".bash_variables")
    periodBashVariables(".bash_variables"),


    @Json(name = ".profile")
    periodProfile(".profile"),


    @Json(name = ".textmate_init")
    periodTextmateInit(".textmate_init"),


    @Json(name = ".zlogin")
    periodZlogin(".zlogin"),


    @Json(name = ".zlogout")
    periodZlogout(".zlogout"),


    @Json(name = ".zprofile")
    periodZprofile(".zprofile"),


    @Json(name = ".zshenv")
    periodZshenv(".zshenv"),


    @Json(name = ".zshrc")
    periodZshrc(".zshrc"),


    @Json(name = "PKGBUILD")
    pKGBUILD("PKGBUILD"),


    @Json(name = "ebuild")
    ebuild("ebuild"),


    @Json(name = "eclass")
    eclass("eclass"),


    @Json(name = "r")
    r("r"),


    @Json(name = "sql")
    sql("sql"),


    @Json(name = "ddl")
    ddl("ddl"),


    @Json(name = "dml")
    dml("dml"),


    @Json(name = "tex")
    tex("tex"),


    @Json(name = "ltx")
    ltx("ltx"),


    @Json(name = "sty")
    sty("sty"),


    @Json(name = "cls")
    cls("cls"),


    @Json(name = "UNKNOWN")
    uNKNOWN("UNKNOWN"),


    @Json(name = "yaml")
    yaml("yaml"),


    @Json(name = "yml")
    yml("yml"),


    @Json(name = "toml")
    toml("toml"),


    @Json(name = "tml")
    tml("tml"),


    @Json(name = "Cargo.lock")
    cargoPeriodLock("Cargo.lock"),


    @Json(name = "Gopkg.lock")
    gopkgPeriodLock("Gopkg.lock"),


    @Json(name = "Pipfile")
    pipfile("Pipfile"),


    @Json(name = "poetry.lock")
    poetryPeriodLock("poetry.lock"),


    @Json(name = "uniform_resource_locator")
    uniformResourceLocator("uniform_resource_locator"),


    @Json(name = "custom_url_scheme")
    customUrlScheme("custom_url_scheme"),


    @Json(name = "unix_file_path")
    unixFilePath("unix_file_path"),


    @Json(name = "windows_file_path")
    windowsFilePath("windows_file_path"),


    @Json(name = "uniform_resource_identifier")
    uniformResourceIdentifier("uniform_resource_identifier"),


    @Json(name = "hljs-1c")
    hljsMinus1c("hljs-1c"),


    @Json(name = "hljs-abnf")
    hljsMinusAbnf("hljs-abnf"),


    @Json(name = "hljs-accesslog")
    hljsMinusAccesslog("hljs-accesslog"),


    @Json(name = "hljs-actionscript")
    hljsMinusActionscript("hljs-actionscript"),


    @Json(name = "hljs-ada")
    hljsMinusAda("hljs-ada"),


    @Json(name = "hljs-angelscript")
    hljsMinusAngelscript("hljs-angelscript"),


    @Json(name = "hljs-apache")
    hljsMinusApache("hljs-apache"),


    @Json(name = "hljs-applescript")
    hljsMinusApplescript("hljs-applescript"),


    @Json(name = "hljs-arcade")
    hljsMinusArcade("hljs-arcade"),


    @Json(name = "hljs-arduino")
    hljsMinusArduino("hljs-arduino"),


    @Json(name = "hljs-armasm")
    hljsMinusArmasm("hljs-armasm"),


    @Json(name = "hljs-asciidoc")
    hljsMinusAsciidoc("hljs-asciidoc"),


    @Json(name = "hljs-aspectj")
    hljsMinusAspectj("hljs-aspectj"),


    @Json(name = "hljs-autohotkey")
    hljsMinusAutohotkey("hljs-autohotkey"),


    @Json(name = "hljs-autoit")
    hljsMinusAutoit("hljs-autoit"),


    @Json(name = "hljs-avrasm")
    hljsMinusAvrasm("hljs-avrasm"),


    @Json(name = "hljs-awk")
    hljsMinusAwk("hljs-awk"),


    @Json(name = "hljs-axapta")
    hljsMinusAxapta("hljs-axapta"),


    @Json(name = "hljs-bash")
    hljsMinusBash("hljs-bash"),


    @Json(name = "hljs-basic")
    hljsMinusBasic("hljs-basic"),


    @Json(name = "hljs-bnf")
    hljsMinusBnf("hljs-bnf"),


    @Json(name = "hljs-brainfuck")
    hljsMinusBrainfuck("hljs-brainfuck"),


    @Json(name = "hljs-cal")
    hljsMinusCal("hljs-cal"),


    @Json(name = "hljs-capnproto")
    hljsMinusCapnproto("hljs-capnproto"),


    @Json(name = "hljs-ceylon")
    hljsMinusCeylon("hljs-ceylon"),


    @Json(name = "hljs-clean")
    hljsMinusClean("hljs-clean"),


    @Json(name = "hljs-clojure-repl")
    hljsMinusClojureMinusRepl("hljs-clojure-repl"),


    @Json(name = "hljs-clojure")
    hljsMinusClojure("hljs-clojure"),


    @Json(name = "hljs-cmake")
    hljsMinusCmake("hljs-cmake"),


    @Json(name = "hljs-coffeescript")
    hljsMinusCoffeescript("hljs-coffeescript"),


    @Json(name = "hljs-coq")
    hljsMinusCoq("hljs-coq"),


    @Json(name = "hljs-cos")
    hljsMinusCos("hljs-cos"),


    @Json(name = "hljs-cpp")
    hljsMinusCpp("hljs-cpp"),


    @Json(name = "hljs-crmsh")
    hljsMinusCrmsh("hljs-crmsh"),


    @Json(name = "hljs-crystal")
    hljsMinusCrystal("hljs-crystal"),


    @Json(name = "hljs-c")
    hljsMinusC("hljs-c"),


    @Json(name = "hljs-cs")
    hljsMinusCs("hljs-cs"),


    @Json(name = "hljs-csp")
    hljsMinusCsp("hljs-csp"),


    @Json(name = "hljs-css")
    hljsMinusCss("hljs-css"),


    @Json(name = "hljs-d")
    hljsMinusD("hljs-d"),


    @Json(name = "hljs-dart")
    hljsMinusDart("hljs-dart"),


    @Json(name = "hljs-delphi")
    hljsMinusDelphi("hljs-delphi"),


    @Json(name = "hljs-diff")
    hljsMinusDiff("hljs-diff"),


    @Json(name = "hljs-django")
    hljsMinusDjango("hljs-django"),


    @Json(name = "hljs-dns")
    hljsMinusDns("hljs-dns"),


    @Json(name = "hljs-dockerfile")
    hljsMinusDockerfile("hljs-dockerfile"),


    @Json(name = "hljs-dos")
    hljsMinusDos("hljs-dos"),


    @Json(name = "hljs-dsconfig")
    hljsMinusDsconfig("hljs-dsconfig"),


    @Json(name = "hljs-dts")
    hljsMinusDts("hljs-dts"),


    @Json(name = "hljs-dust")
    hljsMinusDust("hljs-dust"),


    @Json(name = "hljs-ebnf")
    hljsMinusEbnf("hljs-ebnf"),


    @Json(name = "hljs-elixir")
    hljsMinusElixir("hljs-elixir"),


    @Json(name = "hljs-elm")
    hljsMinusElm("hljs-elm"),


    @Json(name = "hljs-erb")
    hljsMinusErb("hljs-erb"),


    @Json(name = "hljs-erlang-repl")
    hljsMinusErlangMinusRepl("hljs-erlang-repl"),


    @Json(name = "hljs-erlang")
    hljsMinusErlang("hljs-erlang"),


    @Json(name = "hljs-excel")
    hljsMinusExcel("hljs-excel"),


    @Json(name = "hljs-fix")
    hljsMinusFix("hljs-fix"),


    @Json(name = "hljs-flix")
    hljsMinusFlix("hljs-flix"),


    @Json(name = "hljs-fortran")
    hljsMinusFortran("hljs-fortran"),


    @Json(name = "hljs-fsharp")
    hljsMinusFsharp("hljs-fsharp"),


    @Json(name = "hljs-gams")
    hljsMinusGams("hljs-gams"),


    @Json(name = "hljs-gauss")
    hljsMinusGauss("hljs-gauss"),


    @Json(name = "hljs-gcode")
    hljsMinusGcode("hljs-gcode"),


    @Json(name = "hljs-gherkin")
    hljsMinusGherkin("hljs-gherkin"),


    @Json(name = "hljs-glsl")
    hljsMinusGlsl("hljs-glsl"),


    @Json(name = "hljs-gml")
    hljsMinusGml("hljs-gml"),


    @Json(name = "hljs-go")
    hljsMinusGo("hljs-go"),


    @Json(name = "hljs-golo")
    hljsMinusGolo("hljs-golo"),


    @Json(name = "hljs-gradle")
    hljsMinusGradle("hljs-gradle"),


    @Json(name = "hljs-groovy")
    hljsMinusGroovy("hljs-groovy"),


    @Json(name = "hljs-haml")
    hljsMinusHaml("hljs-haml"),


    @Json(name = "hljs-handlebars")
    hljsMinusHandlebars("hljs-handlebars"),


    @Json(name = "hljs-haskell")
    hljsMinusHaskell("hljs-haskell"),


    @Json(name = "hljs-haxe")
    hljsMinusHaxe("hljs-haxe"),


    @Json(name = "hljs-hsp")
    hljsMinusHsp("hljs-hsp"),


    @Json(name = "hljs-htmlbars")
    hljsMinusHtmlbars("hljs-htmlbars"),


    @Json(name = "hljs-http")
    hljsMinusHttp("hljs-http"),


    @Json(name = "hljs-hy")
    hljsMinusHy("hljs-hy"),


    @Json(name = "hljs-inform7")
    hljsMinusInform7("hljs-inform7"),


    @Json(name = "hljs-ini")
    hljsMinusIni("hljs-ini"),


    @Json(name = "hljs-irpf90")
    hljsMinusIrpf90("hljs-irpf90"),


    @Json(name = "hljs-isbl")
    hljsMinusIsbl("hljs-isbl"),


    @Json(name = "hljs-java")
    hljsMinusJava("hljs-java"),


    @Json(name = "hljs-javascript")
    hljsMinusJavascript("hljs-javascript"),


    @Json(name = "hljs-jboss-cli")
    hljsMinusJbossMinusCli("hljs-jboss-cli"),


    @Json(name = "hljs-json")
    hljsMinusJson("hljs-json"),


    @Json(name = "hljs-julia-repl")
    hljsMinusJuliaMinusRepl("hljs-julia-repl"),


    @Json(name = "hljs-julia")
    hljsMinusJulia("hljs-julia"),


    @Json(name = "hljs-kotlin")
    hljsMinusKotlin("hljs-kotlin"),


    @Json(name = "hljs-lasso")
    hljsMinusLasso("hljs-lasso"),


    @Json(name = "hljs-ldif")
    hljsMinusLdif("hljs-ldif"),


    @Json(name = "hljs-leaf")
    hljsMinusLeaf("hljs-leaf"),


    @Json(name = "hljs-less")
    hljsMinusLess("hljs-less"),


    @Json(name = "hljs-lisp")
    hljsMinusLisp("hljs-lisp"),


    @Json(name = "hljs-livecodeserver")
    hljsMinusLivecodeserver("hljs-livecodeserver"),


    @Json(name = "hljs-livescript")
    hljsMinusLivescript("hljs-livescript"),


    @Json(name = "hljs-llvm")
    hljsMinusLlvm("hljs-llvm"),


    @Json(name = "hljs-lsl")
    hljsMinusLsl("hljs-lsl"),


    @Json(name = "hljs-lua")
    hljsMinusLua("hljs-lua"),


    @Json(name = "hljs-makefile")
    hljsMinusMakefile("hljs-makefile"),


    @Json(name = "hljs-markdown")
    hljsMinusMarkdown("hljs-markdown"),


    @Json(name = "hljs-mathematica")
    hljsMinusMathematica("hljs-mathematica"),


    @Json(name = "hljs-matlab")
    hljsMinusMatlab("hljs-matlab"),


    @Json(name = "hljs-maxima")
    hljsMinusMaxima("hljs-maxima"),


    @Json(name = "hljs-mel")
    hljsMinusMel("hljs-mel"),


    @Json(name = "hljs-mercury")
    hljsMinusMercury("hljs-mercury"),


    @Json(name = "hljs-mipsasm")
    hljsMinusMipsasm("hljs-mipsasm"),


    @Json(name = "hljs-mizar")
    hljsMinusMizar("hljs-mizar"),


    @Json(name = "hljs-mojolicious")
    hljsMinusMojolicious("hljs-mojolicious"),


    @Json(name = "hljs-monkey")
    hljsMinusMonkey("hljs-monkey"),


    @Json(name = "hljs-moonscript")
    hljsMinusMoonscript("hljs-moonscript"),


    @Json(name = "hljs-n1ql")
    hljsMinusN1ql("hljs-n1ql"),


    @Json(name = "hljs-nginx")
    hljsMinusNginx("hljs-nginx"),


    @Json(name = "hljs-nimrod")
    hljsMinusNimrod("hljs-nimrod"),


    @Json(name = "hljs-nix")
    hljsMinusNix("hljs-nix"),


    @Json(name = "hljs-nsis")
    hljsMinusNsis("hljs-nsis"),


    @Json(name = "hljs-objectivec")
    hljsMinusObjectivec("hljs-objectivec"),


    @Json(name = "hljs-ocaml")
    hljsMinusOcaml("hljs-ocaml"),


    @Json(name = "hljs-openscad")
    hljsMinusOpenscad("hljs-openscad"),


    @Json(name = "hljs-oxygene")
    hljsMinusOxygene("hljs-oxygene"),


    @Json(name = "hljs-parser3")
    hljsMinusParser3("hljs-parser3"),


    @Json(name = "hljs-perl")
    hljsMinusPerl("hljs-perl"),


    @Json(name = "hljs-pf")
    hljsMinusPf("hljs-pf"),


    @Json(name = "hljs-pgsql")
    hljsMinusPgsql("hljs-pgsql"),


    @Json(name = "hljs-php")
    hljsMinusPhp("hljs-php"),


    @Json(name = "hljs-plaintext")
    hljsMinusPlaintext("hljs-plaintext"),


    @Json(name = "hljs-pony")
    hljsMinusPony("hljs-pony"),


    @Json(name = "hljs-powershell")
    hljsMinusPowershell("hljs-powershell"),


    @Json(name = "hljs-processing")
    hljsMinusProcessing("hljs-processing"),


    @Json(name = "hljs-profile")
    hljsMinusProfile("hljs-profile"),


    @Json(name = "hljs-prolog")
    hljsMinusProlog("hljs-prolog"),


    @Json(name = "hljs-properties")
    hljsMinusProperties("hljs-properties"),


    @Json(name = "hljs-protobuf")
    hljsMinusProtobuf("hljs-protobuf"),


    @Json(name = "hljs-puppet")
    hljsMinusPuppet("hljs-puppet"),


    @Json(name = "hljs-purebasic")
    hljsMinusPurebasic("hljs-purebasic"),


    @Json(name = "hljs-python")
    hljsMinusPython("hljs-python"),


    @Json(name = "hljs-q")
    hljsMinusQ("hljs-q"),


    @Json(name = "hljs-qml")
    hljsMinusQml("hljs-qml"),


    @Json(name = "hljs-r")
    hljsMinusR("hljs-r"),


    @Json(name = "hljs-reasonml")
    hljsMinusReasonml("hljs-reasonml"),


    @Json(name = "hljs-rib")
    hljsMinusRib("hljs-rib"),


    @Json(name = "hljs-roboconf")
    hljsMinusRoboconf("hljs-roboconf"),


    @Json(name = "hljs-routeros")
    hljsMinusRouteros("hljs-routeros"),


    @Json(name = "hljs-rsl")
    hljsMinusRsl("hljs-rsl"),


    @Json(name = "hljs-ruby")
    hljsMinusRuby("hljs-ruby"),


    @Json(name = "hljs-ruleslanguage")
    hljsMinusRuleslanguage("hljs-ruleslanguage"),


    @Json(name = "hljs-rust")
    hljsMinusRust("hljs-rust"),


    @Json(name = "hljs-sas")
    hljsMinusSas("hljs-sas"),


    @Json(name = "hljs-scala")
    hljsMinusScala("hljs-scala"),


    @Json(name = "hljs-scheme")
    hljsMinusScheme("hljs-scheme"),


    @Json(name = "hljs-scilab")
    hljsMinusScilab("hljs-scilab"),


    @Json(name = "hljs-scss")
    hljsMinusScss("hljs-scss"),


    @Json(name = "hljs-shell")
    hljsMinusShell("hljs-shell"),


    @Json(name = "hljs-smali")
    hljsMinusSmali("hljs-smali"),


    @Json(name = "hljs-smalltalk")
    hljsMinusSmalltalk("hljs-smalltalk"),


    @Json(name = "hljs-sml")
    hljsMinusSml("hljs-sml"),


    @Json(name = "hljs-sqf")
    hljsMinusSqf("hljs-sqf"),


    @Json(name = "hljs-sql")
    hljsMinusSql("hljs-sql"),


    @Json(name = "hljs-stan")
    hljsMinusStan("hljs-stan"),


    @Json(name = "hljs-stata")
    hljsMinusStata("hljs-stata"),


    @Json(name = "hljs-step21")
    hljsMinusStep21("hljs-step21"),


    @Json(name = "hljs-stylus")
    hljsMinusStylus("hljs-stylus"),


    @Json(name = "hljs-subunit")
    hljsMinusSubunit("hljs-subunit"),


    @Json(name = "hljs-swift")
    hljsMinusSwift("hljs-swift"),


    @Json(name = "hljs-taggerscript")
    hljsMinusTaggerscript("hljs-taggerscript"),


    @Json(name = "hljs-tap")
    hljsMinusTap("hljs-tap"),


    @Json(name = "hljs-tcl")
    hljsMinusTcl("hljs-tcl"),


    @Json(name = "hljs-tex")
    hljsMinusTex("hljs-tex"),


    @Json(name = "hljs-thrift")
    hljsMinusThrift("hljs-thrift"),


    @Json(name = "hljs-tp")
    hljsMinusTp("hljs-tp"),


    @Json(name = "hljs-twig")
    hljsMinusTwig("hljs-twig"),


    @Json(name = "hljs-typescript")
    hljsMinusTypescript("hljs-typescript"),


    @Json(name = "hljs-vala")
    hljsMinusVala("hljs-vala"),


    @Json(name = "hljs-vbnet")
    hljsMinusVbnet("hljs-vbnet"),


    @Json(name = "hljs-vbscript-html")
    hljsMinusVbscriptMinusHtml("hljs-vbscript-html"),


    @Json(name = "hljs-vbscript")
    hljsMinusVbscript("hljs-vbscript"),


    @Json(name = "hljs-verilog")
    hljsMinusVerilog("hljs-verilog"),


    @Json(name = "hljs-vhdl")
    hljsMinusVhdl("hljs-vhdl"),


    @Json(name = "hljs-vim")
    hljsMinusVim("hljs-vim"),


    @Json(name = "hljs-x86asm")
    hljsMinusX86asm("hljs-x86asm"),


    @Json(name = "hljs-xl")
    hljsMinusXl("hljs-xl"),


    @Json(name = "hljs-xml")
    hljsMinusXml("hljs-xml"),


    @Json(name = "hljs-xquery")
    hljsMinusXquery("hljs-xquery"),


    @Json(name = "hljs-yaml")
    hljsMinusYaml("hljs-yaml"),


    @Json(name = "hljs-toml")
    hljsMinusToml("hljs-toml"),


    @Json(name = "hljs-zephir")
    hljsMinusZephir("hljs-zephir"),


    @Json(name = "hljs-html")
    hljsMinusHtml("hljs-html"),


    @Json(name = "groovy")
    groovy("groovy"),


    @Json(name = "kt")
    kt("kt"),


    @Json(name = "el")
    el("el"),


    @Json(name = "clj")
    clj("clj"),


    @Json(name = "ex")
    ex("ex"),


    @Json(name = "adb")
    adb("adb"),


    @Json(name = "ads")
    ads("ads"),


    @Json(name = "agda")
    agda("agda"),


    @Json(name = "elm")
    elm("elm"),


    @Json(name = "exs")
    exs("exs"),


    @Json(name = "glsl")
    glsl("glsl"),


    @Json(name = "ml")
    ml("ml"),


    @Json(name = "lean")
    lean("lean"),


    @Json(name = "lisp")
    lisp("lisp"),


    @Json(name = "rkt")
    rkt("rkt"),


    @Json(name = "sparql")
    sparql("sparql"),


    @Json(name = "vhdl")
    vhdl("vhdl"),


    @Json(name = "zig")
    zig("zig"),


    @Json(name = "dockerfile")
    dockerfile("dockerfile"),


    @Json(name = "f03")
    f03("f03"),


    @Json(name = "f08")
    f08("f08"),


    @Json(name = "f18")
    f18("f18"),


    @Json(name = "f90")
    f90("f90"),


    @Json(name = "f95")
    f95("f95"),


    @Json(name = "jl")
    jl("jl"),


    @Json(name = "mm")
    mm("mm"),


    @Json(name = "scm")
    scm("scm"),


    @Json(name = "sol")
    sol("sol"),


    @Json(name = "sv")
    sv("sv"),


    @Json(name = "asp")
    asp("asp"),


    @Json(name = "cfm")
    cfm("cfm"),


    @Json(name = "fs")
    fs("fs"),


    @Json(name = "fsi")
    fsi("fsi"),


    @Json(name = "fsx")
    fsx("fsx");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}

