public class org.apache.commons.codec.language.Soundex implements org.apache.commons.codec.StringEncoder {
	 /* .source "Soundex.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static final org.apache.commons.codec.language.Soundex US_ENGLISH;
	 private static final US_ENGLISH_MAPPING;
	 public static final java.lang.String US_ENGLISH_MAPPING_STRING;
	 /* # instance fields */
	 private Integer maxLength;
	 /* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
} // .end field
private final soundexMapping;
/* # direct methods */
static org.apache.commons.codec.language.Soundex ( ) {
/* .locals 1 */
/* .prologue */
/* .line 52 */
final String v0 = "01230120022455012623010202"; // const-string v0, "01230120022455012623010202"
(( java.lang.String ) v0 ).toCharArray ( ); // invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
/* .line 59 */
/* new-instance v0, Lorg/apache/commons/codec/language/Soundex; */
/* invoke-direct {v0}, Lorg/apache/commons/codec/language/Soundex;-><init>()V */
return;
} // .end method
public org.apache.commons.codec.language.Soundex ( ) {
/* .locals 1 */
/* .prologue */
/* .line 81 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 66 */
int v0 = 4; // const/4 v0, 0x4
/* iput v0, p0, Lorg/apache/commons/codec/language/Soundex;->maxLength:I */
/* .line 82 */
v0 = org.apache.commons.codec.language.Soundex.US_ENGLISH_MAPPING;
this.soundexMapping = v0;
/* .line 83 */
return;
} // .end method
public org.apache.commons.codec.language.Soundex ( ) {
/* .locals 1 */
/* .param p1, "mapping" # Ljava/lang/String; */
/* .prologue */
/* .line 108 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 66 */
int v0 = 4; // const/4 v0, 0x4
/* iput v0, p0, Lorg/apache/commons/codec/language/Soundex;->maxLength:I */
/* .line 109 */
(( java.lang.String ) p1 ).toCharArray ( ); // invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C
this.soundexMapping = v0;
/* .line 110 */
return;
} // .end method
public org.apache.commons.codec.language.Soundex ( ) {
/* .locals 3 */
/* .param p1, "mapping" # [C */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 95 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 66 */
int v0 = 4; // const/4 v0, 0x4
/* iput v0, p0, Lorg/apache/commons/codec/language/Soundex;->maxLength:I */
/* .line 96 */
/* array-length v0, p1 */
/* new-array v0, v0, [C */
this.soundexMapping = v0;
/* .line 97 */
v0 = this.soundexMapping;
/* array-length v1, p1 */
java.lang.System .arraycopy ( p1,v2,v0,v2,v1 );
/* .line 98 */
return;
} // .end method
private Object getMappingCode ( java.lang.String p0, Integer p1 ) {
/* .locals 7 */
/* .param p1, "str" # Ljava/lang/String; */
/* .param p2, "index" # I */
/* .prologue */
/* const/16 v6, 0x57 */
/* const/16 v5, 0x48 */
/* .line 185 */
v4 = (( java.lang.String ) p1 ).charAt ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C
v2 = /* invoke-direct {p0, v4}, Lorg/apache/commons/codec/language/Soundex;->map(C)C */
/* .line 187 */
/* .local v2, "mappedChar":C */
int v4 = 1; // const/4 v4, 0x1
/* if-le p2, v4, :cond_2 */
/* const/16 v4, 0x30 */
/* if-eq v2, v4, :cond_2 */
/* .line 188 */
/* add-int/lit8 v4, p2, -0x1 */
v1 = (( java.lang.String ) p1 ).charAt ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C
/* .line 189 */
/* .local v1, "hwChar":C */
/* if-eq v5, v1, :cond_0 */
/* if-ne v6, v1, :cond_2 */
/* .line 190 */
} // :cond_0
/* add-int/lit8 v4, p2, -0x2 */
v3 = (( java.lang.String ) p1 ).charAt ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C
/* .line 191 */
/* .local v3, "preHWChar":C */
v0 = /* invoke-direct {p0, v3}, Lorg/apache/commons/codec/language/Soundex;->map(C)C */
/* .line 192 */
/* .local v0, "firstCode":C */
/* if-eq v0, v2, :cond_1 */
/* if-eq v5, v3, :cond_1 */
/* if-ne v6, v3, :cond_2 */
/* .line 193 */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
/* .line 197 */
} // .end local v0 # "firstCode":C
} // .end local v1 # "hwChar":C
} // .end local v2 # "mappedChar":C
} // .end local v3 # "preHWChar":C
} // :cond_2
} // .end method
private getSoundexMapping ( ) {
/* .locals 1 */
/* .prologue */
/* .line 217 */
v0 = this.soundexMapping;
} // .end method
private Object map ( Object p0 ) {
/* .locals 4 */
/* .param p1, "ch" # C */
/* .prologue */
/* .line 230 */
/* add-int/lit8 v0, p1, -0x41 */
/* .line 231 */
/* .local v0, "index":I */
/* if-ltz v0, :cond_0 */
/* invoke-direct {p0}, Lorg/apache/commons/codec/language/Soundex;->getSoundexMapping()[C */
/* array-length v1, v1 */
/* if-lt v0, v1, :cond_1 */
/* .line 232 */
} // :cond_0
/* new-instance v1, Ljava/lang/IllegalArgumentException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "The character is not mapped: "; // const-string v3, "The character is not mapped: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 234 */
} // :cond_1
/* invoke-direct {p0}, Lorg/apache/commons/codec/language/Soundex;->getSoundexMapping()[C */
/* aget-char v1, v1, v0 */
} // .end method
/* # virtual methods */
public Integer difference ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "s1" # Ljava/lang/String; */
/* .param p2, "s2" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 132 */
v0 = org.apache.commons.codec.language.SoundexUtils .difference ( p0,p1,p2 );
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
/* .line 150 */
/* instance-of v0, p1, Ljava/lang/String; */
/* if-nez v0, :cond_0 */
/* .line 151 */
/* new-instance v0, Lorg/apache/commons/codec/EncoderException; */
final String v1 = "Parameter supplied to Soundex encode is not of type java.lang.String"; // const-string v1, "Parameter supplied to Soundex encode is not of type java.lang.String"
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 153 */
} // :cond_0
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "obj":Ljava/lang/Object;
(( org.apache.commons.codec.language.Soundex ) p0 ).soundex ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/Soundex;->soundex(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public java.lang.String encode ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "str" # Ljava/lang/String; */
/* .prologue */
/* .line 167 */
(( org.apache.commons.codec.language.Soundex ) p0 ).soundex ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/Soundex;->soundex(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public Integer getMaxLength ( ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 208 */
/* iget v0, p0, Lorg/apache/commons/codec/language/Soundex;->maxLength:I */
} // .end method
public void setMaxLength ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "maxLength" # I */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 246 */
/* iput p1, p0, Lorg/apache/commons/codec/language/Soundex;->maxLength:I */
/* .line 247 */
return;
} // .end method
public java.lang.String soundex ( java.lang.String p0 ) {
/* .locals 9 */
/* .param p1, "str" # Ljava/lang/String; */
/* .prologue */
int v8 = 0; // const/4 v8, 0x0
/* .line 259 */
/* if-nez p1, :cond_0 */
/* .line 260 */
int v7 = 0; // const/4 v7, 0x0
/* .line 281 */
} // :goto_0
/* .line 262 */
} // :cond_0
org.apache.commons.codec.language.SoundexUtils .clean ( p1 );
/* .line 263 */
v7 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-nez v7, :cond_1 */
/* move-object v7, p1 */
/* .line 264 */
/* .line 266 */
} // :cond_1
int v7 = 4; // const/4 v7, 0x4
/* new-array v6, v7, [C */
/* fill-array-data v6, :array_0 */
/* .line 268 */
/* .local v6, "out":[C */
int v2 = 1; // const/4 v2, 0x1
/* .local v2, "incount":I */
int v0 = 1; // const/4 v0, 0x1
/* .line 269 */
/* .local v0, "count":I */
v7 = (( java.lang.String ) p1 ).charAt ( v8 ); // invoke-virtual {p1, v8}, Ljava/lang/String;->charAt(I)C
/* aput-char v7, v6, v8 */
/* .line 271 */
v4 = /* invoke-direct {p0, p1, v8}, Lorg/apache/commons/codec/language/Soundex;->getMappingCode(Ljava/lang/String;I)C */
/* .line 272 */
/* .local v4, "last":C */
} // :goto_1
v7 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-ge v2, v7, :cond_3 */
/* array-length v7, v6 */
/* if-ge v0, v7, :cond_3 */
/* .line 273 */
/* add-int/lit8 v3, v2, 0x1 */
} // .end local v2 # "incount":I
/* .local v3, "incount":I */
v5 = /* invoke-direct {p0, p1, v2}, Lorg/apache/commons/codec/language/Soundex;->getMappingCode(Ljava/lang/String;I)C */
/* .line 274 */
/* .local v5, "mapped":C */
if ( v5 != null) { // if-eqz v5, :cond_4
/* .line 275 */
/* const/16 v7, 0x30 */
/* if-eq v5, v7, :cond_2 */
/* if-eq v5, v4, :cond_2 */
/* .line 276 */
/* add-int/lit8 v1, v0, 0x1 */
} // .end local v0 # "count":I
/* .local v1, "count":I */
/* aput-char v5, v6, v0 */
/* move v0, v1 */
/* .line 278 */
} // .end local v1 # "count":I
/* .restart local v0 # "count":I */
} // :cond_2
/* move v4, v5 */
/* move v2, v3 */
} // .end local v3 # "incount":I
/* .restart local v2 # "incount":I */
/* .line 281 */
} // .end local v5 # "mapped":C
} // :cond_3
/* new-instance v7, Ljava/lang/String; */
/* invoke-direct {v7, v6}, Ljava/lang/String;-><init>([C)V */
} // .end local v2 # "incount":I
/* .restart local v3 # "incount":I */
/* .restart local v5 # "mapped":C */
} // :cond_4
/* move v2, v3 */
} // .end local v3 # "incount":I
/* .restart local v2 # "incount":I */
/* .line 266 */
/* :array_0 */
/* .array-data 2 */
/* 0x30s */
/* 0x30s */
/* 0x30s */
/* 0x30s */
} // .end array-data
} // .end method
