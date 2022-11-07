public class inal extends java.lang.Enum {
	 /* .source "UrlType.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum", */
	 /* "<", */
	 /* "Lcom/mobfox/sdk/data/UrlType;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
private static final com.mobfox.sdk.data.UrlType $VALUES; //synthetic
public static final com.mobfox.sdk.data.UrlType OTHER;
public static final com.mobfox.sdk.data.UrlType WEB;
/* # direct methods */
static inal ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 int v3 = 1; // const/4 v3, 0x1
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 4 */
	 /* new-instance v0, Lcom/mobfox/sdk/data/UrlType; */
	 final String v1 = "WEB"; // const-string v1, "WEB"
	 /* invoke-direct {v0, v1, v2}, Lcom/mobfox/sdk/data/UrlType;-><init>(Ljava/lang/String;I)V */
	 /* new-instance v0, Lcom/mobfox/sdk/data/UrlType; */
	 final String v1 = "OTHER"; // const-string v1, "OTHER"
	 /* invoke-direct {v0, v1, v3}, Lcom/mobfox/sdk/data/UrlType;-><init>(Ljava/lang/String;I)V */
	 /* .line 3 */
	 int v0 = 2; // const/4 v0, 0x2
	 /* new-array v0, v0, [Lcom/mobfox/sdk/data/UrlType; */
	 v1 = com.mobfox.sdk.data.UrlType.WEB;
	 /* aput-object v1, v0, v2 */
	 v1 = com.mobfox.sdk.data.UrlType.OTHER;
	 /* aput-object v1, v0, v3 */
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
public static com.mobfox.sdk.data.UrlType getValue ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p0, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 7 */
com.mobfox.sdk.data.UrlType .values ( );
/* .local v0, "arr$":[Lcom/mobfox/sdk/data/UrlType; */
/* array-length v2, v0 */
/* .local v2, "len$":I */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i$":I */
} // :goto_0
/* if-ge v1, v2, :cond_1 */
/* aget-object v3, v0, v1 */
/* .line 8 */
/* .local v3, "urlType":Lcom/mobfox/sdk/data/UrlType; */
(( com.mobfox.sdk.data.UrlType ) v3 ).name ( ); // invoke-virtual {v3}, Lcom/mobfox/sdk/data/UrlType;->name()Ljava/lang/String;
v4 = (( java.lang.String ) v4 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v4, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 12 */
} // .end local v3 # "urlType":Lcom/mobfox/sdk/data/UrlType;
} // :goto_1
/* .line 7 */
/* .restart local v3 # "urlType":Lcom/mobfox/sdk/data/UrlType; */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
/* .line 12 */
} // .end local v3 # "urlType":Lcom/mobfox/sdk/data/UrlType;
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
} // .end method
public static com.mobfox.sdk.data.UrlType valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 3 */
/* const-class v0, Lcom/mobfox/sdk/data/UrlType; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/mobfox/sdk/data/UrlType; */
} // .end method
public static com.mobfox.sdk.data.UrlType values ( ) {
/* .locals 1 */
/* .prologue */
/* .line 3 */
v0 = com.mobfox.sdk.data.UrlType.$VALUES;
(( com.mobfox.sdk.data.UrlType ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/mobfox/sdk/data/UrlType;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/mobfox/sdk/data/UrlType; */
} // .end method
