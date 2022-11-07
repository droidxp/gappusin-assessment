public abstract class org.apache.commons.codec.language.AbstractCaverphone implements org.apache.commons.codec.StringEncoder {
	 /* .source "AbstractCaverphone.java" */
	 /* # interfaces */
	 /* # direct methods */
	 public org.apache.commons.codec.language.AbstractCaverphone ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 41 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 42 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object encode ( java.lang.Object p0 ) {
		 /* .locals 2 */
		 /* .param p1, "source" # Ljava/lang/Object; */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lorg/apache/commons/codec/EncoderException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 57 */
	 /* instance-of v0, p1, Ljava/lang/String; */
	 /* if-nez v0, :cond_0 */
	 /* .line 58 */
	 /* new-instance v0, Lorg/apache/commons/codec/EncoderException; */
	 final String v1 = "Parameter supplied to Caverphone encode is not of type java.lang.String"; // const-string v1, "Parameter supplied to Caverphone encode is not of type java.lang.String"
	 /* invoke-direct {v0, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
	 /* .line 60 */
} // :cond_0
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "source":Ljava/lang/Object;
(( org.apache.commons.codec.language.AbstractCaverphone ) p0 ).encode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/AbstractCaverphone;->encode(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public Boolean isEncodeEqual ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "str1" # Ljava/lang/String; */
/* .param p2, "str2" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 76 */
(( org.apache.commons.codec.language.AbstractCaverphone ) p0 ).encode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/AbstractCaverphone;->encode(Ljava/lang/String;)Ljava/lang/String;
(( org.apache.commons.codec.language.AbstractCaverphone ) p0 ).encode ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/commons/codec/language/AbstractCaverphone;->encode(Ljava/lang/String;)Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
