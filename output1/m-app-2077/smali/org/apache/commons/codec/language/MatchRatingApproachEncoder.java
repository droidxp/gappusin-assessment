public class org.apache.commons.codec.language.MatchRatingApproachEncoder implements org.apache.commons.codec.StringEncoder {
	 /* .source "MatchRatingApproachEncoder.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final java.lang.String DOUBLE_CONSONANT;
	 private static final Integer EIGHT;
	 private static final Integer ELEVEN;
	 private static final java.lang.String EMPTY;
	 private static final Integer FIVE;
	 private static final Integer FOUR;
	 private static final Integer ONE;
	 private static final java.lang.String PLAIN_ASCII;
	 private static final Integer SEVEN;
	 private static final Integer SIX;
	 private static final java.lang.String SPACE;
	 private static final Integer THREE;
	 private static final Integer TWELVE;
	 private static final Integer TWO;
	 private static final java.lang.String UNICODE;
	 /* # direct methods */
	 static org.apache.commons.codec.language.MatchRatingApproachEncoder ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 66 */
		 /* const/16 v0, 0x15 */
		 /* new-array v0, v0, [Ljava/lang/String; */
		 int v1 = 0; // const/4 v1, 0x0
		 final String v2 = "BB"; // const-string v2, "BB"
		 /* aput-object v2, v0, v1 */
		 int v1 = 1; // const/4 v1, 0x1
		 final String v2 = "CC"; // const-string v2, "CC"
		 /* aput-object v2, v0, v1 */
		 int v1 = 2; // const/4 v1, 0x2
		 final String v2 = "DD"; // const-string v2, "DD"
		 /* aput-object v2, v0, v1 */
		 int v1 = 3; // const/4 v1, 0x3
		 final String v2 = "FF"; // const-string v2, "FF"
		 /* aput-object v2, v0, v1 */
		 int v1 = 4; // const/4 v1, 0x4
		 final String v2 = "GG"; // const-string v2, "GG"
		 /* aput-object v2, v0, v1 */
		 int v1 = 5; // const/4 v1, 0x5
		 final String v2 = "HH"; // const-string v2, "HH"
		 /* aput-object v2, v0, v1 */
		 int v1 = 6; // const/4 v1, 0x6
		 final String v2 = "JJ"; // const-string v2, "JJ"
		 /* aput-object v2, v0, v1 */
		 int v1 = 7; // const/4 v1, 0x7
		 final String v2 = "KK"; // const-string v2, "KK"
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0x8 */
		 final String v2 = "LL"; // const-string v2, "LL"
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0x9 */
		 final String v2 = "MM"; // const-string v2, "MM"
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0xa */
		 final String v2 = "NN"; // const-string v2, "NN"
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0xb */
		 final String v2 = "PP"; // const-string v2, "PP"
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0xc */
		 final String v2 = "QQ"; // const-string v2, "QQ"
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0xd */
		 final String v2 = "RR"; // const-string v2, "RR"
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0xe */
		 final String v2 = "SS"; // const-string v2, "SS"
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0xf */
		 final String v2 = "TT"; // const-string v2, "TT"
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0x10 */
		 final String v2 = "VV"; // const-string v2, "VV"
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0x11 */
		 final String v2 = "WW"; // const-string v2, "WW"
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0x12 */
		 final String v2 = "XX"; // const-string v2, "XX"
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0x13 */
		 final String v2 = "YY"; // const-string v2, "YY"
		 /* aput-object v2, v0, v1 */
		 /* const/16 v1, 0x14 */
		 final String v2 = "ZZ"; // const-string v2, "ZZ"
		 /* aput-object v2, v0, v1 */
		 return;
	 } // .end method
	 public org.apache.commons.codec.language.MatchRatingApproachEncoder ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 32 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 java.lang.String cleanName ( java.lang.String p0 ) {
		 /* .locals 8 */
		 /* .param p1, "name" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 84 */
		 v6 = java.util.Locale.ENGLISH;
		 (( java.lang.String ) p1 ).toUpperCase ( v6 ); // invoke-virtual {p1, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;
		 /* .line 86 */
		 /* .local v5, "upperName":Ljava/lang/String; */
		 int v6 = 5; // const/4 v6, 0x5
		 /* new-array v1, v6, [Ljava/lang/String; */
		 int v6 = 0; // const/4 v6, 0x0
		 final String v7 = "\\-"; // const-string v7, "\\-"
		 /* aput-object v7, v1, v6 */
		 int v6 = 1; // const/4 v6, 0x1
		 final String v7 = "[&]"; // const-string v7, "[&]"
		 /* aput-object v7, v1, v6 */
		 int v6 = 2; // const/4 v6, 0x2
		 final String v7 = "\\\'"; // const-string v7, "\\\'"
		 /* aput-object v7, v1, v6 */
		 int v6 = 3; // const/4 v6, 0x3
		 final String v7 = "\\."; // const-string v7, "\\."
		 /* aput-object v7, v1, v6 */
		 int v6 = 4; // const/4 v6, 0x4
		 final String v7 = "[\\,]"; // const-string v7, "[\\,]"
		 /* aput-object v7, v1, v6 */
		 /* .line 87 */
		 /* .local v1, "charsToTrim":[Ljava/lang/String; */
		 /* move-object v0, v1 */
		 /* .local v0, "arr$":[Ljava/lang/String; */
		 /* array-length v3, v0 */
		 /* .local v3, "len$":I */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .local v2, "i$":I */
	 } // :goto_0
	 /* if-ge v2, v3, :cond_0 */
	 /* aget-object v4, v0, v2 */
	 /* .line 88 */
	 /* .local v4, "str":Ljava/lang/String; */
	 final String v6 = ""; // const-string v6, ""
	 (( java.lang.String ) v5 ).replaceAll ( v4, v6 ); // invoke-virtual {v5, v4, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
	 /* .line 87 */
	 /* add-int/lit8 v2, v2, 0x1 */
	 /* .line 91 */
} // .end local v4 # "str":Ljava/lang/String;
} // :cond_0
(( org.apache.commons.codec.language.MatchRatingApproachEncoder ) p0 ).removeAccents ( v5 ); // invoke-virtual {p0, v5}, Lorg/apache/commons/codec/language/MatchRatingApproachEncoder;->removeAccents(Ljava/lang/String;)Ljava/lang/String;
/* .line 92 */
final String v6 = "\\s+"; // const-string v6, "\\s+"
final String v7 = ""; // const-string v7, ""
(( java.lang.String ) v5 ).replaceAll ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 94 */
} // .end method
public final java.lang.Object encode ( java.lang.Object p0 ) {
/* .locals 2 */
/* .param p1, "pObject" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 110 */
/* instance-of v0, p1, Ljava/lang/String; */
/* if-nez v0, :cond_0 */
/* .line 111 */
/* new-instance v0, Lorg/apache/commons/codec/EncoderException; */
final String v1 = "Parameter supplied to Match Rating Approach encoder is not of type java.lang.String"; // const-string v1, "Parameter supplied to Match Rating Approach encoder is not of type java.lang.String"
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 114 */
} // :cond_0
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "pObject":Ljava/lang/Object;
(( org.apache.commons.codec.language.MatchRatingApproachEncoder ) p0 ).encode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/MatchRatingApproachEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public final java.lang.String encode ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 127 */
if ( p1 != null) { // if-eqz p1, :cond_0
final String v0 = ""; // const-string v0, ""
v0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
final String v0 = " "; // const-string v0, " "
v0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_1 */
/* .line 128 */
} // :cond_0
final String v0 = ""; // const-string v0, ""
/* .line 144 */
} // :goto_0
/* .line 132 */
} // :cond_1
(( org.apache.commons.codec.language.MatchRatingApproachEncoder ) p0 ).cleanName ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/MatchRatingApproachEncoder;->cleanName(Ljava/lang/String;)Ljava/lang/String;
/* .line 136 */
(( org.apache.commons.codec.language.MatchRatingApproachEncoder ) p0 ).removeVowels ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/MatchRatingApproachEncoder;->removeVowels(Ljava/lang/String;)Ljava/lang/String;
/* .line 139 */
(( org.apache.commons.codec.language.MatchRatingApproachEncoder ) p0 ).removeDoubleConsonants ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/MatchRatingApproachEncoder;->removeDoubleConsonants(Ljava/lang/String;)Ljava/lang/String;
/* .line 142 */
(( org.apache.commons.codec.language.MatchRatingApproachEncoder ) p0 ).getFirst3Last3 ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/MatchRatingApproachEncoder;->getFirst3Last3(Ljava/lang/String;)Ljava/lang/String;
/* move-object v0, p1 */
/* .line 144 */
} // .end method
java.lang.String getFirst3Last3 ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p1, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 160 */
v2 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* .line 162 */
/* .local v2, "nameLength":I */
int v3 = 6; // const/4 v3, 0x6
/* if-le v2, v3, :cond_0 */
/* .line 163 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 3; // const/4 v4, 0x3
(( java.lang.String ) p1 ).substring ( v3, v4 ); // invoke-virtual {p1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 164 */
/* .local v0, "firstThree":Ljava/lang/String; */
/* add-int/lit8 v3, v2, -0x3 */
(( java.lang.String ) p1 ).substring ( v3, v2 ); // invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 165 */
/* .local v1, "lastThree":Ljava/lang/String; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 167 */
} // .end local v0 # "firstThree":Ljava/lang/String;
} // .end local v1 # "lastThree":Ljava/lang/String;
} // .end local p1 # "name":Ljava/lang/String;
} // :cond_0
} // .end method
Integer getMinRating ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "sumLength" # I */
/* .prologue */
/* .line 185 */
int v0 = 0; // const/4 v0, 0x0
/* .line 187 */
/* .local v0, "minRating":I */
int v1 = 4; // const/4 v1, 0x4
/* if-gt p1, v1, :cond_0 */
/* .line 188 */
int v0 = 5; // const/4 v0, 0x5
/* .line 199 */
} // :goto_0
/* .line 189 */
} // :cond_0
int v1 = 5; // const/4 v1, 0x5
/* if-lt p1, v1, :cond_1 */
int v1 = 7; // const/4 v1, 0x7
/* if-gt p1, v1, :cond_1 */
/* .line 190 */
int v0 = 4; // const/4 v0, 0x4
/* .line 191 */
} // :cond_1
/* const/16 v1, 0x8 */
/* if-lt p1, v1, :cond_2 */
/* const/16 v1, 0xb */
/* if-gt p1, v1, :cond_2 */
/* .line 192 */
int v0 = 3; // const/4 v0, 0x3
/* .line 193 */
} // :cond_2
/* const/16 v1, 0xc */
/* if-ne p1, v1, :cond_3 */
/* .line 194 */
int v0 = 2; // const/4 v0, 0x2
/* .line 196 */
} // :cond_3
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean isEncodeEquals ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 7 */
/* .param p1, "name1" # Ljava/lang/String; */
/* .param p2, "name2" # Ljava/lang/String; */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 214 */
if ( p1 != null) { // if-eqz p1, :cond_0
final String v5 = ""; // const-string v5, ""
v5 = (( java.lang.String ) v5 ).equalsIgnoreCase ( p1 ); // invoke-virtual {v5, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v5, :cond_0 */
final String v5 = " "; // const-string v5, " "
v5 = (( java.lang.String ) v5 ).equalsIgnoreCase ( p1 ); // invoke-virtual {v5, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 260 */
} // :cond_0
} // :goto_0
/* .line 216 */
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_0
final String v5 = ""; // const-string v5, ""
v5 = (( java.lang.String ) v5 ).equalsIgnoreCase ( p2 ); // invoke-virtual {v5, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v5, :cond_0 */
final String v5 = " "; // const-string v5, " "
v5 = (( java.lang.String ) v5 ).equalsIgnoreCase ( p2 ); // invoke-virtual {v5, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v5, :cond_0 */
/* .line 218 */
v5 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-eq v5, v3, :cond_0 */
v5 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* if-eq v5, v3, :cond_0 */
/* .line 220 */
v5 = (( java.lang.String ) p1 ).equalsIgnoreCase ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v5 != null) { // if-eqz v5, :cond_2
/* move v4, v3 */
/* .line 221 */
/* .line 225 */
} // :cond_2
(( org.apache.commons.codec.language.MatchRatingApproachEncoder ) p0 ).cleanName ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/MatchRatingApproachEncoder;->cleanName(Ljava/lang/String;)Ljava/lang/String;
/* .line 226 */
(( org.apache.commons.codec.language.MatchRatingApproachEncoder ) p0 ).cleanName ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/commons/codec/language/MatchRatingApproachEncoder;->cleanName(Ljava/lang/String;)Ljava/lang/String;
/* .line 231 */
(( org.apache.commons.codec.language.MatchRatingApproachEncoder ) p0 ).removeVowels ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/MatchRatingApproachEncoder;->removeVowels(Ljava/lang/String;)Ljava/lang/String;
/* .line 232 */
(( org.apache.commons.codec.language.MatchRatingApproachEncoder ) p0 ).removeVowels ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/commons/codec/language/MatchRatingApproachEncoder;->removeVowels(Ljava/lang/String;)Ljava/lang/String;
/* .line 235 */
(( org.apache.commons.codec.language.MatchRatingApproachEncoder ) p0 ).removeDoubleConsonants ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/MatchRatingApproachEncoder;->removeDoubleConsonants(Ljava/lang/String;)Ljava/lang/String;
/* .line 236 */
(( org.apache.commons.codec.language.MatchRatingApproachEncoder ) p0 ).removeDoubleConsonants ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/commons/codec/language/MatchRatingApproachEncoder;->removeDoubleConsonants(Ljava/lang/String;)Ljava/lang/String;
/* .line 239 */
(( org.apache.commons.codec.language.MatchRatingApproachEncoder ) p0 ).getFirst3Last3 ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/MatchRatingApproachEncoder;->getFirst3Last3(Ljava/lang/String;)Ljava/lang/String;
/* .line 240 */
(( org.apache.commons.codec.language.MatchRatingApproachEncoder ) p0 ).getFirst3Last3 ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/commons/codec/language/MatchRatingApproachEncoder;->getFirst3Last3(Ljava/lang/String;)Ljava/lang/String;
/* .line 244 */
v5 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
v6 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* sub-int/2addr v5, v6 */
v5 = java.lang.Math .abs ( v5 );
int v6 = 3; // const/4 v6, 0x3
/* if-ge v5, v6, :cond_0 */
/* .line 250 */
v5 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
v6 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* add-int/2addr v5, v6 */
v2 = java.lang.Math .abs ( v5 );
/* .line 251 */
/* .local v2, "sumLength":I */
int v1 = 0; // const/4 v1, 0x0
/* .line 252 */
/* .local v1, "minRating":I */
v1 = (( org.apache.commons.codec.language.MatchRatingApproachEncoder ) p0 ).getMinRating ( v2 ); // invoke-virtual {p0, v2}, Lorg/apache/commons/codec/language/MatchRatingApproachEncoder;->getMinRating(I)I
/* .line 256 */
v0 = (( org.apache.commons.codec.language.MatchRatingApproachEncoder ) p0 ).leftToRightThenRightToLeftProcessing ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/commons/codec/language/MatchRatingApproachEncoder;->leftToRightThenRightToLeftProcessing(Ljava/lang/String;Ljava/lang/String;)I
/* .line 260 */
/* .local v0, "count":I */
/* if-lt v0, v1, :cond_3 */
} // :goto_1
/* move v4, v3 */
} // :cond_3
/* move v3, v4 */
} // .end method
Boolean isVowel ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "letter" # Ljava/lang/String; */
/* .prologue */
/* .line 277 */
final String v0 = "E"; // const-string v0, "E"
v0 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
final String v0 = "A"; // const-string v0, "A"
v0 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
final String v0 = "O"; // const-string v0, "O"
v0 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
final String v0 = "I"; // const-string v0, "I"
v0 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
final String v0 = "U"; // const-string v0, "U"
v0 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
Integer leftToRightThenRightToLeftProcessing ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 15 */
/* .param p1, "name1" # Ljava/lang/String; */
/* .param p2, "name2" # Ljava/lang/String; */
/* .prologue */
/* .line 295 */
/* invoke-virtual/range {p1 ..p1}, Ljava/lang/String;->toCharArray()[C */
/* .line 296 */
/* .local v2, "name1Char":[C */
/* invoke-virtual/range {p2 ..p2}, Ljava/lang/String;->toCharArray()[C */
/* .line 298 */
/* .local v6, "name2Char":[C */
v12 = /* invoke-virtual/range {p1 ..p1}, Ljava/lang/String;->length()I */
/* add-int/lit8 v5, v12, -0x1 */
/* .line 299 */
/* .local v5, "name1Size":I */
v12 = /* invoke-virtual/range {p2 ..p2}, Ljava/lang/String;->length()I */
/* add-int/lit8 v9, v12, -0x1 */
/* .line 301 */
/* .local v9, "name2Size":I */
final String v4 = ""; // const-string v4, ""
/* .line 302 */
/* .local v4, "name1LtRStart":Ljava/lang/String; */
final String v3 = ""; // const-string v3, ""
/* .line 304 */
/* .local v3, "name1LtREnd":Ljava/lang/String; */
final String v8 = ""; // const-string v8, ""
/* .line 305 */
/* .local v8, "name2RtLStart":Ljava/lang/String; */
final String v7 = ""; // const-string v7, ""
/* .line 307 */
/* .local v7, "name2RtLEnd":Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* array-length v12, v2 */
/* if-ge v1, v12, :cond_0 */
/* .line 308 */
/* if-le v1, v9, :cond_1 */
/* .line 332 */
} // :cond_0
/* new-instance v12, Ljava/lang/String; */
/* invoke-direct {v12, v2}, Ljava/lang/String;-><init>([C)V */
final String v13 = "\\s+"; // const-string v13, "\\s+"
final String v14 = ""; // const-string v14, ""
(( java.lang.String ) v12 ).replaceAll ( v13, v14 ); // invoke-virtual {v12, v13, v14}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 333 */
/* .local v10, "strA":Ljava/lang/String; */
/* new-instance v12, Ljava/lang/String; */
/* invoke-direct {v12, v6}, Ljava/lang/String;-><init>([C)V */
final String v13 = "\\s+"; // const-string v13, "\\s+"
final String v14 = ""; // const-string v14, ""
(( java.lang.String ) v12 ).replaceAll ( v13, v14 ); // invoke-virtual {v12, v13, v14}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 336 */
/* .local v11, "strB":Ljava/lang/String; */
v12 = (( java.lang.String ) v10 ).length ( ); // invoke-virtual {v10}, Ljava/lang/String;->length()I
v13 = (( java.lang.String ) v11 ).length ( ); // invoke-virtual {v11}, Ljava/lang/String;->length()I
/* if-le v12, v13, :cond_4 */
/* .line 337 */
v12 = (( java.lang.String ) v10 ).length ( ); // invoke-virtual {v10}, Ljava/lang/String;->length()I
/* rsub-int/lit8 v12, v12, 0x6 */
v12 = java.lang.Math .abs ( v12 );
/* .line 339 */
} // :goto_1
/* .line 312 */
} // .end local v10 # "strA":Ljava/lang/String;
} // .end local v11 # "strB":Ljava/lang/String;
} // :cond_1
/* add-int/lit8 v12, v1, 0x1 */
/* move-object/from16 v0, p1 */
(( java.lang.String ) v0 ).substring ( v1, v12 ); // invoke-virtual {v0, v1, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 313 */
/* sub-int v12, v5, v1 */
/* sub-int v13, v5, v1 */
/* add-int/lit8 v13, v13, 0x1 */
/* move-object/from16 v0, p1 */
(( java.lang.String ) v0 ).substring ( v12, v13 ); // invoke-virtual {v0, v12, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 315 */
/* add-int/lit8 v12, v1, 0x1 */
/* move-object/from16 v0, p2 */
(( java.lang.String ) v0 ).substring ( v1, v12 ); // invoke-virtual {v0, v1, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 316 */
/* sub-int v12, v9, v1 */
/* sub-int v13, v9, v1 */
/* add-int/lit8 v13, v13, 0x1 */
/* move-object/from16 v0, p2 */
(( java.lang.String ) v0 ).substring ( v12, v13 ); // invoke-virtual {v0, v12, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 319 */
v12 = (( java.lang.String ) v4 ).equals ( v8 ); // invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v12 != null) { // if-eqz v12, :cond_2
/* .line 320 */
/* const/16 v12, 0x20 */
/* aput-char v12, v2, v1 */
/* .line 321 */
/* const/16 v12, 0x20 */
/* aput-char v12, v6, v1 */
/* .line 325 */
} // :cond_2
v12 = (( java.lang.String ) v3 ).equals ( v7 ); // invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v12 != null) { // if-eqz v12, :cond_3
/* .line 326 */
/* sub-int v12, v5, v1 */
/* const/16 v13, 0x20 */
/* aput-char v13, v2, v12 */
/* .line 327 */
/* sub-int v12, v9, v1 */
/* const/16 v13, 0x20 */
/* aput-char v13, v6, v12 */
/* .line 307 */
} // :cond_3
/* add-int/lit8 v1, v1, 0x1 */
/* .line 339 */
/* .restart local v10 # "strA":Ljava/lang/String; */
/* .restart local v11 # "strB":Ljava/lang/String; */
} // :cond_4
v12 = (( java.lang.String ) v11 ).length ( ); // invoke-virtual {v11}, Ljava/lang/String;->length()I
/* rsub-int/lit8 v12, v12, 0x6 */
v12 = java.lang.Math .abs ( v12 );
} // .end method
java.lang.String removeAccents ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p1, "accentedWord" # Ljava/lang/String; */
/* .prologue */
/* .line 352 */
/* if-nez p1, :cond_0 */
/* .line 353 */
int v5 = 0; // const/4 v5, 0x0
/* .line 369 */
} // :goto_0
/* .line 356 */
} // :cond_0
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 357 */
/* .local v4, "sb":Ljava/lang/StringBuilder; */
v2 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* .line 359 */
/* .local v2, "n":I */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_1
/* if-ge v1, v2, :cond_2 */
/* .line 360 */
v0 = (( java.lang.String ) p1 ).charAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C
/* .line 361 */
/* .local v0, "c":C */
final String v5 = "\u00c0\u00e0\u00c8\u00e8\u00cc\u00ec\u00d2\u00f2\u00d9\u00f9\u00c1\u00e1\u00c9\u00e9\u00cd\u00ed\u00d3\u00f3\u00da\u00fa\u00dd\u00fd\u00c2\u00e2\u00ca\u00ea\u00ce\u00ee\u00d4\u00f4\u00db\u00fb\u0176\u0177\u00c3\u00e3\u00d5\u00f5\u00d1\u00f1\u00c4\u00e4\u00cb\u00eb\u00cf\u00ef\u00d6\u00f6\u00dc\u00fc\u0178\u00ff\u00c5\u00e5\u00c7\u00e7\u0150\u0151\u0170\u0171"; // const-string v5, "\u00c0\u00e0\u00c8\u00e8\u00cc\u00ec\u00d2\u00f2\u00d9\u00f9\u00c1\u00e1\u00c9\u00e9\u00cd\u00ed\u00d3\u00f3\u00da\u00fa\u00dd\u00fd\u00c2\u00e2\u00ca\u00ea\u00ce\u00ee\u00d4\u00f4\u00db\u00fb\u0176\u0177\u00c3\u00e3\u00d5\u00f5\u00d1\u00f1\u00c4\u00e4\u00cb\u00eb\u00cf\u00ef\u00d6\u00f6\u00dc\u00fc\u0178\u00ff\u00c5\u00e5\u00c7\u00e7\u0150\u0151\u0170\u0171"
v3 = (( java.lang.String ) v5 ).indexOf ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/String;->indexOf(I)I
/* .line 362 */
/* .local v3, "pos":I */
int v5 = -1; // const/4 v5, -0x1
/* if-le v3, v5, :cond_1 */
/* .line 363 */
final String v5 = "AaEeIiOoUuAaEeIiOoUuYyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu"; // const-string v5, "AaEeIiOoUuAaEeIiOoUuYyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu"
v5 = (( java.lang.String ) v5 ).charAt ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 359 */
} // :goto_2
/* add-int/lit8 v1, v1, 0x1 */
/* .line 365 */
} // :cond_1
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 369 */
} // .end local v0 # "c":C
} // .end local v3 # "pos":I
} // :cond_2
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
java.lang.String removeDoubleConsonants ( java.lang.String p0 ) {
/* .locals 8 */
/* .param p1, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 385 */
(( java.lang.String ) p1 ).toUpperCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
/* .line 386 */
/* .local v4, "replacedName":Ljava/lang/String; */
v0 = org.apache.commons.codec.language.MatchRatingApproachEncoder.DOUBLE_CONSONANT;
/* .local v0, "arr$":[Ljava/lang/String; */
/* array-length v3, v0 */
/* .local v3, "len$":I */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i$":I */
} // :goto_0
/* if-ge v2, v3, :cond_1 */
/* aget-object v1, v0, v2 */
/* .line 387 */
/* .local v1, "dc":Ljava/lang/String; */
v6 = (( java.lang.String ) v4 ).contains ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 388 */
int v6 = 0; // const/4 v6, 0x0
int v7 = 1; // const/4 v7, 0x1
(( java.lang.String ) v1 ).substring ( v6, v7 ); // invoke-virtual {v1, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 389 */
/* .local v5, "singleLetter":Ljava/lang/String; */
(( java.lang.String ) v4 ).replace ( v1, v5 ); // invoke-virtual {v4, v1, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/* .line 386 */
} // .end local v5 # "singleLetter":Ljava/lang/String;
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
/* .line 392 */
} // .end local v1 # "dc":Ljava/lang/String;
} // :cond_1
} // .end method
java.lang.String removeVowels ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 409 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
(( java.lang.String ) p1 ).substring ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 411 */
/* .local v0, "firstLetter":Ljava/lang/String; */
final String v1 = "A"; // const-string v1, "A"
final String v2 = ""; // const-string v2, ""
(( java.lang.String ) p1 ).replaceAll ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 412 */
final String v1 = "E"; // const-string v1, "E"
final String v2 = ""; // const-string v2, ""
(( java.lang.String ) p1 ).replaceAll ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 413 */
final String v1 = "I"; // const-string v1, "I"
final String v2 = ""; // const-string v2, ""
(( java.lang.String ) p1 ).replaceAll ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 414 */
final String v1 = "O"; // const-string v1, "O"
final String v2 = ""; // const-string v2, ""
(( java.lang.String ) p1 ).replaceAll ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 415 */
final String v1 = "U"; // const-string v1, "U"
final String v2 = ""; // const-string v2, ""
(( java.lang.String ) p1 ).replaceAll ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 417 */
final String v1 = "\\s{2,}\\b"; // const-string v1, "\\s{2,}\\b"
final String v2 = " "; // const-string v2, " "
(( java.lang.String ) p1 ).replaceAll ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 420 */
v1 = (( org.apache.commons.codec.language.MatchRatingApproachEncoder ) p0 ).isVowel ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/commons/codec/language/MatchRatingApproachEncoder;->isVowel(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 421 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 423 */
} // .end local p1 # "name":Ljava/lang/String;
} // :cond_0
} // .end method
