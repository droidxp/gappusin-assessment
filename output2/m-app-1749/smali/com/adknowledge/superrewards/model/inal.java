public class inal extends java.lang.Enum {
	 /* .source "SROfferType.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum", */
	 /* "<", */
	 /* "Lcom/adknowledge/superrewards/model/SROfferType;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
private static final com.adknowledge.superrewards.model.SROfferType $VALUES; //synthetic
public static final com.adknowledge.superrewards.model.SROfferType DIRECT;
public static final com.adknowledge.superrewards.model.SROfferType INSTALL;
public static final com.adknowledge.superrewards.model.SROfferType LOCALRATE;
public static final com.adknowledge.superrewards.model.SROfferType MOBILE;
public static final com.adknowledge.superrewards.model.SROfferType OFFER;
public static final com.adknowledge.superrewards.model.SROfferType OTHER;
public static final com.adknowledge.superrewards.model.SROfferType PARAMS;
/* # instance fields */
private java.lang.String displayName;
/* # direct methods */
static inal ( ) {
	 /* .locals 9 */
	 /* .prologue */
	 int v8 = 4; // const/4 v8, 0x4
	 int v7 = 3; // const/4 v7, 0x3
	 int v6 = 2; // const/4 v6, 0x2
	 int v5 = 1; // const/4 v5, 0x1
	 int v4 = 0; // const/4 v4, 0x0
	 /* .line 16 */
	 /* new-instance v0, Lcom/adknowledge/superrewards/model/SROfferType; */
	 final String v1 = "OFFER"; // const-string v1, "OFFER"
	 final String v2 = "Offer"; // const-string v2, "Offer"
	 /* invoke-direct {v0, v1, v4, v2}, Lcom/adknowledge/superrewards/model/SROfferType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* new-instance v0, Lcom/adknowledge/superrewards/model/SROfferType; */
	 final String v1 = "INSTALL"; // const-string v1, "INSTALL"
	 final String v2 = "install"; // const-string v2, "install"
	 /* invoke-direct {v0, v1, v5, v2}, Lcom/adknowledge/superrewards/model/SROfferType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* new-instance v0, Lcom/adknowledge/superrewards/model/SROfferType; */
	 final String v1 = "DIRECT"; // const-string v1, "DIRECT"
	 final String v2 = "Direct"; // const-string v2, "Direct"
	 /* invoke-direct {v0, v1, v6, v2}, Lcom/adknowledge/superrewards/model/SROfferType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* new-instance v0, Lcom/adknowledge/superrewards/model/SROfferType; */
	 final String v1 = "OTHER"; // const-string v1, "OTHER"
	 final String v2 = "Other"; // const-string v2, "Other"
	 /* invoke-direct {v0, v1, v7, v2}, Lcom/adknowledge/superrewards/model/SROfferType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* new-instance v0, Lcom/adknowledge/superrewards/model/SROfferType; */
	 final String v1 = "MOBILE"; // const-string v1, "MOBILE"
	 final String v2 = "Mobile"; // const-string v2, "Mobile"
	 /* invoke-direct {v0, v1, v8, v2}, Lcom/adknowledge/superrewards/model/SROfferType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* new-instance v0, Lcom/adknowledge/superrewards/model/SROfferType; */
	 final String v1 = "PARAMS"; // const-string v1, "PARAMS"
	 int v2 = 5; // const/4 v2, 0x5
	 final String v3 = "Params"; // const-string v3, "Params"
	 /* invoke-direct {v0, v1, v2, v3}, Lcom/adknowledge/superrewards/model/SROfferType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* new-instance v0, Lcom/adknowledge/superrewards/model/SROfferType; */
	 final String v1 = "LOCALRATE"; // const-string v1, "LOCALRATE"
	 int v2 = 6; // const/4 v2, 0x6
	 final String v3 = "Localrate"; // const-string v3, "Localrate"
	 /* invoke-direct {v0, v1, v2, v3}, Lcom/adknowledge/superrewards/model/SROfferType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 15 */
	 int v0 = 7; // const/4 v0, 0x7
	 /* new-array v0, v0, [Lcom/adknowledge/superrewards/model/SROfferType; */
	 v1 = com.adknowledge.superrewards.model.SROfferType.OFFER;
	 /* aput-object v1, v0, v4 */
	 v1 = com.adknowledge.superrewards.model.SROfferType.INSTALL;
	 /* aput-object v1, v0, v5 */
	 v1 = com.adknowledge.superrewards.model.SROfferType.DIRECT;
	 /* aput-object v1, v0, v6 */
	 v1 = com.adknowledge.superrewards.model.SROfferType.OTHER;
	 /* aput-object v1, v0, v7 */
	 v1 = com.adknowledge.superrewards.model.SROfferType.MOBILE;
	 /* aput-object v1, v0, v8 */
	 int v1 = 5; // const/4 v1, 0x5
	 v2 = com.adknowledge.superrewards.model.SROfferType.PARAMS;
	 /* aput-object v2, v0, v1 */
	 int v1 = 6; // const/4 v1, 0x6
	 v2 = com.adknowledge.superrewards.model.SROfferType.LOCALRATE;
	 /* aput-object v2, v0, v1 */
	 return;
} // .end method
private inal ( ) {
	 /* .locals 0 */
	 /* .param p3, "displayName" # Ljava/lang/String; */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/lang/String;", */
	 /* ")V" */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 20 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
/* .line 21 */
this.displayName = p3;
/* .line 22 */
return;
} // .end method
public static com.adknowledge.superrewards.model.SROfferType valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 15 */
/* const-class v0, Lcom/adknowledge/superrewards/model/SROfferType; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/adknowledge/superrewards/model/SROfferType; */
} // .end method
public static com.adknowledge.superrewards.model.SROfferType values ( ) {
/* .locals 1 */
/* .prologue */
/* .line 15 */
v0 = com.adknowledge.superrewards.model.SROfferType.$VALUES;
(( com.adknowledge.superrewards.model.SROfferType ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/adknowledge/superrewards/model/SROfferType;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/adknowledge/superrewards/model/SROfferType; */
} // .end method
/* # virtual methods */
public java.lang.String getDisplayName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 25 */
v0 = this.displayName;
} // .end method
