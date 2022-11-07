public class org.apache.commons.codec.language.Metaphone implements org.apache.commons.codec.StringEncoder {
	 /* .source "Metaphone.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final java.lang.String FRONTV;
	 private static final java.lang.String VARSON;
	 private static final java.lang.String VOWELS;
	 /* # instance fields */
	 private Integer maxCodeLen;
	 /* # direct methods */
	 public org.apache.commons.codec.language.Metaphone ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 72 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 66 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* iput v0, p0, Lorg/apache/commons/codec/language/Metaphone;->maxCodeLen:I */
		 /* .line 73 */
		 return;
	 } // .end method
	 private Boolean isLastChar ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .param p1, "wdsz" # I */
		 /* .param p2, "n" # I */
		 /* .prologue */
		 /* .line 363 */
		 /* add-int/lit8 v0, p2, 0x1 */
		 /* if-ne v0, p1, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private Boolean isNextChar ( java.lang.StringBuilder p0, Integer p1, Object p2 ) {
/* .locals 2 */
/* .param p1, "string" # Ljava/lang/StringBuilder; */
/* .param p2, "index" # I */
/* .param p3, "c" # C */
/* .prologue */
/* .line 344 */
int v0 = 0; // const/4 v0, 0x0
/* .line 345 */
/* .local v0, "matches":Z */
/* if-ltz p2, :cond_0 */
v1 = (( java.lang.StringBuilder ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I
/* add-int/lit8 v1, v1, -0x1 */
/* if-ge p2, v1, :cond_0 */
/* .line 347 */
/* add-int/lit8 v1, p2, 0x1 */
v1 = (( java.lang.StringBuilder ) p1 ).charAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->charAt(I)C
/* if-ne v1, p3, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 349 */
} // :cond_0
} // :goto_0
/* .line 347 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
private Boolean isPreviousChar ( java.lang.StringBuilder p0, Integer p1, Object p2 ) {
/* .locals 2 */
/* .param p1, "string" # Ljava/lang/StringBuilder; */
/* .param p2, "index" # I */
/* .param p3, "c" # C */
/* .prologue */
/* .line 335 */
int v0 = 0; // const/4 v0, 0x0
/* .line 336 */
/* .local v0, "matches":Z */
/* if-lez p2, :cond_0 */
v1 = (( java.lang.StringBuilder ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I
/* if-ge p2, v1, :cond_0 */
/* .line 338 */
/* add-int/lit8 v1, p2, -0x1 */
v1 = (( java.lang.StringBuilder ) p1 ).charAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->charAt(I)C
/* if-ne v1, p3, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 340 */
} // :cond_0
} // :goto_0
/* .line 338 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
private Boolean isVowel ( java.lang.StringBuilder p0, Integer p1 ) {
/* .locals 2 */
/* .param p1, "string" # Ljava/lang/StringBuilder; */
/* .param p2, "index" # I */
/* .prologue */
/* .line 331 */
final String v0 = "AEIOU"; // const-string v0, "AEIOU"
v1 = (( java.lang.StringBuilder ) p1 ).charAt ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->charAt(I)C
v0 = (( java.lang.String ) v0 ).indexOf ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I
/* if-ltz v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private Boolean regionMatch ( java.lang.StringBuilder p0, Integer p1, java.lang.String p2 ) {
/* .locals 4 */
/* .param p1, "string" # Ljava/lang/StringBuilder; */
/* .param p2, "index" # I */
/* .param p3, "test" # Ljava/lang/String; */
/* .prologue */
/* .line 353 */
int v0 = 0; // const/4 v0, 0x0
/* .line 354 */
/* .local v0, "matches":Z */
/* if-ltz p2, :cond_0 */
v2 = (( java.lang.String ) p3 ).length ( ); // invoke-virtual {p3}, Ljava/lang/String;->length()I
/* add-int/2addr v2, p2 */
/* add-int/lit8 v2, v2, -0x1 */
v3 = (( java.lang.StringBuilder ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I
/* if-ge v2, v3, :cond_0 */
/* .line 356 */
v2 = (( java.lang.String ) p3 ).length ( ); // invoke-virtual {p3}, Ljava/lang/String;->length()I
/* add-int/2addr v2, p2 */
(( java.lang.StringBuilder ) p1 ).substring ( p2, v2 ); // invoke-virtual {p1, p2, v2}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;
/* .line 357 */
/* .local v1, "substring":Ljava/lang/String; */
v0 = (( java.lang.String ) v1 ).equals ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* .line 359 */
} // .end local v1 # "substring":Ljava/lang/String;
} // :cond_0
} // .end method
/* # virtual methods */
public java.lang.Object encode ( java.lang.Object p0 ) {
/* .locals 2 */
/* .param p1, "obj" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 381 */
/* instance-of v0, p1, Ljava/lang/String; */
/* if-nez v0, :cond_0 */
/* .line 382 */
/* new-instance v0, Lorg/apache/commons/codec/EncoderException; */
final String v1 = "Parameter supplied to Metaphone encode is not of type java.lang.String"; // const-string v1, "Parameter supplied to Metaphone encode is not of type java.lang.String"
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 384 */
} // :cond_0
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "obj":Ljava/lang/Object;
(( org.apache.commons.codec.language.Metaphone ) p0 ).metaphone ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/Metaphone;->metaphone(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public java.lang.String encode ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "str" # Ljava/lang/String; */
/* .prologue */
/* .line 395 */
(( org.apache.commons.codec.language.Metaphone ) p0 ).metaphone ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/Metaphone;->metaphone(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public Integer getMaxCodeLen ( ) {
/* .locals 1 */
/* .prologue */
/* .line 414 */
/* iget v0, p0, Lorg/apache/commons/codec/language/Metaphone;->maxCodeLen:I */
} // .end method
public Boolean isMetaphoneEqual ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "str1" # Ljava/lang/String; */
/* .param p2, "str2" # Ljava/lang/String; */
/* .prologue */
/* .line 407 */
(( org.apache.commons.codec.language.Metaphone ) p0 ).metaphone ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/Metaphone;->metaphone(Ljava/lang/String;)Ljava/lang/String;
(( org.apache.commons.codec.language.Metaphone ) p0 ).metaphone ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/commons/codec/language/Metaphone;->metaphone(Ljava/lang/String;)Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
public java.lang.String metaphone ( java.lang.String p0 ) {
/* .locals 14 */
/* .param p1, "txt" # Ljava/lang/String; */
/* .prologue */
/* const/16 v13, 0x58 */
/* const/16 v12, 0x4b */
/* const/16 v11, 0x53 */
/* const/16 v10, 0x48 */
int v9 = 1; // const/4 v9, 0x1
/* .line 86 */
int v1 = 0; // const/4 v1, 0x0
/* .line 87 */
/* .local v1, "hard":Z */
if ( p1 != null) { // if-eqz p1, :cond_0
v7 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-nez v7, :cond_1 */
/* .line 88 */
} // :cond_0
final String v7 = ""; // const-string v7, ""
/* .line 327 */
} // :goto_0
/* .line 91 */
} // :cond_1
v7 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-ne v7, v9, :cond_2 */
/* .line 92 */
v7 = java.util.Locale.ENGLISH;
(( java.lang.String ) p1 ).toUpperCase ( v7 ); // invoke-virtual {p1, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;
/* .line 95 */
} // :cond_2
v7 = java.util.Locale.ENGLISH;
(( java.lang.String ) p1 ).toUpperCase ( v7 ); // invoke-virtual {p1, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;
(( java.lang.String ) v7 ).toCharArray ( ); // invoke-virtual {v7}, Ljava/lang/String;->toCharArray()[C
/* .line 97 */
/* .local v2, "inwd":[C */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* const/16 v7, 0x28 */
/* invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(I)V */
/* .line 98 */
/* .local v3, "local":Ljava/lang/StringBuilder; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* const/16 v7, 0xa */
/* invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(I)V */
/* .line 100 */
/* .local v0, "code":Ljava/lang/StringBuilder; */
int v7 = 0; // const/4 v7, 0x0
/* aget-char v7, v2, v7 */
/* sparse-switch v7, :sswitch_data_0 */
/* .line 134 */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;
/* .line 137 */
} // :goto_1
v6 = (( java.lang.StringBuilder ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
/* .line 138 */
/* .local v6, "wdsz":I */
int v4 = 0; // const/4 v4, 0x0
/* .line 140 */
/* .local v4, "n":I */
} // :cond_3
} // :goto_2
v7 = (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
v8 = (( org.apache.commons.codec.language.Metaphone ) p0 ).getMaxCodeLen ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/language/Metaphone;->getMaxCodeLen()I
/* if-ge v7, v8, :cond_1f */
/* if-ge v4, v6, :cond_1f */
/* .line 142 */
v5 = (( java.lang.StringBuilder ) v3 ).charAt ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->charAt(I)C
/* .line 144 */
/* .local v5, "symb":C */
/* const/16 v7, 0x43 */
/* if-eq v5, v7, :cond_8 */
v7 = /* invoke-direct {p0, v3, v4, v5}, Lorg/apache/commons/codec/language/Metaphone;->isPreviousChar(Ljava/lang/StringBuilder;IC)Z */
if ( v7 != null) { // if-eqz v7, :cond_8
/* .line 145 */
/* add-int/lit8 v4, v4, 0x1 */
/* .line 323 */
} // :goto_3
v7 = (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
v8 = (( org.apache.commons.codec.language.Metaphone ) p0 ).getMaxCodeLen ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/language/Metaphone;->getMaxCodeLen()I
/* if-le v7, v8, :cond_3 */
/* .line 324 */
v7 = (( org.apache.commons.codec.language.Metaphone ) p0 ).getMaxCodeLen ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/language/Metaphone;->getMaxCodeLen()I
(( java.lang.StringBuilder ) v0 ).setLength ( v7 ); // invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->setLength(I)V
/* .line 104 */
} // .end local v4 # "n":I
} // .end local v5 # "symb":C
} // .end local v6 # "wdsz":I
/* :sswitch_0 */
/* aget-char v7, v2, v9 */
/* const/16 v8, 0x4e */
/* if-ne v7, v8, :cond_4 */
/* .line 105 */
/* array-length v7, v2 */
/* add-int/lit8 v7, v7, -0x1 */
(( java.lang.StringBuilder ) v3 ).append ( v2, v9, v7 ); // invoke-virtual {v3, v2, v9, v7}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
/* .line 107 */
} // :cond_4
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;
/* .line 111 */
/* :sswitch_1 */
/* aget-char v7, v2, v9 */
/* const/16 v8, 0x45 */
/* if-ne v7, v8, :cond_5 */
/* .line 112 */
/* array-length v7, v2 */
/* add-int/lit8 v7, v7, -0x1 */
(( java.lang.StringBuilder ) v3 ).append ( v2, v9, v7 ); // invoke-virtual {v3, v2, v9, v7}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
/* .line 114 */
} // :cond_5
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;
/* .line 118 */
/* :sswitch_2 */
/* aget-char v7, v2, v9 */
/* const/16 v8, 0x52 */
/* if-ne v7, v8, :cond_6 */
/* .line 119 */
/* array-length v7, v2 */
/* add-int/lit8 v7, v7, -0x1 */
(( java.lang.StringBuilder ) v3 ).append ( v2, v9, v7 ); // invoke-virtual {v3, v2, v9, v7}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
/* .line 122 */
} // :cond_6
/* aget-char v7, v2, v9 */
/* if-ne v7, v10, :cond_7 */
/* .line 123 */
/* array-length v7, v2 */
/* add-int/lit8 v7, v7, -0x1 */
(( java.lang.StringBuilder ) v3 ).append ( v2, v9, v7 ); // invoke-virtual {v3, v2, v9, v7}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
/* .line 124 */
int v7 = 0; // const/4 v7, 0x0
/* const/16 v8, 0x57 */
(( java.lang.StringBuilder ) v3 ).setCharAt ( v7, v8 ); // invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->setCharAt(IC)V
/* .line 126 */
} // :cond_7
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;
/* .line 130 */
/* :sswitch_3 */
int v7 = 0; // const/4 v7, 0x0
/* aput-char v11, v2, v7 */
/* .line 131 */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;
/* .line 147 */
/* .restart local v4 # "n":I */
/* .restart local v5 # "symb":C */
/* .restart local v6 # "wdsz":I */
} // :cond_8
/* packed-switch v5, :pswitch_data_0 */
/* .line 321 */
} // :cond_9
} // :goto_4
/* add-int/lit8 v4, v4, 0x1 */
/* .line 153 */
/* :pswitch_0 */
/* if-nez v4, :cond_9 */
/* .line 154 */
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 158 */
/* :pswitch_1 */
/* const/16 v7, 0x4d */
v7 = /* invoke-direct {p0, v3, v4, v7}, Lorg/apache/commons/codec/language/Metaphone;->isPreviousChar(Ljava/lang/StringBuilder;IC)Z */
if ( v7 != null) { // if-eqz v7, :cond_a
v7 = /* invoke-direct {p0, v6, v4}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z */
/* if-nez v7, :cond_9 */
/* .line 162 */
} // :cond_a
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 166 */
/* :pswitch_2 */
v7 = /* invoke-direct {p0, v3, v4, v11}, Lorg/apache/commons/codec/language/Metaphone;->isPreviousChar(Ljava/lang/StringBuilder;IC)Z */
if ( v7 != null) { // if-eqz v7, :cond_b
v7 = /* invoke-direct {p0, v6, v4}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z */
/* if-nez v7, :cond_b */
final String v7 = "EIY"; // const-string v7, "EIY"
/* add-int/lit8 v8, v4, 0x1 */
v8 = (( java.lang.StringBuilder ) v3 ).charAt ( v8 ); // invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->charAt(I)C
v7 = (( java.lang.String ) v7 ).indexOf ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(I)I
/* if-gez v7, :cond_9 */
/* .line 171 */
} // :cond_b
final String v7 = "CIA"; // const-string v7, "CIA"
v7 = /* invoke-direct {p0, v3, v4, v7}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuilder;ILjava/lang/String;)Z */
if ( v7 != null) { // if-eqz v7, :cond_c
/* .line 172 */
(( java.lang.StringBuilder ) v0 ).append ( v13 ); // invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 175 */
} // :cond_c
v7 = /* invoke-direct {p0, v6, v4}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z */
/* if-nez v7, :cond_d */
final String v7 = "EIY"; // const-string v7, "EIY"
/* add-int/lit8 v8, v4, 0x1 */
v8 = (( java.lang.StringBuilder ) v3 ).charAt ( v8 ); // invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->charAt(I)C
v7 = (( java.lang.String ) v7 ).indexOf ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(I)I
/* if-ltz v7, :cond_d */
/* .line 177 */
(( java.lang.StringBuilder ) v0 ).append ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 180 */
} // :cond_d
v7 = /* invoke-direct {p0, v3, v4, v11}, Lorg/apache/commons/codec/language/Metaphone;->isPreviousChar(Ljava/lang/StringBuilder;IC)Z */
if ( v7 != null) { // if-eqz v7, :cond_e
v7 = /* invoke-direct {p0, v3, v4, v10}, Lorg/apache/commons/codec/language/Metaphone;->isNextChar(Ljava/lang/StringBuilder;IC)Z */
if ( v7 != null) { // if-eqz v7, :cond_e
/* .line 182 */
(( java.lang.StringBuilder ) v0 ).append ( v12 ); // invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 185 */
} // :cond_e
v7 = /* invoke-direct {p0, v3, v4, v10}, Lorg/apache/commons/codec/language/Metaphone;->isNextChar(Ljava/lang/StringBuilder;IC)Z */
if ( v7 != null) { // if-eqz v7, :cond_10
/* .line 186 */
/* if-nez v4, :cond_f */
int v7 = 3; // const/4 v7, 0x3
/* if-lt v6, v7, :cond_f */
int v7 = 2; // const/4 v7, 0x2
v7 = /* invoke-direct {p0, v3, v7}, Lorg/apache/commons/codec/language/Metaphone;->isVowel(Ljava/lang/StringBuilder;I)Z */
if ( v7 != null) { // if-eqz v7, :cond_f
/* .line 189 */
(( java.lang.StringBuilder ) v0 ).append ( v12 ); // invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 191 */
} // :cond_f
(( java.lang.StringBuilder ) v0 ).append ( v13 ); // invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 194 */
} // :cond_10
(( java.lang.StringBuilder ) v0 ).append ( v12 ); // invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 198 */
/* :pswitch_3 */
/* add-int/lit8 v7, v4, 0x1 */
v7 = /* invoke-direct {p0, v6, v7}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z */
/* if-nez v7, :cond_11 */
/* const/16 v7, 0x47 */
v7 = /* invoke-direct {p0, v3, v4, v7}, Lorg/apache/commons/codec/language/Metaphone;->isNextChar(Ljava/lang/StringBuilder;IC)Z */
if ( v7 != null) { // if-eqz v7, :cond_11
final String v7 = "EIY"; // const-string v7, "EIY"
/* add-int/lit8 v8, v4, 0x2 */
v8 = (( java.lang.StringBuilder ) v3 ).charAt ( v8 ); // invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->charAt(I)C
v7 = (( java.lang.String ) v7 ).indexOf ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(I)I
/* if-ltz v7, :cond_11 */
/* .line 201 */
/* const/16 v7, 0x4a */
(( java.lang.StringBuilder ) v0 ).append ( v7 ); // invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* add-int/lit8 v4, v4, 0x2 */
/* goto/16 :goto_4 */
/* .line 203 */
} // :cond_11
/* const/16 v7, 0x54 */
(( java.lang.StringBuilder ) v0 ).append ( v7 ); // invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 207 */
/* :pswitch_4 */
/* add-int/lit8 v7, v4, 0x1 */
v7 = /* invoke-direct {p0, v6, v7}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z */
if ( v7 != null) { // if-eqz v7, :cond_12
v7 = /* invoke-direct {p0, v3, v4, v10}, Lorg/apache/commons/codec/language/Metaphone;->isNextChar(Ljava/lang/StringBuilder;IC)Z */
/* if-nez v7, :cond_9 */
/* .line 211 */
} // :cond_12
/* add-int/lit8 v7, v4, 0x1 */
v7 = /* invoke-direct {p0, v6, v7}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z */
/* if-nez v7, :cond_13 */
v7 = /* invoke-direct {p0, v3, v4, v10}, Lorg/apache/commons/codec/language/Metaphone;->isNextChar(Ljava/lang/StringBuilder;IC)Z */
if ( v7 != null) { // if-eqz v7, :cond_13
/* add-int/lit8 v7, v4, 0x2 */
v7 = /* invoke-direct {p0, v3, v7}, Lorg/apache/commons/codec/language/Metaphone;->isVowel(Ljava/lang/StringBuilder;I)Z */
if ( v7 != null) { // if-eqz v7, :cond_9
/* .line 216 */
} // :cond_13
/* if-lez v4, :cond_14 */
final String v7 = "GN"; // const-string v7, "GN"
v7 = /* invoke-direct {p0, v3, v4, v7}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuilder;ILjava/lang/String;)Z */
/* if-nez v7, :cond_9 */
final String v7 = "GNED"; // const-string v7, "GNED"
v7 = /* invoke-direct {p0, v3, v4, v7}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuilder;ILjava/lang/String;)Z */
/* if-nez v7, :cond_9 */
/* .line 221 */
} // :cond_14
/* const/16 v7, 0x47 */
v7 = /* invoke-direct {p0, v3, v4, v7}, Lorg/apache/commons/codec/language/Metaphone;->isPreviousChar(Ljava/lang/StringBuilder;IC)Z */
if ( v7 != null) { // if-eqz v7, :cond_15
/* .line 223 */
int v1 = 1; // const/4 v1, 0x1
/* .line 227 */
} // :goto_5
v7 = /* invoke-direct {p0, v6, v4}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z */
/* if-nez v7, :cond_16 */
final String v7 = "EIY"; // const-string v7, "EIY"
/* add-int/lit8 v8, v4, 0x1 */
v8 = (( java.lang.StringBuilder ) v3 ).charAt ( v8 ); // invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->charAt(I)C
v7 = (( java.lang.String ) v7 ).indexOf ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(I)I
/* if-ltz v7, :cond_16 */
/* if-nez v1, :cond_16 */
/* .line 230 */
/* const/16 v7, 0x4a */
(( java.lang.StringBuilder ) v0 ).append ( v7 ); // invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 225 */
} // :cond_15
int v1 = 0; // const/4 v1, 0x0
/* .line 232 */
} // :cond_16
(( java.lang.StringBuilder ) v0 ).append ( v12 ); // invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 236 */
/* :pswitch_5 */
v7 = /* invoke-direct {p0, v6, v4}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z */
/* if-nez v7, :cond_9 */
/* .line 239 */
/* if-lez v4, :cond_17 */
final String v7 = "CSPTG"; // const-string v7, "CSPTG"
/* add-int/lit8 v8, v4, -0x1 */
v8 = (( java.lang.StringBuilder ) v3 ).charAt ( v8 ); // invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->charAt(I)C
v7 = (( java.lang.String ) v7 ).indexOf ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(I)I
/* if-gez v7, :cond_9 */
/* .line 243 */
} // :cond_17
/* add-int/lit8 v7, v4, 0x1 */
v7 = /* invoke-direct {p0, v3, v7}, Lorg/apache/commons/codec/language/Metaphone;->isVowel(Ljava/lang/StringBuilder;I)Z */
if ( v7 != null) { // if-eqz v7, :cond_9
/* .line 244 */
(( java.lang.StringBuilder ) v0 ).append ( v10 ); // invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 253 */
/* :pswitch_6 */
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 256 */
/* :pswitch_7 */
/* if-lez v4, :cond_18 */
/* .line 257 */
/* const/16 v7, 0x43 */
v7 = /* invoke-direct {p0, v3, v4, v7}, Lorg/apache/commons/codec/language/Metaphone;->isPreviousChar(Ljava/lang/StringBuilder;IC)Z */
/* if-nez v7, :cond_9 */
/* .line 258 */
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 261 */
} // :cond_18
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 265 */
/* :pswitch_8 */
v7 = /* invoke-direct {p0, v3, v4, v10}, Lorg/apache/commons/codec/language/Metaphone;->isNextChar(Ljava/lang/StringBuilder;IC)Z */
if ( v7 != null) { // if-eqz v7, :cond_19
/* .line 267 */
/* const/16 v7, 0x46 */
(( java.lang.StringBuilder ) v0 ).append ( v7 ); // invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 269 */
} // :cond_19
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 273 */
/* :pswitch_9 */
(( java.lang.StringBuilder ) v0 ).append ( v12 ); // invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 276 */
/* :pswitch_a */
final String v7 = "SH"; // const-string v7, "SH"
v7 = /* invoke-direct {p0, v3, v4, v7}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuilder;ILjava/lang/String;)Z */
/* if-nez v7, :cond_1a */
final String v7 = "SIO"; // const-string v7, "SIO"
v7 = /* invoke-direct {p0, v3, v4, v7}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuilder;ILjava/lang/String;)Z */
/* if-nez v7, :cond_1a */
final String v7 = "SIA"; // const-string v7, "SIA"
v7 = /* invoke-direct {p0, v3, v4, v7}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuilder;ILjava/lang/String;)Z */
if ( v7 != null) { // if-eqz v7, :cond_1b
/* .line 279 */
} // :cond_1a
(( java.lang.StringBuilder ) v0 ).append ( v13 ); // invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 281 */
} // :cond_1b
(( java.lang.StringBuilder ) v0 ).append ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 285 */
/* :pswitch_b */
final String v7 = "TIA"; // const-string v7, "TIA"
v7 = /* invoke-direct {p0, v3, v4, v7}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuilder;ILjava/lang/String;)Z */
/* if-nez v7, :cond_1c */
final String v7 = "TIO"; // const-string v7, "TIO"
v7 = /* invoke-direct {p0, v3, v4, v7}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuilder;ILjava/lang/String;)Z */
if ( v7 != null) { // if-eqz v7, :cond_1d
/* .line 287 */
} // :cond_1c
(( java.lang.StringBuilder ) v0 ).append ( v13 ); // invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 290 */
} // :cond_1d
final String v7 = "TCH"; // const-string v7, "TCH"
v7 = /* invoke-direct {p0, v3, v4, v7}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuilder;ILjava/lang/String;)Z */
/* if-nez v7, :cond_9 */
/* .line 295 */
final String v7 = "TH"; // const-string v7, "TH"
v7 = /* invoke-direct {p0, v3, v4, v7}, Lorg/apache/commons/codec/language/Metaphone;->regionMatch(Ljava/lang/StringBuilder;ILjava/lang/String;)Z */
if ( v7 != null) { // if-eqz v7, :cond_1e
/* .line 296 */
/* const/16 v7, 0x30 */
(( java.lang.StringBuilder ) v0 ).append ( v7 ); // invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 298 */
} // :cond_1e
/* const/16 v7, 0x54 */
(( java.lang.StringBuilder ) v0 ).append ( v7 ); // invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 302 */
/* :pswitch_c */
/* const/16 v7, 0x46 */
(( java.lang.StringBuilder ) v0 ).append ( v7 ); // invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 305 */
/* :pswitch_d */
v7 = /* invoke-direct {p0, v6, v4}, Lorg/apache/commons/codec/language/Metaphone;->isLastChar(II)Z */
/* if-nez v7, :cond_9 */
/* add-int/lit8 v7, v4, 0x1 */
v7 = /* invoke-direct {p0, v3, v7}, Lorg/apache/commons/codec/language/Metaphone;->isVowel(Ljava/lang/StringBuilder;I)Z */
if ( v7 != null) { // if-eqz v7, :cond_9
/* .line 307 */
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 311 */
/* :pswitch_e */
(( java.lang.StringBuilder ) v0 ).append ( v12 ); // invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 312 */
(( java.lang.StringBuilder ) v0 ).append ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 315 */
/* :pswitch_f */
(( java.lang.StringBuilder ) v0 ).append ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* goto/16 :goto_4 */
/* .line 327 */
} // .end local v5 # "symb":C
} // :cond_1f
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* goto/16 :goto_0 */
/* .line 100 */
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x41 -> :sswitch_1 */
/* 0x47 -> :sswitch_0 */
/* 0x4b -> :sswitch_0 */
/* 0x50 -> :sswitch_0 */
/* 0x57 -> :sswitch_2 */
/* 0x58 -> :sswitch_3 */
} // .end sparse-switch
/* .line 147 */
/* :pswitch_data_0 */
/* .packed-switch 0x41 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_0 */
/* :pswitch_6 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_0 */
/* :pswitch_6 */
/* :pswitch_7 */
/* :pswitch_6 */
/* :pswitch_6 */
/* :pswitch_6 */
/* :pswitch_0 */
/* :pswitch_8 */
/* :pswitch_9 */
/* :pswitch_6 */
/* :pswitch_a */
/* :pswitch_b */
/* :pswitch_0 */
/* :pswitch_c */
/* :pswitch_d */
/* :pswitch_e */
/* :pswitch_d */
/* :pswitch_f */
} // .end packed-switch
} // .end method
public void setMaxCodeLen ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "maxCodeLen" # I */
/* .prologue */
/* .line 420 */
/* iput p1, p0, Lorg/apache/commons/codec/language/Metaphone;->maxCodeLen:I */
return;
} // .end method
