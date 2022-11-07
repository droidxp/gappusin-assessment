public class org.apache.commons.codec.language.Nysiis implements org.apache.commons.codec.StringEncoder {
	 /* .source "Nysiis.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final CHARS_A;
	 private static final CHARS_AF;
	 private static final CHARS_C;
	 private static final CHARS_FF;
	 private static final CHARS_G;
	 private static final CHARS_N;
	 private static final CHARS_NN;
	 private static final CHARS_S;
	 private static final CHARS_SSS;
	 private static final java.util.regex.Pattern PAT_DT_ETC;
	 private static final java.util.regex.Pattern PAT_EE_IE;
	 private static final java.util.regex.Pattern PAT_K;
	 private static final java.util.regex.Pattern PAT_KN;
	 private static final java.util.regex.Pattern PAT_MAC;
	 private static final java.util.regex.Pattern PAT_PH_PF;
	 private static final java.util.regex.Pattern PAT_SCH;
	 private static final Object SPACE;
	 private static final Integer TRUE_LENGTH;
	 /* # instance fields */
	 private final Boolean strict;
	 /* # direct methods */
	 static org.apache.commons.codec.language.Nysiis ( ) {
		 /* .locals 5 */
		 /* .prologue */
		 int v4 = 2; // const/4 v4, 0x2
		 int v3 = 1; // const/4 v3, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 72 */
		 /* new-array v0, v3, [C */
		 /* const/16 v1, 0x41 */
		 /* aput-char v1, v0, v2 */
		 /* .line 73 */
		 /* new-array v0, v4, [C */
		 /* fill-array-data v0, :array_0 */
		 /* .line 74 */
		 /* new-array v0, v3, [C */
		 /* const/16 v1, 0x43 */
		 /* aput-char v1, v0, v2 */
		 /* .line 75 */
		 /* new-array v0, v4, [C */
		 /* fill-array-data v0, :array_1 */
		 /* .line 76 */
		 /* new-array v0, v3, [C */
		 /* const/16 v1, 0x47 */
		 /* aput-char v1, v0, v2 */
		 /* .line 77 */
		 /* new-array v0, v3, [C */
		 /* const/16 v1, 0x4e */
		 /* aput-char v1, v0, v2 */
		 /* .line 78 */
		 /* new-array v0, v4, [C */
		 /* fill-array-data v0, :array_2 */
		 /* .line 79 */
		 /* new-array v0, v3, [C */
		 /* const/16 v1, 0x53 */
		 /* aput-char v1, v0, v2 */
		 /* .line 80 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* new-array v0, v0, [C */
		 /* fill-array-data v0, :array_3 */
		 /* .line 82 */
		 final String v0 = "^MAC"; // const-string v0, "^MAC"
		 java.util.regex.Pattern .compile ( v0 );
		 /* .line 83 */
		 final String v0 = "^KN"; // const-string v0, "^KN"
		 java.util.regex.Pattern .compile ( v0 );
		 /* .line 84 */
		 final String v0 = "^K"; // const-string v0, "^K"
		 java.util.regex.Pattern .compile ( v0 );
		 /* .line 85 */
		 final String v0 = "^(PH|PF)"; // const-string v0, "^(PH|PF)"
		 java.util.regex.Pattern .compile ( v0 );
		 /* .line 86 */
		 final String v0 = "^SCH"; // const-string v0, "^SCH"
		 java.util.regex.Pattern .compile ( v0 );
		 /* .line 87 */
		 final String v0 = "(EE|IE)$"; // const-string v0, "(EE|IE)$"
		 java.util.regex.Pattern .compile ( v0 );
		 /* .line 88 */
		 final String v0 = "(DT|RT|RD|NT|ND)$"; // const-string v0, "(DT|RT|RD|NT|ND)$"
		 java.util.regex.Pattern .compile ( v0 );
		 return;
		 /* .line 73 */
		 /* nop */
		 /* :array_0 */
		 /* .array-data 2 */
		 /* 0x41s */
		 /* 0x46s */
	 } // .end array-data
	 /* .line 75 */
	 /* :array_1 */
	 /* .array-data 2 */
	 /* 0x46s */
	 /* 0x46s */
} // .end array-data
/* .line 78 */
/* :array_2 */
/* .array-data 2 */
/* 0x4es */
/* 0x4es */
} // .end array-data
/* .line 80 */
/* :array_3 */
/* .array-data 2 */
/* 0x53s */
/* 0x53s */
/* 0x53s */
} // .end array-data
} // .end method
public org.apache.commons.codec.language.Nysiis ( ) {
/* .locals 1 */
/* .prologue */
/* .line 178 */
int v0 = 1; // const/4 v0, 0x1
/* invoke-direct {p0, v0}, Lorg/apache/commons/codec/language/Nysiis;-><init>(Z)V */
/* .line 179 */
return;
} // .end method
public org.apache.commons.codec.language.Nysiis ( ) {
/* .locals 0 */
/* .param p1, "strict" # Z */
/* .prologue */
/* .line 192 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 193 */
/* iput-boolean p1, p0, Lorg/apache/commons/codec/language/Nysiis;->strict:Z */
/* .line 194 */
return;
} // .end method
private static Boolean isVowel ( Object p0 ) {
/* .locals 1 */
/* .param p0, "c" # C */
/* .prologue */
/* .line 101 */
/* const/16 v0, 0x41 */
/* if-eq p0, v0, :cond_0 */
/* const/16 v0, 0x45 */
/* if-eq p0, v0, :cond_0 */
/* const/16 v0, 0x49 */
/* if-eq p0, v0, :cond_0 */
/* const/16 v0, 0x4f */
/* if-eq p0, v0, :cond_0 */
/* const/16 v0, 0x55 */
/* if-ne p0, v0, :cond_1 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
private static transcodeRemaining ( Object p0, Object p1, Object p2, Object p3 ) {
/* .locals 4 */
/* .param p0, "prev" # C */
/* .param p1, "curr" # C */
/* .param p2, "next" # C */
/* .param p3, "aNext" # C */
/* .prologue */
/* const/16 v3, 0x48 */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
/* .line 120 */
/* const/16 v0, 0x45 */
/* if-ne p1, v0, :cond_0 */
/* const/16 v0, 0x56 */
/* if-ne p2, v0, :cond_0 */
/* .line 121 */
v0 = org.apache.commons.codec.language.Nysiis.CHARS_AF;
/* .line 167 */
} // :goto_0
/* .line 125 */
} // :cond_0
v0 = org.apache.commons.codec.language.Nysiis .isVowel ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 126 */
v0 = org.apache.commons.codec.language.Nysiis.CHARS_A;
/* .line 130 */
} // :cond_1
/* const/16 v0, 0x51 */
/* if-ne p1, v0, :cond_2 */
/* .line 131 */
v0 = org.apache.commons.codec.language.Nysiis.CHARS_G;
/* .line 132 */
} // :cond_2
/* const/16 v0, 0x5a */
/* if-ne p1, v0, :cond_3 */
/* .line 133 */
v0 = org.apache.commons.codec.language.Nysiis.CHARS_S;
/* .line 134 */
} // :cond_3
/* const/16 v0, 0x4d */
/* if-ne p1, v0, :cond_4 */
/* .line 135 */
v0 = org.apache.commons.codec.language.Nysiis.CHARS_N;
/* .line 139 */
} // :cond_4
/* const/16 v0, 0x4b */
/* if-ne p1, v0, :cond_6 */
/* .line 140 */
/* const/16 v0, 0x4e */
/* if-ne p2, v0, :cond_5 */
/* .line 141 */
v0 = org.apache.commons.codec.language.Nysiis.CHARS_NN;
/* .line 143 */
} // :cond_5
v0 = org.apache.commons.codec.language.Nysiis.CHARS_C;
/* .line 148 */
} // :cond_6
/* const/16 v0, 0x53 */
/* if-ne p1, v0, :cond_7 */
/* const/16 v0, 0x43 */
/* if-ne p2, v0, :cond_7 */
/* if-ne p3, v3, :cond_7 */
/* .line 149 */
v0 = org.apache.commons.codec.language.Nysiis.CHARS_SSS;
/* .line 153 */
} // :cond_7
/* const/16 v0, 0x50 */
/* if-ne p1, v0, :cond_8 */
/* if-ne p2, v3, :cond_8 */
/* .line 154 */
v0 = org.apache.commons.codec.language.Nysiis.CHARS_FF;
/* .line 158 */
} // :cond_8
/* if-ne p1, v3, :cond_a */
v0 = org.apache.commons.codec.language.Nysiis .isVowel ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_9
v0 = org.apache.commons.codec.language.Nysiis .isVowel ( p2 );
/* if-nez v0, :cond_a */
/* .line 159 */
} // :cond_9
/* new-array v0, v2, [C */
/* aput-char p0, v0, v1 */
/* .line 163 */
} // :cond_a
/* const/16 v0, 0x57 */
/* if-ne p1, v0, :cond_b */
v0 = org.apache.commons.codec.language.Nysiis .isVowel ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 164 */
/* new-array v0, v2, [C */
/* aput-char p0, v0, v1 */
/* .line 167 */
} // :cond_b
/* new-array v0, v2, [C */
/* aput-char p1, v0, v1 */
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
/* .line 211 */
/* instance-of v0, p1, Ljava/lang/String; */
/* if-nez v0, :cond_0 */
/* .line 212 */
/* new-instance v0, Lorg/apache/commons/codec/EncoderException; */
final String v1 = "Parameter supplied to Nysiis encode is not of type java.lang.String"; // const-string v1, "Parameter supplied to Nysiis encode is not of type java.lang.String"
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 214 */
} // :cond_0
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "obj":Ljava/lang/Object;
(( org.apache.commons.codec.language.Nysiis ) p0 ).nysiis ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/Nysiis;->nysiis(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public java.lang.String encode ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "str" # Ljava/lang/String; */
/* .prologue */
/* .line 228 */
(( org.apache.commons.codec.language.Nysiis ) p0 ).nysiis ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/Nysiis;->nysiis(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public Boolean isStrict ( ) {
/* .locals 1 */
/* .prologue */
/* .line 237 */
/* iget-boolean v0, p0, Lorg/apache/commons/codec/language/Nysiis;->strict:Z */
} // .end method
public java.lang.String nysiis ( java.lang.String p0 ) {
/* .locals 13 */
/* .param p1, "str" # Ljava/lang/String; */
/* .prologue */
/* .line 248 */
/* if-nez p1, :cond_1 */
/* .line 249 */
int v8 = 0; // const/4 v8, 0x0
/* .line 316 */
} // :cond_0
} // :goto_0
/* .line 253 */
} // :cond_1
org.apache.commons.codec.language.SoundexUtils .clean ( p1 );
/* .line 255 */
v10 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-nez v10, :cond_2 */
/* move-object v8, p1 */
/* .line 256 */
/* .line 261 */
} // :cond_2
v10 = org.apache.commons.codec.language.Nysiis.PAT_MAC;
(( java.util.regex.Pattern ) v10 ).matcher ( p1 ); // invoke-virtual {v10, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
final String v11 = "MCC"; // const-string v11, "MCC"
(( java.util.regex.Matcher ) v10 ).replaceFirst ( v11 ); // invoke-virtual {v10, v11}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;
/* .line 262 */
v10 = org.apache.commons.codec.language.Nysiis.PAT_KN;
(( java.util.regex.Pattern ) v10 ).matcher ( p1 ); // invoke-virtual {v10, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
final String v11 = "NN"; // const-string v11, "NN"
(( java.util.regex.Matcher ) v10 ).replaceFirst ( v11 ); // invoke-virtual {v10, v11}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;
/* .line 263 */
v10 = org.apache.commons.codec.language.Nysiis.PAT_K;
(( java.util.regex.Pattern ) v10 ).matcher ( p1 ); // invoke-virtual {v10, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
final String v11 = "C"; // const-string v11, "C"
(( java.util.regex.Matcher ) v10 ).replaceFirst ( v11 ); // invoke-virtual {v10, v11}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;
/* .line 264 */
v10 = org.apache.commons.codec.language.Nysiis.PAT_PH_PF;
(( java.util.regex.Pattern ) v10 ).matcher ( p1 ); // invoke-virtual {v10, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
final String v11 = "FF"; // const-string v11, "FF"
(( java.util.regex.Matcher ) v10 ).replaceFirst ( v11 ); // invoke-virtual {v10, v11}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;
/* .line 265 */
v10 = org.apache.commons.codec.language.Nysiis.PAT_SCH;
(( java.util.regex.Pattern ) v10 ).matcher ( p1 ); // invoke-virtual {v10, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
final String v11 = "SSS"; // const-string v11, "SSS"
(( java.util.regex.Matcher ) v10 ).replaceFirst ( v11 ); // invoke-virtual {v10, v11}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;
/* .line 269 */
v10 = org.apache.commons.codec.language.Nysiis.PAT_EE_IE;
(( java.util.regex.Pattern ) v10 ).matcher ( p1 ); // invoke-virtual {v10, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
final String v11 = "Y"; // const-string v11, "Y"
(( java.util.regex.Matcher ) v10 ).replaceFirst ( v11 ); // invoke-virtual {v10, v11}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;
/* .line 270 */
v10 = org.apache.commons.codec.language.Nysiis.PAT_DT_ETC;
(( java.util.regex.Pattern ) v10 ).matcher ( p1 ); // invoke-virtual {v10, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
final String v11 = "D"; // const-string v11, "D"
(( java.util.regex.Matcher ) v10 ).replaceFirst ( v11 ); // invoke-virtual {v10, v11}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;
/* .line 273 */
/* new-instance v3, Ljava/lang/StringBuilder; */
v10 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* invoke-direct {v3, v10}, Ljava/lang/StringBuilder;-><init>(I)V */
/* .line 274 */
/* .local v3, "key":Ljava/lang/StringBuilder; */
int v10 = 0; // const/4 v10, 0x0
v10 = (( java.lang.String ) p1 ).charAt ( v10 ); // invoke-virtual {p1, v10}, Ljava/lang/String;->charAt(I)C
(( java.lang.StringBuilder ) v3 ).append ( v10 ); // invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 277 */
(( java.lang.String ) p1 ).toCharArray ( ); // invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C
/* .line 278 */
/* .local v1, "chars":[C */
/* array-length v6, v1 */
/* .line 280 */
/* .local v6, "len":I */
int v2 = 1; // const/4 v2, 0x1
/* .local v2, "i":I */
} // :goto_1
/* if-ge v2, v6, :cond_6 */
/* .line 281 */
/* add-int/lit8 v10, v6, -0x1 */
/* if-ge v2, v10, :cond_4 */
/* add-int/lit8 v10, v2, 0x1 */
/* aget-char v7, v1, v10 */
/* .line 282 */
/* .local v7, "next":C */
} // :goto_2
/* add-int/lit8 v10, v6, -0x2 */
/* if-ge v2, v10, :cond_5 */
/* add-int/lit8 v10, v2, 0x2 */
/* aget-char v0, v1, v10 */
/* .line 283 */
/* .local v0, "aNext":C */
} // :goto_3
/* add-int/lit8 v10, v2, -0x1 */
/* aget-char v10, v1, v10 */
/* aget-char v11, v1, v2 */
org.apache.commons.codec.language.Nysiis .transcodeRemaining ( v10,v11,v7,v0 );
/* .line 284 */
/* .local v9, "transcoded":[C */
int v10 = 0; // const/4 v10, 0x0
/* array-length v11, v9 */
java.lang.System .arraycopy ( v9,v10,v1,v2,v11 );
/* .line 287 */
/* aget-char v10, v1, v2 */
/* add-int/lit8 v11, v2, -0x1 */
/* aget-char v11, v1, v11 */
/* if-eq v10, v11, :cond_3 */
/* .line 288 */
/* aget-char v10, v1, v2 */
(( java.lang.StringBuilder ) v3 ).append ( v10 ); // invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 280 */
} // :cond_3
/* add-int/lit8 v2, v2, 0x1 */
/* .line 281 */
} // .end local v0 # "aNext":C
} // .end local v7 # "next":C
} // .end local v9 # "transcoded":[C
} // :cond_4
/* const/16 v7, 0x20 */
/* .line 282 */
/* .restart local v7 # "next":C */
} // :cond_5
/* const/16 v0, 0x20 */
/* .line 292 */
} // .end local v7 # "next":C
} // :cond_6
v10 = (( java.lang.StringBuilder ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
int v11 = 1; // const/4 v11, 0x1
/* if-le v10, v11, :cond_9 */
/* .line 293 */
v10 = (( java.lang.StringBuilder ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
/* add-int/lit8 v10, v10, -0x1 */
v5 = (( java.lang.StringBuilder ) v3 ).charAt ( v10 ); // invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->charAt(I)C
/* .line 296 */
/* .local v5, "lastChar":C */
/* const/16 v10, 0x53 */
/* if-ne v5, v10, :cond_7 */
/* .line 297 */
v10 = (( java.lang.StringBuilder ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
/* add-int/lit8 v10, v10, -0x1 */
(( java.lang.StringBuilder ) v3 ).deleteCharAt ( v10 ); // invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
/* .line 298 */
v10 = (( java.lang.StringBuilder ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
/* add-int/lit8 v10, v10, -0x1 */
v5 = (( java.lang.StringBuilder ) v3 ).charAt ( v10 ); // invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->charAt(I)C
/* .line 301 */
} // :cond_7
v10 = (( java.lang.StringBuilder ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
int v11 = 2; // const/4 v11, 0x2
/* if-le v10, v11, :cond_8 */
/* .line 302 */
v10 = (( java.lang.StringBuilder ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
/* add-int/lit8 v10, v10, -0x2 */
v4 = (( java.lang.StringBuilder ) v3 ).charAt ( v10 ); // invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->charAt(I)C
/* .line 304 */
/* .local v4, "last2Char":C */
/* const/16 v10, 0x41 */
/* if-ne v4, v10, :cond_8 */
/* const/16 v10, 0x59 */
/* if-ne v5, v10, :cond_8 */
/* .line 305 */
v10 = (( java.lang.StringBuilder ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
/* add-int/lit8 v10, v10, -0x2 */
(( java.lang.StringBuilder ) v3 ).deleteCharAt ( v10 ); // invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
/* .line 310 */
} // .end local v4 # "last2Char":C
} // :cond_8
/* const/16 v10, 0x41 */
/* if-ne v5, v10, :cond_9 */
/* .line 311 */
v10 = (( java.lang.StringBuilder ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
/* add-int/lit8 v10, v10, -0x1 */
(( java.lang.StringBuilder ) v3 ).deleteCharAt ( v10 ); // invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
/* .line 315 */
} // .end local v5 # "lastChar":C
} // :cond_9
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 316 */
/* .local v8, "string":Ljava/lang/String; */
v10 = (( org.apache.commons.codec.language.Nysiis ) p0 ).isStrict ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/language/Nysiis;->isStrict()Z
if ( v10 != null) { // if-eqz v10, :cond_0
int v10 = 0; // const/4 v10, 0x0
int v11 = 6; // const/4 v11, 0x6
v12 = (( java.lang.String ) v8 ).length ( ); // invoke-virtual {v8}, Ljava/lang/String;->length()I
v11 = java.lang.Math .min ( v11,v12 );
(( java.lang.String ) v8 ).substring ( v10, v11 ); // invoke-virtual {v8, v10, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* goto/16 :goto_0 */
} // .end method
