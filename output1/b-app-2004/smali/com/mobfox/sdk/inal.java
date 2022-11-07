public class inal extends java.lang.Enum {
	 /* .source "AdType.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum", */
	 /* "<", */
	 /* "Lcom/mobfox/sdk/AdType;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
private static final com.mobfox.sdk.AdType $VALUES; //synthetic
public static final com.mobfox.sdk.AdType IMAGE;
public static final com.mobfox.sdk.AdType NO_AD;
public static final com.mobfox.sdk.AdType TEXT;
/* # direct methods */
static inal ( ) {
	 /* .locals 5 */
	 /* .prologue */
	 int v4 = 2; // const/4 v4, 0x2
	 int v3 = 1; // const/4 v3, 0x1
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 4 */
	 /* new-instance v0, Lcom/mobfox/sdk/AdType; */
	 final String v1 = "IMAGE"; // const-string v1, "IMAGE"
	 /* invoke-direct {v0, v1, v2}, Lcom/mobfox/sdk/AdType;-><init>(Ljava/lang/String;I)V */
	 /* new-instance v0, Lcom/mobfox/sdk/AdType; */
	 final String v1 = "TEXT"; // const-string v1, "TEXT"
	 /* invoke-direct {v0, v1, v3}, Lcom/mobfox/sdk/AdType;-><init>(Ljava/lang/String;I)V */
	 /* new-instance v0, Lcom/mobfox/sdk/AdType; */
	 final String v1 = "NO_AD"; // const-string v1, "NO_AD"
	 /* invoke-direct {v0, v1, v4}, Lcom/mobfox/sdk/AdType;-><init>(Ljava/lang/String;I)V */
	 /* .line 3 */
	 int v0 = 3; // const/4 v0, 0x3
	 /* new-array v0, v0, [Lcom/mobfox/sdk/AdType; */
	 v1 = com.mobfox.sdk.AdType.IMAGE;
	 /* aput-object v1, v0, v2 */
	 v1 = com.mobfox.sdk.AdType.TEXT;
	 /* aput-object v1, v0, v3 */
	 v1 = com.mobfox.sdk.AdType.NO_AD;
	 /* aput-object v1, v0, v4 */
	 return;
} // .end method
private inal ( ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "()V" */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 3 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
return;
} // .end method
public static com.mobfox.sdk.AdType valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 3 */
/* const-class v0, Lcom/mobfox/sdk/AdType; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/mobfox/sdk/AdType; */
} // .end method
public static com.mobfox.sdk.AdType values ( ) {
/* .locals 1 */
/* .prologue */
/* .line 3 */
v0 = com.mobfox.sdk.AdType.$VALUES;
(( com.mobfox.sdk.AdType ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/mobfox/sdk/AdType;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/mobfox/sdk/AdType; */
} // .end method
