public class de.nurogames.android.ticb.base.core.UpdateMngr {
	 /* .source "UpdateMngr.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lde/nurogames/android/ticb/base/core/UpdateMngr$DownloadFile; */
	 /* } */
} // .end annotation
/* # static fields */
public static java.util.Vector vUpdates;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Vector", */
/* "<", */
/* "Lde/nurogames/android/ticb/base/core/UpdateElement;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
private android.app.Activity mAct;
final android.app.ProgressDialog mProgressDialog;
private java.lang.String shop_url;
/* # direct methods */
static de.nurogames.android.ticb.base.core.UpdateMngr ( ) {
/* .locals 1 */
/* .prologue */
/* .line 53 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
return;
} // .end method
public de.nurogames.android.ticb.base.core.UpdateMngr ( ) {
/* .locals 2 */
/* .param p1, "av" # Landroid/app/Activity; */
/* .prologue */
/* .line 60 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 56 */
final String v0 = "http://beemeup.nurogames.com"; // const-string v0, "http://beemeup.nurogames.com"
this.shop_url = v0;
/* .line 63 */
this.mAct = p1;
/* .line 65 */
/* new-instance v0, Landroid/app/ProgressDialog; */
v1 = this.mAct;
/* invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V */
this.mProgressDialog = v0;
/* .line 68 */
v0 = de.nurogames.android.ticb.base.core.UpdateMngr.vUpdates;
(( java.util.Vector ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/Vector;->clear()V
/* .line 70 */
return;
} // .end method
static android.app.Activity access$0 ( de.nurogames.android.ticb.base.core.UpdateMngr p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 50 */
v0 = this.mAct;
} // .end method
static java.lang.String access$1 ( de.nurogames.android.ticb.base.core.UpdateMngr p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 56 */
v0 = this.shop_url;
} // .end method
public static java.lang.String base64Encode ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 272 */
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 273 */
/* .local v0, "bOut":Ljava/io/ByteArrayOutputStream; */
/* new-instance v1, Lde/nurogames/android/ticb/base/core/Base64OutputStream; */
/* invoke-direct {v1, v0}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;-><init>(Ljava/io/OutputStream;)V */
/* .line 275 */
/* .local v1, "out":Lde/nurogames/android/ticb/base/core/Base64OutputStream; */
try { // :try_start_0
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
(( de.nurogames.android.ticb.base.core.Base64OutputStream ) v1 ).write ( v2 ); // invoke-virtual {v1, v2}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->write([B)V
/* .line 276 */
(( de.nurogames.android.ticb.base.core.Base64OutputStream ) v1 ).flush ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->flush()V
/* .line 277 */
(( de.nurogames.android.ticb.base.core.Base64OutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 280 */
} // :goto_0
(( java.io.ByteArrayOutputStream ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;
/* .line 279 */
/* :catch_0 */
/* move-exception v2 */
} // .end method
/* # virtual methods */
public void checkUpdateIsNewer ( ) {
/* .locals 13 */
/* .prologue */
int v12 = 0; // const/4 v12, 0x0
/* .line 75 */
int v7 = 0; // const/4 v7, 0x0
/* .line 78 */
/* .local v7, "packageInfo":Landroid/content/pm/PackageInfo; */
try { // :try_start_0
v9 = this.mAct;
(( android.app.Activity ) v9 ).getPackageManager ( ); // invoke-virtual {v9}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;
v10 = this.mAct;
(( android.app.Activity ) v10 ).getPackageName ( ); // invoke-virtual {v10}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
/* const/16 v11, 0x80 */
(( android.content.pm.PackageManager ) v9 ).getPackageInfo ( v10, v11 ); // invoke-virtual {v9, v10, v11}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 83 */
v9 = de.nurogames.android.ticb.base.core.UpdateMngr.vUpdates;
v9 = (( java.util.Vector ) v9 ).size ( ); // invoke-virtual {v9}, Ljava/util/Vector;->size()I
/* if-lez v9, :cond_0 */
/* .line 84 */
v10 = this.versionName;
v9 = de.nurogames.android.ticb.base.core.UpdateMngr.vUpdates;
(( java.util.Vector ) v9 ).elementAt ( v12 ); // invoke-virtual {v9, v12}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v9, Lde/nurogames/android/ticb/base/core/UpdateElement; */
(( de.nurogames.android.ticb.base.core.UpdateElement ) v9 ).Version ( ); // invoke-virtual {v9}, Lde/nurogames/android/ticb/base/core/UpdateElement;->Version()Ljava/lang/String;
v9 = (( java.lang.String ) v10 ).equalsIgnoreCase ( v9 ); // invoke-virtual {v10, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v9, :cond_0 */
/* .line 86 */
/* new-instance v4, Landroid/app/Dialog; */
v9 = this.mAct;
/* invoke-direct {v4, v9}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V */
/* .line 89 */
/* .local v4, "dialog":Landroid/app/Dialog; */
(( android.app.Dialog ) v4 ).setContentView ( v9 ); // invoke-virtual {v4, v9}, Landroid/app/Dialog;->setContentView(I)V
/* .line 92 */
v9 = this.mAct;
(( android.app.Activity ) v9 ).getResources ( ); // invoke-virtual {v9}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v9 ).getStringArray ( v10 ); // invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v9, v9, v10 */
(( android.app.Dialog ) v4 ).setTitle ( v9 ); // invoke-virtual {v4, v9}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V
/* .line 95 */
(( android.app.Dialog ) v4 ).findViewById ( v9 ); // invoke-virtual {v4, v9}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
/* check-cast v8, Landroid/widget/TextView; */
/* .line 96 */
/* .local v8, "version":Landroid/widget/TextView; */
/* new-instance v10, Ljava/lang/StringBuilder; */
v9 = de.nurogames.android.ticb.base.core.UpdateMngr.vUpdates;
(( java.util.Vector ) v9 ).elementAt ( v12 ); // invoke-virtual {v9, v12}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v9, Lde/nurogames/android/ticb/base/core/UpdateElement; */
(( de.nurogames.android.ticb.base.core.UpdateElement ) v9 ).Version ( ); // invoke-virtual {v9}, Lde/nurogames/android/ticb/base/core/UpdateElement;->Version()Ljava/lang/String;
java.lang.String .valueOf ( v9 );
/* invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v9 = " ("; // const-string v9, " ("
(( java.lang.StringBuilder ) v10 ).append ( v9 ); // invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v10 = this.mAct;
(( android.app.Activity ) v10 ).getResources ( ); // invoke-virtual {v10}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v10 ).getStringArray ( v11 ); // invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v10, v10, v11 */
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v10 = " "; // const-string v10, " "
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v10 = this.versionName;
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v10 = ")"; // const-string v10, ")"
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.widget.TextView ) v8 ).setText ( v9 ); // invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 99 */
(( android.app.Dialog ) v4 ).findViewById ( v9 ); // invoke-virtual {v4, v9}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
/* check-cast v2, Landroid/widget/TextView; */
/* .line 100 */
/* .local v2, "changes_text_header":Landroid/widget/TextView; */
v9 = this.mAct;
(( android.app.Activity ) v9 ).getResources ( ); // invoke-virtual {v9}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v9 ).getStringArray ( v10 ); // invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v9, v9, v10 */
(( android.widget.TextView ) v2 ).setText ( v9 ); // invoke-virtual {v2, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 103 */
(( android.app.Dialog ) v4 ).findViewById ( v9 ); // invoke-virtual {v4, v9}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/TextView; */
/* .line 104 */
/* .local v1, "changes_text":Landroid/widget/TextView; */
v9 = de.nurogames.android.ticb.base.core.UpdateMngr.vUpdates;
(( java.util.Vector ) v9 ).elementAt ( v12 ); // invoke-virtual {v9, v12}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v9, Lde/nurogames/android/ticb/base/core/UpdateElement; */
(( de.nurogames.android.ticb.base.core.UpdateElement ) v9 ).Desc ( ); // invoke-virtual {v9}, Lde/nurogames/android/ticb/base/core/UpdateElement;->Desc()Ljava/lang/String;
final String v10 = "<br>"; // const-string v10, "<br>"
final String v11 = "\n"; // const-string v11, "\n"
(( java.lang.String ) v9 ).replace ( v10, v11 ); // invoke-virtual {v9, v10, v11}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/* .line 105 */
/* .local v3, "desc_text_splited":Ljava/lang/String; */
(( android.widget.TextView ) v1 ).setText ( v3 ); // invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 108 */
(( android.app.Dialog ) v4 ).findViewById ( v9 ); // invoke-virtual {v4, v9}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/Button; */
/* .line 109 */
/* .local v0, "back":Landroid/widget/Button; */
v9 = this.mAct;
(( android.app.Activity ) v9 ).getResources ( ); // invoke-virtual {v9}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v9 ).getStringArray ( v10 ); // invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v9, v9, v10 */
(( android.widget.Button ) v0 ).setText ( v9 ); // invoke-virtual {v0, v9}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
/* .line 110 */
/* new-instance v9, Lde/nurogames/android/ticb/base/core/UpdateMngr$1; */
/* invoke-direct {v9, p0, v4}, Lde/nurogames/android/ticb/base/core/UpdateMngr$1;-><init>(Lde/nurogames/android/ticb/base/core/UpdateMngr;Landroid/app/Dialog;)V */
(( android.widget.Button ) v0 ).setOnClickListener ( v9 ); // invoke-virtual {v0, v9}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 117 */
(( android.app.Dialog ) v4 ).findViewById ( v9 ); // invoke-virtual {v4, v9}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
/* check-cast v5, Landroid/widget/Button; */
/* .line 118 */
/* .local v5, "download_update":Landroid/widget/Button; */
v9 = this.mAct;
(( android.app.Activity ) v9 ).getResources ( ); // invoke-virtual {v9}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v9 ).getStringArray ( v10 ); // invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v9, v9, v10 */
(( android.widget.Button ) v5 ).setText ( v9 ); // invoke-virtual {v5, v9}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
/* .line 119 */
/* new-instance v9, Lde/nurogames/android/ticb/base/core/UpdateMngr$2; */
/* invoke-direct {v9, p0, v4}, Lde/nurogames/android/ticb/base/core/UpdateMngr$2;-><init>(Lde/nurogames/android/ticb/base/core/UpdateMngr;Landroid/app/Dialog;)V */
(( android.widget.Button ) v5 ).setOnClickListener ( v9 ); // invoke-virtual {v5, v9}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 137 */
(( android.app.Dialog ) v4 ).show ( ); // invoke-virtual {v4}, Landroid/app/Dialog;->show()V
/* .line 140 */
} // .end local v0 # "back":Landroid/widget/Button;
} // .end local v1 # "changes_text":Landroid/widget/TextView;
} // .end local v2 # "changes_text_header":Landroid/widget/TextView;
} // .end local v3 # "desc_text_splited":Ljava/lang/String;
} // .end local v4 # "dialog":Landroid/app/Dialog;
} // .end local v5 # "download_update":Landroid/widget/Button;
} // .end local v8 # "version":Landroid/widget/TextView;
} // :cond_0
} // :goto_0
return;
/* .line 79 */
/* :catch_0 */
/* move-exception v6 */
/* .line 80 */
/* .local v6, "e":Landroid/content/pm/PackageManager$NameNotFoundException; */
} // .end method
public java.lang.String getItemDesc ( ) {
/* .locals 3 */
/* .prologue */
/* .line 290 */
v2 = de.nurogames.android.ticb.base.core.UpdateMngr.vUpdates;
v2 = (( java.util.Vector ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/Vector;->size()I
/* new-array v0, v2, [Ljava/lang/String; */
/* .line 291 */
/* .local v0, "desc":[Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "x":I */
} // :goto_0
/* array-length v2, v0 */
/* if-lt v1, v2, :cond_0 */
/* .line 293 */
/* .line 292 */
} // :cond_0
v2 = de.nurogames.android.ticb.base.core.UpdateMngr.vUpdates;
(( java.util.Vector ) v2 ).elementAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v2, Lde/nurogames/android/ticb/base/core/UpdateElement; */
(( de.nurogames.android.ticb.base.core.UpdateElement ) v2 ).Desc ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/core/UpdateElement;->Desc()Ljava/lang/String;
/* aput-object v2, v0, v1 */
/* .line 291 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public java.lang.String getItemVersion ( ) {
/* .locals 3 */
/* .prologue */
/* .line 284 */
v2 = de.nurogames.android.ticb.base.core.UpdateMngr.vUpdates;
v2 = (( java.util.Vector ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/Vector;->size()I
/* new-array v0, v2, [Ljava/lang/String; */
/* .line 285 */
/* .local v0, "version":[Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "x":I */
} // :goto_0
/* array-length v2, v0 */
/* if-lt v1, v2, :cond_0 */
/* .line 287 */
/* .line 286 */
} // :cond_0
v2 = de.nurogames.android.ticb.base.core.UpdateMngr.vUpdates;
(( java.util.Vector ) v2 ).elementAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v2, Lde/nurogames/android/ticb/base/core/UpdateElement; */
(( de.nurogames.android.ticb.base.core.UpdateElement ) v2 ).Version ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/core/UpdateElement;->Version()Ljava/lang/String;
/* aput-object v2, v0, v1 */
/* .line 285 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public de.nurogames.android.ticb.base.core.UpdateElement getUpdateItem ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 296 */
v0 = de.nurogames.android.ticb.base.core.UpdateMngr.vUpdates;
(( java.util.Vector ) v0 ).elementAt ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/UpdateElement; */
} // .end method
public Integer getUpdateItemCount ( ) {
/* .locals 1 */
/* .prologue */
/* .line 299 */
v0 = de.nurogames.android.ticb.base.core.UpdateMngr.vUpdates;
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
} // .end method
public void loadDataFromServer ( ) {
/* .locals 15 */
/* .prologue */
/* .line 223 */
try { // :try_start_0
/* new-instance v10, Ljava/net/URL; */
/* new-instance v12, Ljava/lang/StringBuilder; */
v13 = this.shop_url;
java.lang.String .valueOf ( v13 );
/* invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v13 = "/update.xml"; // const-string v13, "/update.xml"
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v10, v12}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 227 */
/* .local v10, "url":Ljava/net/URL; */
try { // :try_start_1
(( java.net.URL ) v10 ).openConnection ( ); // invoke-virtual {v10}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* .line 229 */
/* .local v0, "conn":Ljava/net/URLConnection; */
final String v3 = "telebee:tBeElEeBbEeE1B9E5E%"; // const-string v3, "telebee:tBeElEeBbEeE1B9E5E%"
/* .line 230 */
/* .local v3, "input":Ljava/lang/String; */
de.nurogames.android.ticb.base.core.UpdateMngr .base64Encode ( v3 );
/* .line 232 */
/* .local v2, "encoding":Ljava/lang/String; */
final String v12 = "Authorization"; // const-string v12, "Authorization"
/* new-instance v13, Ljava/lang/StringBuilder; */
final String v14 = "Basic "; // const-string v14, "Basic "
/* invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v13 ).append ( v2 ); // invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).toString ( ); // invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.net.URLConnection ) v0 ).setRequestProperty ( v12, v13 ); // invoke-virtual {v0, v12, v13}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 233 */
/* const/16 v12, 0xc8 */
(( java.net.URLConnection ) v0 ).setConnectTimeout ( v12 ); // invoke-virtual {v0, v12}, Ljava/net/URLConnection;->setConnectTimeout(I)V
/* .line 234 */
(( java.net.URLConnection ) v0 ).connect ( ); // invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V
/* .line 236 */
(( java.net.URLConnection ) v0 ).getInputStream ( ); // invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;
/* :try_end_1 */
/* .catch Ljava/net/UnknownHostException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_2 */
/* .catch Ljava/net/MalformedURLException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 241 */
/* .local v5, "is":Ljava/io/InputStream; */
try { // :try_start_2
javax.xml.parsers.SAXParserFactory .newInstance ( );
/* .line 242 */
/* .local v7, "spf":Ljavax/xml/parsers/SAXParserFactory; */
(( javax.xml.parsers.SAXParserFactory ) v7 ).newSAXParser ( ); // invoke-virtual {v7}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;
/* .line 245 */
/* .local v6, "sp":Ljavax/xml/parsers/SAXParser; */
(( javax.xml.parsers.SAXParser ) v6 ).getXMLReader ( ); // invoke-virtual {v6}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;
/* .line 248 */
/* .local v11, "xr":Lorg/xml/sax/XMLReader; */
/* new-instance v9, Lde/nurogames/android/ticb/base/core/UpdateItemHandler; */
/* invoke-direct {v9}, Lde/nurogames/android/ticb/base/core/UpdateItemHandler;-><init>()V */
/* .line 249 */
/* .local v9, "updateHandler":Lde/nurogames/android/ticb/base/core/UpdateItemHandler; */
/* .line 252 */
/* new-instance v12, Lorg/xml/sax/InputSource; */
/* invoke-direct {v12, v5}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V */
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_3 */
/* .catch Ljava/net/UnknownHostException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_2 */
/* .catch Ljava/net/MalformedURLException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 257 */
} // .end local v6 # "sp":Ljavax/xml/parsers/SAXParser;
} // .end local v7 # "spf":Ljavax/xml/parsers/SAXParserFactory;
} // .end local v9 # "updateHandler":Lde/nurogames/android/ticb/base/core/UpdateItemHandler;
} // .end local v11 # "xr":Lorg/xml/sax/XMLReader;
} // :goto_0
try { // :try_start_3
(( java.io.InputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->close()V
/* :try_end_3 */
/* .catch Ljava/net/UnknownHostException; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_2 */
/* .catch Ljava/net/MalformedURLException; {:try_start_3 ..:try_end_3} :catch_1 */
/* .line 268 */
} // .end local v0 # "conn":Ljava/net/URLConnection;
} // .end local v2 # "encoding":Ljava/lang/String;
} // .end local v3 # "input":Ljava/lang/String;
} // .end local v5 # "is":Ljava/io/InputStream;
} // .end local v10 # "url":Ljava/net/URL;
} // :goto_1
return;
/* .line 260 */
/* .restart local v10 # "url":Ljava/net/URL; */
/* :catch_0 */
/* move-exception v8 */
/* .local v8, "uhe":Ljava/net/UnknownHostException; */
int v12 = 1; // const/4 v12, 0x1
try { // :try_start_4
de.nurogames.android.ticb.base.tinysanta.NO_NETCONNCETION_AVAIL = (v12!= 0);
/* :try_end_4 */
/* .catch Ljava/net/MalformedURLException; {:try_start_4 ..:try_end_4} :catch_1 */
/* .line 264 */
} // .end local v8 # "uhe":Ljava/net/UnknownHostException;
} // .end local v10 # "url":Ljava/net/URL;
/* :catch_1 */
/* move-exception v1 */
/* .line 265 */
/* .local v1, "e":Ljava/net/MalformedURLException; */
(( java.net.MalformedURLException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/net/MalformedURLException;->printStackTrace()V
/* .line 261 */
} // .end local v1 # "e":Ljava/net/MalformedURLException;
/* .restart local v10 # "url":Ljava/net/URL; */
/* :catch_2 */
/* move-exception v4 */
/* .local v4, "ioe":Ljava/io/IOException; */
int v12 = 1; // const/4 v12, 0x1
try { // :try_start_5
de.nurogames.android.ticb.base.tinysanta.NO_SDCARD_AVAIL = (v12!= 0);
/* :try_end_5 */
/* .catch Ljava/net/MalformedURLException; {:try_start_5 ..:try_end_5} :catch_1 */
/* .line 255 */
} // .end local v4 # "ioe":Ljava/io/IOException;
/* .restart local v0 # "conn":Ljava/net/URLConnection; */
/* .restart local v2 # "encoding":Ljava/lang/String; */
/* .restart local v3 # "input":Ljava/lang/String; */
/* .restart local v5 # "is":Ljava/io/InputStream; */
/* :catch_3 */
/* move-exception v12 */
} // .end method
