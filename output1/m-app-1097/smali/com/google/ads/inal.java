public class inal extends java.lang.Enum {
	 /* .source "AdSenseSpec.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/AdSenseSpec; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x4019 */
/* name = "AdType" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Enum", */
/* "<", */
/* "Lcom/google/ads/AdSenseSpec$AdType;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
private static final com.google.ads.AdSenseSpec$AdType $VALUES; //synthetic
public static final com.google.ads.AdSenseSpec$AdType IMAGE;
public static final com.google.ads.AdSenseSpec$AdType TEXT;
public static final com.google.ads.AdSenseSpec$AdType TEXT_IMAGE;
/* # instance fields */
private java.lang.String mTypeName;
/* # direct methods */
static inal ( ) {
/* .locals 6 */
/* .prologue */
int v5 = 2; // const/4 v5, 0x2
int v4 = 1; // const/4 v4, 0x1
int v3 = 0; // const/4 v3, 0x0
/* .line 398 */
/* new-instance v0, Lcom/google/ads/AdSenseSpec$AdType; */
final String v1 = "TEXT"; // const-string v1, "TEXT"
final String v2 = "text"; // const-string v2, "text"
/* invoke-direct {v0, v1, v3, v2}, Lcom/google/ads/AdSenseSpec$AdType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
/* .line 400 */
/* new-instance v0, Lcom/google/ads/AdSenseSpec$AdType; */
final String v1 = "IMAGE"; // const-string v1, "IMAGE"
final String v2 = "image"; // const-string v2, "image"
/* invoke-direct {v0, v1, v4, v2}, Lcom/google/ads/AdSenseSpec$AdType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
/* .line 402 */
/* new-instance v0, Lcom/google/ads/AdSenseSpec$AdType; */
final String v1 = "TEXT_IMAGE"; // const-string v1, "TEXT_IMAGE"
final String v2 = "text_image"; // const-string v2, "text_image"
/* invoke-direct {v0, v1, v5, v2}, Lcom/google/ads/AdSenseSpec$AdType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
/* .line 396 */
int v0 = 3; // const/4 v0, 0x3
/* new-array v0, v0, [Lcom/google/ads/AdSenseSpec$AdType; */
v1 = com.google.ads.AdSenseSpec$AdType.TEXT;
/* aput-object v1, v0, v3 */
v1 = com.google.ads.AdSenseSpec$AdType.IMAGE;
/* aput-object v1, v0, v4 */
v1 = com.google.ads.AdSenseSpec$AdType.TEXT_IMAGE;
/* aput-object v1, v0, v5 */
return;
} // .end method
private inal ( ) {
/* .locals 0 */
/* .param p3, "typeName" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* ")V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 406 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
/* .line 407 */
this.mTypeName = p3;
/* .line 408 */
return;
} // .end method
static java.lang.String access$000 ( com.google.ads.AdSenseSpec$AdType p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/google/ads/AdSenseSpec$AdType; */
/* .prologue */
/* .line 396 */
/* invoke-direct {p0}, Lcom/google/ads/AdSenseSpec$AdType;->getTypeName()Ljava/lang/String; */
} // .end method
private java.lang.String getTypeName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 413 */
v0 = this.mTypeName;
} // .end method
public static com.google.ads.AdSenseSpec$AdType valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 396 */
/* const-class v0, Lcom/google/ads/AdSenseSpec$AdType; */
java.lang.Enum .valueOf ( v0,p0 );
} // .end local p0 # "name":Ljava/lang/String;
/* check-cast p0, Lcom/google/ads/AdSenseSpec$AdType; */
} // .end method
public static final com.google.ads.AdSenseSpec$AdType values ( ) {
/* .locals 1 */
/* .prologue */
/* .line 396 */
v0 = com.google.ads.AdSenseSpec$AdType.$VALUES;
(( com.google.ads.AdSenseSpec$AdType ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/google/ads/AdSenseSpec$AdType;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/google/ads/AdSenseSpec$AdType; */
} // .end method
