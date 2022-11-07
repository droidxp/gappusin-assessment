public class inal extends java.lang.Enum {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/searchads/SearchAdRequest; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x4019 */
/* name = "BorderType" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Enum", */
/* "<", */
/* "Lcom/google/ads/searchads/SearchAdRequest$BorderType;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
public static final com.google.ads.searchads.SearchAdRequest$BorderType DASHED;
public static final com.google.ads.searchads.SearchAdRequest$BorderType DOTTED;
public static final com.google.ads.searchads.SearchAdRequest$BorderType NONE;
public static final com.google.ads.searchads.SearchAdRequest$BorderType SOLID;
private static final com.google.ads.searchads.SearchAdRequest$BorderType b; //synthetic
/* # instance fields */
private java.lang.String a;
/* # direct methods */
static inal ( ) {
/* .locals 7 */
/* .prologue */
int v6 = 3; // const/4 v6, 0x3
int v5 = 2; // const/4 v5, 0x2
int v4 = 1; // const/4 v4, 0x1
int v3 = 0; // const/4 v3, 0x0
/* .line 27 */
/* new-instance v0, Lcom/google/ads/searchads/SearchAdRequest$BorderType; */
final String v1 = "NONE"; // const-string v1, "NONE"
final String v2 = "none"; // const-string v2, "none"
/* invoke-direct {v0, v1, v3, v2}, Lcom/google/ads/searchads/SearchAdRequest$BorderType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
/* .line 32 */
/* new-instance v0, Lcom/google/ads/searchads/SearchAdRequest$BorderType; */
final String v1 = "DASHED"; // const-string v1, "DASHED"
final String v2 = "dashed"; // const-string v2, "dashed"
/* invoke-direct {v0, v1, v4, v2}, Lcom/google/ads/searchads/SearchAdRequest$BorderType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
/* .line 37 */
/* new-instance v0, Lcom/google/ads/searchads/SearchAdRequest$BorderType; */
final String v1 = "DOTTED"; // const-string v1, "DOTTED"
final String v2 = "dotted"; // const-string v2, "dotted"
/* invoke-direct {v0, v1, v5, v2}, Lcom/google/ads/searchads/SearchAdRequest$BorderType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
/* .line 42 */
/* new-instance v0, Lcom/google/ads/searchads/SearchAdRequest$BorderType; */
final String v1 = "SOLID"; // const-string v1, "SOLID"
final String v2 = "solid"; // const-string v2, "solid"
/* invoke-direct {v0, v1, v6, v2}, Lcom/google/ads/searchads/SearchAdRequest$BorderType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
/* .line 22 */
int v0 = 4; // const/4 v0, 0x4
/* new-array v0, v0, [Lcom/google/ads/searchads/SearchAdRequest$BorderType; */
v1 = com.google.ads.searchads.SearchAdRequest$BorderType.NONE;
/* aput-object v1, v0, v3 */
v1 = com.google.ads.searchads.SearchAdRequest$BorderType.DASHED;
/* aput-object v1, v0, v4 */
v1 = com.google.ads.searchads.SearchAdRequest$BorderType.DOTTED;
/* aput-object v1, v0, v5 */
v1 = com.google.ads.searchads.SearchAdRequest$BorderType.SOLID;
/* aput-object v1, v0, v6 */
return;
} // .end method
private inal ( ) {
/* .locals 0 */
/* .param p3, "param" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* ")V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 46 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
/* .line 47 */
this.a = p3;
/* .line 48 */
return;
} // .end method
public static com.google.ads.searchads.SearchAdRequest$BorderType valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 22 */
/* const-class v0, Lcom/google/ads/searchads/SearchAdRequest$BorderType; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/google/ads/searchads/SearchAdRequest$BorderType; */
} // .end method
public static com.google.ads.searchads.SearchAdRequest$BorderType values ( ) {
/* .locals 1 */
/* .prologue */
/* .line 22 */
v0 = com.google.ads.searchads.SearchAdRequest$BorderType.b;
(( com.google.ads.searchads.SearchAdRequest$BorderType ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/google/ads/searchads/SearchAdRequest$BorderType;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/google/ads/searchads/SearchAdRequest$BorderType; */
} // .end method
/* # virtual methods */
public java.lang.String toString ( ) {
/* .locals 1 */
/* .prologue */
/* .line 52 */
v0 = this.a;
} // .end method
