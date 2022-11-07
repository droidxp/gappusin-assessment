public class inal extends java.lang.Enum {
	 /* .source "RuleType.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum", */
	 /* "<", */
	 /* "Lorg/apache/commons/codec/language/bm/RuleType;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
private static final org.apache.commons.codec.language.bm.RuleType $VALUES; //synthetic
public static final org.apache.commons.codec.language.bm.RuleType APPROX;
public static final org.apache.commons.codec.language.bm.RuleType EXACT;
public static final org.apache.commons.codec.language.bm.RuleType RULES;
/* # instance fields */
private final java.lang.String name;
/* # direct methods */
static inal ( ) {
	 /* .locals 6 */
	 /* .prologue */
	 int v5 = 2; // const/4 v5, 0x2
	 int v4 = 1; // const/4 v4, 0x1
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 29 */
	 /* new-instance v0, Lorg/apache/commons/codec/language/bm/RuleType; */
	 final String v1 = "APPROX"; // const-string v1, "APPROX"
	 final String v2 = "approx"; // const-string v2, "approx"
	 /* invoke-direct {v0, v1, v3, v2}, Lorg/apache/commons/codec/language/bm/RuleType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 31 */
	 /* new-instance v0, Lorg/apache/commons/codec/language/bm/RuleType; */
	 final String v1 = "EXACT"; // const-string v1, "EXACT"
	 final String v2 = "exact"; // const-string v2, "exact"
	 /* invoke-direct {v0, v1, v4, v2}, Lorg/apache/commons/codec/language/bm/RuleType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 33 */
	 /* new-instance v0, Lorg/apache/commons/codec/language/bm/RuleType; */
	 final String v1 = "RULES"; // const-string v1, "RULES"
	 final String v2 = "rules"; // const-string v2, "rules"
	 /* invoke-direct {v0, v1, v5, v2}, Lorg/apache/commons/codec/language/bm/RuleType;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 26 */
	 int v0 = 3; // const/4 v0, 0x3
	 /* new-array v0, v0, [Lorg/apache/commons/codec/language/bm/RuleType; */
	 v1 = org.apache.commons.codec.language.bm.RuleType.APPROX;
	 /* aput-object v1, v0, v3 */
	 v1 = org.apache.commons.codec.language.bm.RuleType.EXACT;
	 /* aput-object v1, v0, v4 */
	 v1 = org.apache.commons.codec.language.bm.RuleType.RULES;
	 /* aput-object v1, v0, v5 */
	 return;
} // .end method
private inal ( ) {
	 /* .locals 0 */
	 /* .param p3, "name" # Ljava/lang/String; */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/lang/String;", */
	 /* ")V" */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 37 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
/* .line 38 */
this.name = p3;
/* .line 39 */
return;
} // .end method
public static org.apache.commons.codec.language.bm.RuleType valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 26 */
/* const-class v0, Lorg/apache/commons/codec/language/bm/RuleType; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lorg/apache/commons/codec/language/bm/RuleType; */
} // .end method
public static org.apache.commons.codec.language.bm.RuleType values ( ) {
/* .locals 1 */
/* .prologue */
/* .line 26 */
v0 = org.apache.commons.codec.language.bm.RuleType.$VALUES;
(( org.apache.commons.codec.language.bm.RuleType ) v0 ).clone ( ); // invoke-virtual {v0}, [Lorg/apache/commons/codec/language/bm/RuleType;->clone()Ljava/lang/Object;
/* check-cast v0, [Lorg/apache/commons/codec/language/bm/RuleType; */
} // .end method
/* # virtual methods */
public java.lang.String getName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 42 */
v0 = this.name;
} // .end method
