class inal implements org.apache.commons.codec.language.bm.Rule$RPattern {
	 /* .source "Rule.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/apache/commons/codec/language/bm/Rule;->pattern(Ljava/lang/String;)Lorg/apache/commons/codec/language/bm/Rule$RPattern; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = null */
} // .end annotation
/* # instance fields */
final java.lang.String val$content; //synthetic
/* # direct methods */
 inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 432 */
this.val$content = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean isMatch ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .param p1, "input" # Ljava/lang/CharSequence; */
/* .prologue */
/* .line 435 */
v0 = this.val$content;
v0 = (( java.lang.Object ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
} // .end method
Ljava/lang/Object;-><init>()V */
/* .line 75 */
this.phonemes = p1;
/* .line 76 */
return;
} // .end method
 inal ( ) { //synthethic
/* .locals 0 */
/* .param p1, "x0" # Ljava/util/Set; */
/* .param p2, "x1" # Lorg/apache/commons/codec/language/bm/PhoneticEngine$1; */
/* .prologue */
/* .line 58 */
/* invoke-direct {p0, p1}, Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder;-><init>(Ljava/util/Set;)V */
return;
} // .end method
public static org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder empty ( org.apache.commons.codec.language.bm.Languages$LanguageSet p0 ) {
/* .locals 3 */
/* .param p0, "languages" # Lorg/apache/commons/codec/language/bm/Languages$LanguageSet; */
/* .prologue */
/* .line 69 */
/* new-instance v0, Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder; */
/* new-instance v1, Lorg/apache/commons/codec/language/bm/Rule$Phoneme; */
final String v2 = ""; // const-string v2, ""
/* invoke-direct {v1, v2, p0}, Lorg/apache/commons/codec/language/bm/Rule$Phoneme;-><init>(Ljava/lang/CharSequence;Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;)V */
java.util.Collections .singleton ( v1 );
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder;-><init>(Ljava/util/Set;)V */
} // .end method
/* # virtual methods */
public org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder append ( java.lang.CharSequence p0 ) {
/* .locals 4 */
/* .param p1, "str" # Ljava/lang/CharSequence; */
/* .prologue */
/* .line 85 */
/* new-instance v1, Ljava/util/LinkedHashSet; */
/* invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V */
/* .line 87 */
/* .local v1, "newPhonemes":Ljava/util/Set;, "Ljava/util/Set<Lorg/apache/commons/codec/language/bm/Rule$Phoneme;>;" */
v3 = this.phonemes;
/* .local v0, "i$":Ljava/util/Iterator; */
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* check-cast v2, Lorg/apache/commons/codec/language/bm/Rule$Phoneme; */
/* .line 88 */
/* .local v2, "ph":Lorg/apache/commons/codec/language/bm/Rule$Phoneme; */
(( org.apache.commons.codec.language.bm.Rule$Phoneme ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Lorg/apache/commons/codec/language/bm/Rule$Phoneme;->append(Ljava/lang/CharSequence;)Lorg/apache/commons/codec/language/bm/Rule$Phoneme;
/* .line 91 */
} // .end local v2 # "ph":Lorg/apache/commons/codec/language/bm/Rule$Phoneme;
} // :cond_0
/* new-instance v3, Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder; */
/* invoke-direct {v3, v1}, Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder;-><init>(Ljava/util/Set;)V */
} // .end method
public org.apache.commons.codec.language.bm.PhoneticEngine$PhonemeBuilder apply ( org.apache.commons.codec.language.bm.Rule$PhonemeExpr p0, Integer p1 ) {
/* .locals 7 */
/* .param p1, "phonemeExpr" # Lorg/apache/commons/codec/language/bm/Rule$PhonemeExpr; */
/* .param p2, "maxPhonemes" # I */
/* .prologue */
/* .line 106 */
/* new-instance v4, Ljava/util/LinkedHashSet; */
/* invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V */
/* .line 108 */
/* .local v4, "newPhonemes":Ljava/util/Set;, "Ljava/util/Set<Lorg/apache/commons/codec/language/bm/Rule$Phoneme;>;" */
v6 = this.phonemes;
v6 = } // :cond_0
if ( v6 != null) { // if-eqz v6, :cond_2
/* check-cast v3, Lorg/apache/commons/codec/language/bm/Rule$Phoneme; */
/* .line 109 */
/* .local v3, "left":Lorg/apache/commons/codec/language/bm/Rule$Phoneme; */
/* .local v1, "i$":Ljava/util/Iterator; */
} // :cond_1
v6 = } // :goto_0
if ( v6 != null) { // if-eqz v6, :cond_0
/* check-cast v5, Lorg/apache/commons/codec/language/bm/Rule$Phoneme; */
/* .line 110 */
/* .local v5, "right":Lorg/apache/commons/codec/language/bm/Rule$Phoneme; */
(( org.apache.commons.codec.language.bm.Rule$Phoneme ) v3 ).join ( v5 ); // invoke-virtual {v3, v5}, Lorg/apache/commons/codec/language/bm/Rule$Phoneme;->join(Lorg/apache/commons/codec/language/bm/Rule$Phoneme;)Lorg/apache/commons/codec/language/bm/Rule$Phoneme;
/* .line 111 */
/* .local v2, "join":Lorg/apache/commons/codec/language/bm/Rule$Phoneme; */
(( org.apache.commons.codec.language.bm.Rule$Phoneme ) v2 ).getLanguages ( ); // invoke-virtual {v2}, Lorg/apache/commons/codec/language/bm/Rule$Phoneme;->getLanguages()Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;
v6 = (( org.apache.commons.codec.language.bm.Languages$LanguageSet ) v6 ).isEmpty ( ); // invoke-virtual {v6}, Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;->isEmpty()Z
/* if-nez v6, :cond_1 */
v6 = /* .line 112 */
/* if-ge v6, p2, :cond_2 */
/* .line 113 */
/* .line 121 */
} // .end local v1 # "i$":Ljava/util/Iterator;
} // .end local v2 # "join":Lorg/apache/commons/codec/language/bm/Rule$Phoneme;
} // .end local v3 # "left":Lorg/apache/commons/codec/language/bm/Rule$Phoneme;
} // .end local v5 # "right":Lorg/apache/commons/codec/language/bm/Rule$Phoneme;
} // :cond_2
/* new-instance v6, Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder; */
/* invoke-direct {v6, v4}, Lorg/apache/commons/codec/language/bm/PhoneticEngine$PhonemeBuilder;-><init>(Ljava/util/Set;)V */
} // .end method
public java.util.Set getPhonemes ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set", */
/* "<", */
/* "Lorg/apache/commons/codec/language/bm/Rule$Phoneme;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 130 */
v0 = this.phonemes;
} // .end method
public java.lang.String makeString ( ) {
/* .locals 4 */
/* .prologue */
/* .line 141 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 143 */
/* .local v2, "sb":Ljava/lang/StringBuilder; */
v3 = this.phonemes;
/* .local v0, "i$":Ljava/util/Iterator; */
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_1
/* check-cast v1, Lorg/apache/commons/codec/language/bm/Rule$Phoneme; */
/* .line 144 */
/* .local v1, "ph":Lorg/apache/commons/codec/language/bm/Rule$Phoneme; */
v3 = (( java.lang.StringBuilder ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
/* if-lez v3, :cond_0 */
/* .line 145 */
final String v3 = "|"; // const-string v3, "|"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 147 */
} // :cond_0
(( org.apache.commons.codec.language.bm.Rule$Phoneme ) v1 ).getPhonemeText ( ); // invoke-virtual {v1}, Lorg/apache/commons/codec/language/bm/Rule$Phoneme;->getPhonemeText()Ljava/lang/CharSequence;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
/* .line 150 */
} // .end local v1 # "ph":Lorg/apache/commons/codec/language/bm/Rule$Phoneme;
} // :cond_1
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
