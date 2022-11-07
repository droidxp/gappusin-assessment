public class org.apache.commons.codec.language.Caverphone implements org.apache.commons.codec.StringEncoder {
	 /* .source "Caverphone.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* # instance fields */
private final org.apache.commons.codec.language.Caverphone2 encoder;
/* # direct methods */
public org.apache.commons.codec.language.Caverphone ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 47 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 41 */
	 /* new-instance v0, Lorg/apache/commons/codec/language/Caverphone2; */
	 /* invoke-direct {v0}, Lorg/apache/commons/codec/language/Caverphone2;-><init>()V */
	 this.encoder = v0;
	 /* .line 48 */
	 return;
} // .end method
/* # virtual methods */
public java.lang.String caverphone ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .param p1, "source" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 58 */
	 v0 = this.encoder;
	 (( org.apache.commons.codec.language.Caverphone2 ) v0 ).encode ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/commons/codec/language/Caverphone2;->encode(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public java.lang.Object encode ( java.lang.Object p0 ) {
	 /* .locals 2 */
	 /* .param p1, "obj" # Ljava/lang/Object; */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/apache/commons/codec/EncoderException; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 74 */
/* instance-of v0, p1, Ljava/lang/String; */
/* if-nez v0, :cond_0 */
/* .line 75 */
/* new-instance v0, Lorg/apache/commons/codec/EncoderException; */
final String v1 = "Parameter supplied to Caverphone encode is not of type java.lang.String"; // const-string v1, "Parameter supplied to Caverphone encode is not of type java.lang.String"
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 77 */
} // :cond_0
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "obj":Ljava/lang/Object;
(( org.apache.commons.codec.language.Caverphone ) p0 ).caverphone ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/Caverphone;->caverphone(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public java.lang.String encode ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "str" # Ljava/lang/String; */
/* .prologue */
/* .line 89 */
(( org.apache.commons.codec.language.Caverphone ) p0 ).caverphone ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/Caverphone;->caverphone(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public Boolean isCaverphoneEqual ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "str1" # Ljava/lang/String; */
/* .param p2, "str2" # Ljava/lang/String; */
/* .prologue */
/* .line 102 */
(( org.apache.commons.codec.language.Caverphone ) p0 ).caverphone ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/Caverphone;->caverphone(Ljava/lang/String;)Ljava/lang/String;
(( org.apache.commons.codec.language.Caverphone ) p0 ).caverphone ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/commons/codec/language/Caverphone;->caverphone(Ljava/lang/String;)Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
