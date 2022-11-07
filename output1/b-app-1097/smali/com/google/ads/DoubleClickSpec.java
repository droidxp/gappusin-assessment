public class com.google.ads.DoubleClickSpec implements com.google.ads.AdSpec {
	 /* .source "DoubleClickSpec.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/DoubleClickSpec$SizeProfile; */
	 /* } */
} // .end annotation
/* # instance fields */
private java.lang.String mColorBackground;
private java.lang.String mKeyname;
private com.google.ads.DoubleClickSpec$SizeProfile mSizeProfile;
/* # direct methods */
public com.google.ads.DoubleClickSpec ( ) {
	 /* .locals 0 */
	 /* .param p1, "keyname" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 40 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 41 */
	 this.mKeyname = p1;
	 /* .line 42 */
	 return;
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
/* .line 46 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 49 */
/* .local v0, "params":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/google/ads/AdSpec$Parameter;>;" */
/* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
final String v2 = "k"; // const-string v2, "k"
v3 = this.mKeyname;
/* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 52 */
v1 = this.mColorBackground;
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 53 */
	 /* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
	 final String v2 = "color_bg"; // const-string v2, "color_bg"
	 v3 = this.mColorBackground;
	 /* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
	 (( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 /* .line 55 */
} // :cond_0
v1 = this.mSizeProfile;
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 56 */
	 /* new-instance v1, Lcom/google/ads/AdSpec$Parameter; */
	 final String v2 = "sp"; // const-string v2, "sp"
	 v3 = this.mSizeProfile;
	 (( com.google.ads.DoubleClickSpec$SizeProfile ) v3 ).name ( ); // invoke-virtual {v3}, Lcom/google/ads/DoubleClickSpec$SizeProfile;->name()Ljava/lang/String;
	 (( java.lang.String ) v3 ).toLowerCase ( ); // invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
	 /* invoke-direct {v1, v2, v3}, Lcom/google/ads/AdSpec$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
	 (( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 /* .line 59 */
} // :cond_1
} // .end method
public java.lang.String getColorBackground ( ) {
/* .locals 1 */
/* .prologue */
/* .line 85 */
v0 = this.mColorBackground;
} // .end method
public Boolean getDebugMode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 64 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String getKeyname ( ) {
/* .locals 1 */
/* .prologue */
/* .line 71 */
v0 = this.mKeyname;
} // .end method
public com.google.ads.DoubleClickSpec$SizeProfile getSizeProfile ( ) {
/* .locals 1 */
/* .prologue */
/* .line 100 */
v0 = this.mSizeProfile;
} // .end method
public com.google.ads.DoubleClickSpec setColorBackground ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "colorBackground" # Ljava/lang/String; */
/* .prologue */
/* .line 94 */
this.mColorBackground = p1;
/* .line 95 */
} // .end method
public com.google.ads.DoubleClickSpec setKeyname ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "keyname" # Ljava/lang/String; */
/* .prologue */
/* .line 76 */
this.mKeyname = p1;
/* .line 77 */
} // .end method
public com.google.ads.DoubleClickSpec setSizeProfile ( com.google.ads.DoubleClickSpec$SizeProfile p0 ) {
/* .locals 0 */
/* .param p1, "sizeProfile" # Lcom/google/ads/DoubleClickSpec$SizeProfile; */
/* .prologue */
/* .line 107 */
this.mSizeProfile = p1;
/* .line 108 */
} // .end method
