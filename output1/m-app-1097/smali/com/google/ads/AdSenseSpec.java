public class com.google.ads.AdSenseSpec implements com.google.ads.AdSpec {
	 /* .source "AdSenseSpec.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/AdSenseSpec$AdType; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String APP_URL_MODEL_WITH_SEPARATORS;
private static final java.lang.String JS_PARAM;
private static final java.lang.String PLATFORM;
/* # instance fields */
private Boolean mAdTestEnabled;
private com.google.ads.AdSenseSpec$AdType mAdType;
private java.lang.String mAlternateAdUrl;
private java.lang.String mAlternateColor;
private java.lang.String mAppName;
private java.lang.String mChannel;
private java.lang.String mClientId;
private java.lang.String mColorBackground;
private java.lang.String mColorBorder;
private java.lang.String mColorLink;
private java.lang.String mColorText;
private java.lang.String mColorUrl;
private java.lang.String mCompanyName;
private java.lang.String mKeywords;
private java.lang.String mWebEquivalentUrl;
/* # direct methods */
public com.google.ads.AdSenseSpec ( ) {
	 /* .locals 1 */
	 /* .param p1, "clientId" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 59 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 60 */
	 final String v0 = "ClientId"; // const-string v0, "ClientId"
	 /* invoke-direct {p0, p1, v0}, Lcom/google/ads/AdSenseSpec;->checkNotNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 61 */
	 this.mClientId = p1;
	 /* .line 64 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lcom/google/ads/AdSenseSpec;->mAdTestEnabled:Z */
	 /* .line 65 */
	 return;
} // .end method
private void checkNotEmpty ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 3 */
	 /* .param p1, "param" # Ljava/lang/String; */
	 /* .param p2, "paramName" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 79 */
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 v0 = 		 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
		 /* if-gtz v0, :cond_0 */
		 /* .line 80 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = " cannot be empty."; // const-string v2, " cannot be empty."
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
		 /* .line 82 */
	 } // :cond_0
	 return;
} // .end method
private void checkNotNullOrEmpty ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 3 */
	 /* .param p1, "param" # Ljava/lang/String; */
	 /* .param p2, "paramName" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 69 */
	 /* if-nez p1, :cond_0 */
	 /* .line 70 */
	 /* new-instance v0, Ljava/lang/NullPointerException; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = " cannot be null."; // const-string v2, " cannot be null."
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
	 /* .line 72 */
} // :cond_0
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-gtz v0, :cond_1 */
/* .line 73 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " cannot be empty."; // const-string v2, " cannot be empty."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 75 */
} // :cond_1
return;
} // .end method
private java.lang.String generateAppUrl ( android.content.Context p0 ) {
/* .locals 7 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
final String v6 = ".android."; // const-string v6, ".android."
/* .line 153 */
(( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 155 */
/* .local v2, "packageName":Ljava/lang/String; */
try { // :try_start_0
(( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 156 */
/* .local v1, "packageManager":Landroid/content/pm/PackageManager; */
int v4 = 0; // const/4 v4, 0x0
(( android.content.pm.PackageManager ) v1 ).getPackageInfo ( v2, v4 ); // invoke-virtual {v1, v2, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* iget v3, v4, Landroid/content/pm/PackageInfo;->versionCode:I */
/* .line 157 */
/* .local v3, "versionCode":I */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v5 = ".android."; // const-string v5, ".android."
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 160 */
} // .end local v1 # "packageManager":Landroid/content/pm/PackageManager;
} // .end local v3 # "versionCode":I
} // :goto_0
/* .line 158 */
/* :catch_0 */
/* move-exception v4 */
/* move-object v0, v4 */
/* .line 160 */
/* .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException; */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = ".android."; // const-string v5, ".android."
(( java.lang.StringBuilder ) v4 ).append ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
/* # virtual methods */
public java.util.List generateParameters ( android.content.Context p0 ) {
/* .locals 4 */
/* .param p1, "context" # Landroid/content/Context; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* ")", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/google/ads/AdSpec$Parameter;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 87 */
v1 = this.mAppName;
/* if-nez v1, :cond_0 */
/* .line 88 */
/* new-instance v1, Ljava/lang/IllegalStateException; */
final String v2 = "AppName must be set before calling generateParameters()."; // const-string v2, "AppName must be set before calling generateParameters()."
/* invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 91 */
} // :cond_0
v1 = this.mCompanyName;
/* if-nez v1, :cond_1 */
/* .line 92 */
/* new-instance v1, Ljava/lang/IllegalStateException; */
final String v2 = "CompanyName must be set before calling generateParameters()."; // const-string v2, "CompanyName must be set before calling generateParameters()."
/* invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 96 */
} // :cond_1
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 99 */
/* .local v0, "params":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/google/ads/AdSpec$Parameter;>;" */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "client"; // const-string v2, "client"
v3 = this.mClientId;
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 100 */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "app_name"; // const-string v2, "app_name"
/* invoke-direct {p0, p1}, Lcom/google/ads/AdSenseSpec;->generateAppUrl(Landroid/content/Context;)Ljava/lang/String; */
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 101 */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "js"; // const-string v2, "js"
final String v3 = "afma-sdk-a-v1.2"; // const-string v3, "afma-sdk-a-v1.2"
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 102 */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "platform"; // const-string v2, "platform"
final String v3 = "Android"; // const-string v3, "Android"
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 103 */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "an"; // const-string v2, "an"
v3 = this.mAppName;
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 104 */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "cn"; // const-string v2, "cn"
v3 = this.mCompanyName;
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 107 */
/* iget-boolean v1, p0, Lcom/google/ads/AdSenseSpec;->mAdTestEnabled:Z */
/* if-nez v1, :cond_2 */
/* .line 108 */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "adtest"; // const-string v2, "adtest"
final String v3 = "off"; // const-string v3, "off"
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 110 */
} // :cond_2
v1 = this.mAdType;
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 111 */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "ad_type"; // const-string v2, "ad_type"
v3 = this.mAdType;
com.google.ads.AdSenseSpec$AdType .access$000 ( v3 );
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 113 */
} // :cond_3
v1 = this.mAlternateAdUrl;
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 114 */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "alternate_ad_url"; // const-string v2, "alternate_ad_url"
v3 = this.mAlternateAdUrl;
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 116 */
} // :cond_4
v1 = this.mAlternateColor;
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 117 */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "alt_color"; // const-string v2, "alt_color"
v3 = this.mAlternateColor;
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 119 */
} // :cond_5
v1 = this.mChannel;
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 120 */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "channel"; // const-string v2, "channel"
v3 = this.mChannel;
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 122 */
} // :cond_6
v1 = this.mColorBackground;
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 123 */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "color_bg"; // const-string v2, "color_bg"
v3 = this.mColorBackground;
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 125 */
} // :cond_7
v1 = this.mColorBorder;
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 126 */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "color_border"; // const-string v2, "color_border"
v3 = this.mColorBorder;
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 128 */
} // :cond_8
v1 = this.mColorLink;
if ( v1 != null) { // if-eqz v1, :cond_9
/* .line 129 */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "color_link"; // const-string v2, "color_link"
v3 = this.mColorLink;
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 131 */
} // :cond_9
v1 = this.mColorText;
if ( v1 != null) { // if-eqz v1, :cond_a
/* .line 132 */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "color_text"; // const-string v2, "color_text"
v3 = this.mColorText;
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 134 */
} // :cond_a
v1 = this.mColorUrl;
if ( v1 != null) { // if-eqz v1, :cond_b
/* .line 135 */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "color_url"; // const-string v2, "color_url"
v3 = this.mColorUrl;
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 137 */
} // :cond_b
v1 = this.mKeywords;
if ( v1 != null) { // if-eqz v1, :cond_c
/* .line 138 */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "kw"; // const-string v2, "kw"
v3 = this.mKeywords;
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 140 */
} // :cond_c
v1 = this.mWebEquivalentUrl;
if ( v1 != null) { // if-eqz v1, :cond_d
/* .line 141 */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "url"; // const-string v2, "url"
v3 = this.mWebEquivalentUrl;
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 144 */
} // :cond_d
} // .end method
public Boolean getAdTestEnabled ( ) {
/* .locals 1 */
/* .prologue */
/* .line 180 */
/* iget-boolean v0, p0, Lcom/google/ads/AdSenseSpec;->mAdTestEnabled:Z */
} // .end method
public com.google.ads.AdSenseSpec$AdType getAdType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 194 */
v0 = this.mAdType;
} // .end method
public java.lang.String getAlternateAdUrl ( ) {
/* .locals 1 */
/* .prologue */
/* .line 238 */
v0 = this.mAlternateAdUrl;
} // .end method
public java.lang.String getAlternateColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 254 */
v0 = this.mAlternateColor;
} // .end method
public java.lang.String getAppName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 205 */
v0 = this.mAppName;
} // .end method
public java.lang.String getChannel ( ) {
/* .locals 1 */
/* .prologue */
/* .line 222 */
v0 = this.mChannel;
} // .end method
public java.lang.String getClientId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 168 */
v0 = this.mClientId;
} // .end method
public java.lang.String getColorBackground ( ) {
/* .locals 1 */
/* .prologue */
/* .line 270 */
v0 = this.mColorBackground;
} // .end method
public java.lang.String getColorBorder ( ) {
/* .locals 1 */
/* .prologue */
/* .line 285 */
v0 = this.mColorBorder;
} // .end method
public java.lang.String getColorLink ( ) {
/* .locals 1 */
/* .prologue */
/* .line 300 */
v0 = this.mColorLink;
} // .end method
public java.lang.String getColorText ( ) {
/* .locals 1 */
/* .prologue */
/* .line 315 */
v0 = this.mColorText;
} // .end method
public java.lang.String getColorUrl ( ) {
/* .locals 1 */
/* .prologue */
/* .line 330 */
v0 = this.mColorUrl;
} // .end method
public java.lang.String getCompanyName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 345 */
v0 = this.mCompanyName;
} // .end method
public Boolean getDebugMode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 149 */
/* iget-boolean v0, p0, Lcom/google/ads/AdSenseSpec;->mAdTestEnabled:Z */
} // .end method
public java.lang.String getKeywords ( ) {
/* .locals 1 */
/* .prologue */
/* .line 362 */
v0 = this.mKeywords;
} // .end method
public java.lang.String getWebEquivalentUrl ( ) {
/* .locals 1 */
/* .prologue */
/* .line 378 */
v0 = this.mWebEquivalentUrl;
} // .end method
public com.google.ads.AdSenseSpec setAdTestEnabled ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "enabled" # Z */
/* .prologue */
/* .line 188 */
/* iput-boolean p1, p0, Lcom/google/ads/AdSenseSpec;->mAdTestEnabled:Z */
/* .line 189 */
} // .end method
public com.google.ads.AdSenseSpec setAdType ( com.google.ads.AdSenseSpec$AdType p0 ) {
/* .locals 0 */
/* .param p1, "adType" # Lcom/google/ads/AdSenseSpec$AdType; */
/* .prologue */
/* .line 199 */
this.mAdType = p1;
/* .line 200 */
} // .end method
public com.google.ads.AdSenseSpec setAlternateAdUrl ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "alternateAdUrl" # Ljava/lang/String; */
/* .prologue */
/* .line 247 */
final String v0 = "AlternateAdUrl"; // const-string v0, "AlternateAdUrl"
/* invoke-direct {p0, p1, v0}, Lcom/google/ads/AdSenseSpec;->checkNotEmpty(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 248 */
this.mAlternateAdUrl = p1;
/* .line 249 */
} // .end method
public com.google.ads.AdSenseSpec setAlternateColor ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "alternateColor" # Ljava/lang/String; */
/* .prologue */
/* .line 263 */
final String v0 = "AlternateColor"; // const-string v0, "AlternateColor"
/* invoke-direct {p0, p1, v0}, Lcom/google/ads/AdSenseSpec;->checkNotEmpty(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 264 */
this.mAlternateColor = p1;
/* .line 265 */
} // .end method
public com.google.ads.AdSenseSpec setAppName ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "appName" # Ljava/lang/String; */
/* .prologue */
/* .line 215 */
final String v0 = "AppName"; // const-string v0, "AppName"
/* invoke-direct {p0, p1, v0}, Lcom/google/ads/AdSenseSpec;->checkNotNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 216 */
this.mAppName = p1;
/* .line 217 */
} // .end method
public com.google.ads.AdSenseSpec setChannel ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "channel" # Ljava/lang/String; */
/* .prologue */
/* .line 231 */
final String v0 = "Channel"; // const-string v0, "Channel"
/* invoke-direct {p0, p1, v0}, Lcom/google/ads/AdSenseSpec;->checkNotEmpty(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 232 */
this.mChannel = p1;
/* .line 233 */
} // .end method
public com.google.ads.AdSenseSpec setClientId ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "clientId" # Ljava/lang/String; */
/* .prologue */
/* .line 173 */
final String v0 = "ClientId"; // const-string v0, "ClientId"
/* invoke-direct {p0, p1, v0}, Lcom/google/ads/AdSenseSpec;->checkNotNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 174 */
this.mClientId = p1;
/* .line 175 */
} // .end method
public com.google.ads.AdSenseSpec setColorBackground ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "colorBackground" # Ljava/lang/String; */
/* .prologue */
/* .line 278 */
final String v0 = "ColorBackground"; // const-string v0, "ColorBackground"
/* invoke-direct {p0, p1, v0}, Lcom/google/ads/AdSenseSpec;->checkNotEmpty(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 279 */
this.mColorBackground = p1;
/* .line 280 */
} // .end method
public com.google.ads.AdSenseSpec setColorBorder ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "colorBorder" # Ljava/lang/String; */
/* .prologue */
/* .line 293 */
final String v0 = "ColorBorder"; // const-string v0, "ColorBorder"
/* invoke-direct {p0, p1, v0}, Lcom/google/ads/AdSenseSpec;->checkNotEmpty(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 294 */
this.mColorBorder = p1;
/* .line 295 */
} // .end method
public com.google.ads.AdSenseSpec setColorLink ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "colorLink" # Ljava/lang/String; */
/* .prologue */
/* .line 308 */
final String v0 = "ColorLink"; // const-string v0, "ColorLink"
/* invoke-direct {p0, p1, v0}, Lcom/google/ads/AdSenseSpec;->checkNotEmpty(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 309 */
this.mColorLink = p1;
/* .line 310 */
} // .end method
public com.google.ads.AdSenseSpec setColorText ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "colorText" # Ljava/lang/String; */
/* .prologue */
/* .line 323 */
final String v0 = "ColorText"; // const-string v0, "ColorText"
/* invoke-direct {p0, p1, v0}, Lcom/google/ads/AdSenseSpec;->checkNotEmpty(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 324 */
this.mColorText = p1;
/* .line 325 */
} // .end method
public com.google.ads.AdSenseSpec setColorUrl ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "colorUrl" # Ljava/lang/String; */
/* .prologue */
/* .line 338 */
final String v0 = "ColorUrl"; // const-string v0, "ColorUrl"
/* invoke-direct {p0, p1, v0}, Lcom/google/ads/AdSenseSpec;->checkNotEmpty(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 339 */
this.mColorUrl = p1;
/* .line 340 */
} // .end method
public com.google.ads.AdSenseSpec setCompanyName ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "companyName" # Ljava/lang/String; */
/* .prologue */
/* .line 355 */
final String v0 = "CompanyName"; // const-string v0, "CompanyName"
/* invoke-direct {p0, p1, v0}, Lcom/google/ads/AdSenseSpec;->checkNotNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 356 */
this.mCompanyName = p1;
/* .line 357 */
} // .end method
public com.google.ads.AdSenseSpec setKeywords ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "keywords" # Ljava/lang/String; */
/* .prologue */
/* .line 371 */
final String v0 = "Keywords"; // const-string v0, "Keywords"
/* invoke-direct {p0, p1, v0}, Lcom/google/ads/AdSenseSpec;->checkNotEmpty(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 372 */
this.mKeywords = p1;
/* .line 373 */
} // .end method
public com.google.ads.AdSenseSpec setWebEquivalentUrl ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "webEquivalentUrl" # Ljava/lang/String; */
/* .prologue */
/* .line 388 */
final String v0 = "WebEquivalentUrl"; // const-string v0, "WebEquivalentUrl"
/* invoke-direct {p0, p1, v0}, Lcom/google/ads/AdSenseSpec;->checkNotEmpty(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 389 */
this.mWebEquivalentUrl = p1;
/* .line 390 */
} // .end method
