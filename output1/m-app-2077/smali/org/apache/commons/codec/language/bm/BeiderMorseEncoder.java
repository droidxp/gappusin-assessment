public class org.apache.commons.codec.language.bm.BeiderMorseEncoder implements org.apache.commons.codec.StringEncoder {
	 /* .source "BeiderMorseEncoder.java" */
	 /* # interfaces */
	 /* # instance fields */
	 private org.apache.commons.codec.language.bm.PhoneticEngine engine;
	 /* # direct methods */
	 public org.apache.commons.codec.language.bm.BeiderMorseEncoder ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 71 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 76 */
		 /* new-instance v0, Lorg/apache/commons/codec/language/bm/PhoneticEngine; */
		 v1 = org.apache.commons.codec.language.bm.NameType.GENERIC;
		 v2 = org.apache.commons.codec.language.bm.RuleType.APPROX;
		 int v3 = 1; // const/4 v3, 0x1
		 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;-><init>(Lorg/apache/commons/codec/language/bm/NameType;Lorg/apache/commons/codec/language/bm/RuleType;Z)V */
		 this.engine = v0;
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
	 /* .line 80 */
	 /* instance-of v0, p1, Ljava/lang/String; */
	 /* if-nez v0, :cond_0 */
	 /* .line 81 */
	 /* new-instance v0, Lorg/apache/commons/codec/EncoderException; */
	 final String v1 = "BeiderMorseEncoder encode parameter is not of type String"; // const-string v1, "BeiderMorseEncoder encode parameter is not of type String"
	 /* invoke-direct {v0, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
	 /* .line 83 */
} // :cond_0
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "source":Ljava/lang/Object;
(( org.apache.commons.codec.language.bm.BeiderMorseEncoder ) p0 ).encode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/bm/BeiderMorseEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public java.lang.String encode ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "source" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 88 */
/* if-nez p1, :cond_0 */
/* .line 89 */
int v0 = 0; // const/4 v0, 0x0
/* .line 91 */
} // :goto_0
} // :cond_0
v0 = this.engine;
(( org.apache.commons.codec.language.bm.PhoneticEngine ) v0 ).encode ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;->encode(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public org.apache.commons.codec.language.bm.NameType getNameType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 100 */
v0 = this.engine;
(( org.apache.commons.codec.language.bm.PhoneticEngine ) v0 ).getNameType ( ); // invoke-virtual {v0}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;->getNameType()Lorg/apache/commons/codec/language/bm/NameType;
} // .end method
public org.apache.commons.codec.language.bm.RuleType getRuleType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 109 */
v0 = this.engine;
(( org.apache.commons.codec.language.bm.PhoneticEngine ) v0 ).getRuleType ( ); // invoke-virtual {v0}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;->getRuleType()Lorg/apache/commons/codec/language/bm/RuleType;
} // .end method
public Boolean isConcat ( ) {
/* .locals 1 */
/* .prologue */
/* .line 118 */
v0 = this.engine;
v0 = (( org.apache.commons.codec.language.bm.PhoneticEngine ) v0 ).isConcat ( ); // invoke-virtual {v0}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;->isConcat()Z
} // .end method
public void setConcat ( Boolean p0 ) {
/* .locals 4 */
/* .param p1, "concat" # Z */
/* .prologue */
/* .line 129 */
/* new-instance v0, Lorg/apache/commons/codec/language/bm/PhoneticEngine; */
v1 = this.engine;
(( org.apache.commons.codec.language.bm.PhoneticEngine ) v1 ).getNameType ( ); // invoke-virtual {v1}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;->getNameType()Lorg/apache/commons/codec/language/bm/NameType;
v2 = this.engine;
(( org.apache.commons.codec.language.bm.PhoneticEngine ) v2 ).getRuleType ( ); // invoke-virtual {v2}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;->getRuleType()Lorg/apache/commons/codec/language/bm/RuleType;
v3 = this.engine;
v3 = (( org.apache.commons.codec.language.bm.PhoneticEngine ) v3 ).getMaxPhonemes ( ); // invoke-virtual {v3}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;->getMaxPhonemes()I
/* invoke-direct {v0, v1, v2, p1, v3}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;-><init>(Lorg/apache/commons/codec/language/bm/NameType;Lorg/apache/commons/codec/language/bm/RuleType;ZI)V */
this.engine = v0;
/* .line 133 */
return;
} // .end method
public void setMaxPhonemes ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "maxPhonemes" # I */
/* .prologue */
/* .line 170 */
/* new-instance v0, Lorg/apache/commons/codec/language/bm/PhoneticEngine; */
v1 = this.engine;
(( org.apache.commons.codec.language.bm.PhoneticEngine ) v1 ).getNameType ( ); // invoke-virtual {v1}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;->getNameType()Lorg/apache/commons/codec/language/bm/NameType;
v2 = this.engine;
(( org.apache.commons.codec.language.bm.PhoneticEngine ) v2 ).getRuleType ( ); // invoke-virtual {v2}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;->getRuleType()Lorg/apache/commons/codec/language/bm/RuleType;
v3 = this.engine;
v3 = (( org.apache.commons.codec.language.bm.PhoneticEngine ) v3 ).isConcat ( ); // invoke-virtual {v3}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;->isConcat()Z
/* invoke-direct {v0, v1, v2, v3, p1}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;-><init>(Lorg/apache/commons/codec/language/bm/NameType;Lorg/apache/commons/codec/language/bm/RuleType;ZI)V */
this.engine = v0;
/* .line 174 */
return;
} // .end method
public void setNameType ( org.apache.commons.codec.language.bm.NameType p0 ) {
/* .locals 4 */
/* .param p1, "nameType" # Lorg/apache/commons/codec/language/bm/NameType; */
/* .prologue */
/* .line 143 */
/* new-instance v0, Lorg/apache/commons/codec/language/bm/PhoneticEngine; */
v1 = this.engine;
(( org.apache.commons.codec.language.bm.PhoneticEngine ) v1 ).getRuleType ( ); // invoke-virtual {v1}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;->getRuleType()Lorg/apache/commons/codec/language/bm/RuleType;
v2 = this.engine;
v2 = (( org.apache.commons.codec.language.bm.PhoneticEngine ) v2 ).isConcat ( ); // invoke-virtual {v2}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;->isConcat()Z
v3 = this.engine;
v3 = (( org.apache.commons.codec.language.bm.PhoneticEngine ) v3 ).getMaxPhonemes ( ); // invoke-virtual {v3}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;->getMaxPhonemes()I
/* invoke-direct {v0, p1, v1, v2, v3}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;-><init>(Lorg/apache/commons/codec/language/bm/NameType;Lorg/apache/commons/codec/language/bm/RuleType;ZI)V */
this.engine = v0;
/* .line 147 */
return;
} // .end method
public void setRuleType ( org.apache.commons.codec.language.bm.RuleType p0 ) {
/* .locals 4 */
/* .param p1, "ruleType" # Lorg/apache/commons/codec/language/bm/RuleType; */
/* .prologue */
/* .line 156 */
/* new-instance v0, Lorg/apache/commons/codec/language/bm/PhoneticEngine; */
v1 = this.engine;
(( org.apache.commons.codec.language.bm.PhoneticEngine ) v1 ).getNameType ( ); // invoke-virtual {v1}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;->getNameType()Lorg/apache/commons/codec/language/bm/NameType;
v2 = this.engine;
v2 = (( org.apache.commons.codec.language.bm.PhoneticEngine ) v2 ).isConcat ( ); // invoke-virtual {v2}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;->isConcat()Z
v3 = this.engine;
v3 = (( org.apache.commons.codec.language.bm.PhoneticEngine ) v3 ).getMaxPhonemes ( ); // invoke-virtual {v3}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;->getMaxPhonemes()I
/* invoke-direct {v0, v1, p1, v2, v3}, Lorg/apache/commons/codec/language/bm/PhoneticEngine;-><init>(Lorg/apache/commons/codec/language/bm/NameType;Lorg/apache/commons/codec/language/bm/RuleType;ZI)V */
this.engine = v0;
/* .line 160 */
return;
} // .end method
