public class org.apache.commons.codec.language.ColognePhonetic implements org.apache.commons.codec.StringEncoder {
	 /* .source "ColognePhonetic.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer;, */
	 /* Lorg/apache/commons/codec/language/ColognePhonetic$CologneOutputBuffer;, */
	 /* Lorg/apache/commons/codec/language/ColognePhonetic$CologneBuffer; */
	 /* } */
} // .end annotation
/* # static fields */
private static final AEIJOUY;
private static final AHKLOQRUX;
private static final AHOUKQX;
private static final CKQ;
private static final GKQ;
private static final C PREPROCESS_MAP;
private static final SCZ;
private static final SZ;
private static final TDX;
private static final WFPV;
/* # direct methods */
static org.apache.commons.codec.language.ColognePhonetic ( ) {
	 /* .locals 5 */
	 /* .prologue */
	 int v2 = 7; // const/4 v2, 0x7
	 int v1 = 4; // const/4 v1, 0x4
	 int v4 = 3; // const/4 v4, 0x3
	 int v3 = 2; // const/4 v3, 0x2
	 /* .line 183 */
	 /* new-array v0, v2, [C */
	 /* fill-array-data v0, :array_0 */
	 /* .line 184 */
	 /* new-array v0, v4, [C */
	 /* fill-array-data v0, :array_1 */
	 /* .line 185 */
	 /* new-array v0, v1, [C */
	 /* fill-array-data v0, :array_2 */
	 /* .line 186 */
	 /* new-array v0, v4, [C */
	 /* fill-array-data v0, :array_3 */
	 /* .line 187 */
	 /* new-array v0, v4, [C */
	 /* fill-array-data v0, :array_4 */
	 /* .line 188 */
	 /* const/16 v0, 0x9 */
	 /* new-array v0, v0, [C */
	 /* fill-array-data v0, :array_5 */
	 /* .line 189 */
	 /* new-array v0, v3, [C */
	 /* fill-array-data v0, :array_6 */
	 /* .line 190 */
	 /* new-array v0, v2, [C */
	 /* fill-array-data v0, :array_7 */
	 /* .line 191 */
	 /* new-array v0, v4, [C */
	 /* fill-array-data v0, :array_8 */
	 /* .line 287 */
	 /* new-array v0, v1, [[C */
	 int v1 = 0; // const/4 v1, 0x0
	 /* new-array v2, v3, [C */
	 /* fill-array-data v2, :array_9 */
	 /* aput-object v2, v0, v1 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* new-array v2, v3, [C */
	 /* fill-array-data v2, :array_a */
	 /* aput-object v2, v0, v1 */
	 /* new-array v1, v3, [C */
	 /* fill-array-data v1, :array_b */
	 /* aput-object v1, v0, v3 */
	 /* new-array v1, v3, [C */
	 /* fill-array-data v1, :array_c */
	 /* aput-object v1, v0, v4 */
	 return;
	 /* .line 183 */
	 /* :array_0 */
	 /* .array-data 2 */
	 /* 0x41s */
	 /* 0x45s */
	 /* 0x49s */
	 /* 0x4as */
	 /* 0x4fs */
	 /* 0x55s */
	 /* 0x59s */
} // .end array-data
/* .line 184 */
/* nop */
/* :array_1 */
/* .array-data 2 */
/* 0x53s */
/* 0x43s */
/* 0x5as */
} // .end array-data
/* .line 185 */
/* nop */
/* :array_2 */
/* .array-data 2 */
/* 0x57s */
/* 0x46s */
/* 0x50s */
/* 0x56s */
} // .end array-data
/* .line 186 */
/* :array_3 */
/* .array-data 2 */
/* 0x47s */
/* 0x4bs */
/* 0x51s */
} // .end array-data
/* .line 187 */
/* nop */
/* :array_4 */
/* .array-data 2 */
/* 0x43s */
/* 0x4bs */
/* 0x51s */
} // .end array-data
/* .line 188 */
/* nop */
/* :array_5 */
/* .array-data 2 */
/* 0x41s */
/* 0x48s */
/* 0x4bs */
/* 0x4cs */
/* 0x4fs */
/* 0x51s */
/* 0x52s */
/* 0x55s */
/* 0x58s */
} // .end array-data
/* .line 189 */
/* nop */
/* :array_6 */
/* .array-data 2 */
/* 0x53s */
/* 0x5as */
} // .end array-data
/* .line 190 */
/* :array_7 */
/* .array-data 2 */
/* 0x41s */
/* 0x48s */
/* 0x4fs */
/* 0x55s */
/* 0x4bs */
/* 0x51s */
/* 0x58s */
} // .end array-data
/* .line 191 */
/* nop */
/* :array_8 */
/* .array-data 2 */
/* 0x54s */
/* 0x44s */
/* 0x58s */
} // .end array-data
/* .line 287 */
/* nop */
/* :array_9 */
/* .array-data 2 */
/* 0xc4s */
/* 0x41s */
} // .end array-data
/* :array_a */
/* .array-data 2 */
/* 0xdcs */
/* 0x55s */
} // .end array-data
/* :array_b */
/* .array-data 2 */
/* 0xd6s */
/* 0x4fs */
} // .end array-data
/* :array_c */
/* .array-data 2 */
/* 0xdfs */
/* 0x53s */
} // .end array-data
} // .end method
public org.apache.commons.codec.language.ColognePhonetic ( ) {
/* .locals 0 */
/* .prologue */
/* .line 180 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 245 */
return;
} // .end method
private static Boolean arrayContains ( Object[] p0, Object p1 ) {
/* .locals 5 */
/* .param p0, "arr" # [C */
/* .param p1, "key" # C */
/* .prologue */
/* .line 298 */
/* move-object v0, p0 */
/* .local v0, "arr$":[C */
/* array-length v3, v0 */
/* .local v3, "len$":I */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i$":I */
} // :goto_0
/* if-ge v2, v3, :cond_1 */
/* aget-char v1, v0, v2 */
/* .line 299 */
/* .local v1, "element":C */
/* if-ne v1, p1, :cond_0 */
/* .line 300 */
int v4 = 1; // const/4 v4, 0x1
/* .line 303 */
} // .end local v1 # "element":C
} // :goto_1
/* .line 298 */
/* .restart local v1 # "element":C */
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
/* .line 303 */
} // .end local v1 # "element":C
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
} // .end method
private java.lang.String preprocess ( java.lang.String p0 ) {
/* .locals 8 */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
/* .line 427 */
v6 = java.util.Locale.GERMAN;
(( java.lang.String ) p1 ).toUpperCase ( v6 ); // invoke-virtual {p1, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;
/* .line 429 */
(( java.lang.String ) p1 ).toCharArray ( ); // invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C
/* .line 431 */
/* .local v1, "chrs":[C */
int v4 = 0; // const/4 v4, 0x0
/* .local v4, "index":I */
} // :goto_0
/* array-length v6, v1 */
/* if-ge v4, v6, :cond_2 */
/* .line 432 */
/* aget-char v6, v1, v4 */
/* const/16 v7, 0x5a */
/* if-le v6, v7, :cond_0 */
/* .line 433 */
v0 = org.apache.commons.codec.language.ColognePhonetic.PREPROCESS_MAP;
/* .local v0, "arr$":[[C */
/* array-length v5, v0 */
/* .local v5, "len$":I */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i$":I */
} // :goto_1
/* if-ge v3, v5, :cond_0 */
/* aget-object v2, v0, v3 */
/* .line 434 */
/* .local v2, "element":[C */
/* aget-char v6, v1, v4 */
int v7 = 0; // const/4 v7, 0x0
/* aget-char v7, v2, v7 */
/* if-ne v6, v7, :cond_1 */
/* .line 435 */
int v6 = 1; // const/4 v6, 0x1
/* aget-char v6, v2, v6 */
/* aput-char v6, v1, v4 */
/* .line 431 */
} // .end local v0 # "arr$":[[C
} // .end local v2 # "element":[C
} // .end local v3 # "i$":I
} // .end local v5 # "len$":I
} // :cond_0
/* add-int/lit8 v4, v4, 0x1 */
/* .line 433 */
/* .restart local v0 # "arr$":[[C */
/* .restart local v2 # "element":[C */
/* .restart local v3 # "i$":I */
/* .restart local v5 # "len$":I */
} // :cond_1
/* add-int/lit8 v3, v3, 0x1 */
/* .line 441 */
} // .end local v0 # "arr$":[[C
} // .end local v2 # "element":[C
} // .end local v3 # "i$":I
} // .end local v5 # "len$":I
} // :cond_2
/* new-instance v6, Ljava/lang/String; */
/* invoke-direct {v6, v1}, Ljava/lang/String;-><init>([C)V */
} // .end method
/* # virtual methods */
public java.lang.String colognePhonetic ( java.lang.String p0 ) {
/* .locals 14 */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
/* const/16 v13, 0x5a */
/* const/16 v12, 0x53 */
/* const/16 v11, 0x48 */
/* const/16 v10, 0x30 */
/* const/16 v9, 0x2f */
/* .line 318 */
/* if-nez p1, :cond_0 */
/* .line 319 */
int v8 = 0; // const/4 v8, 0x0
/* .line 399 */
} // :goto_0
/* .line 322 */
} // :cond_0
/* invoke-direct {p0, p1}, Lorg/apache/commons/codec/language/ColognePhonetic;->preprocess(Ljava/lang/String;)Ljava/lang/String; */
/* .line 324 */
/* new-instance v6, Lorg/apache/commons/codec/language/ColognePhonetic$CologneOutputBuffer; */
v8 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* mul-int/lit8 v8, v8, 0x2 */
/* invoke-direct {v6, p0, v8}, Lorg/apache/commons/codec/language/ColognePhonetic$CologneOutputBuffer;-><init>(Lorg/apache/commons/codec/language/ColognePhonetic;I)V */
/* .line 325 */
/* .local v6, "output":Lorg/apache/commons/codec/language/ColognePhonetic$CologneOutputBuffer; */
/* new-instance v2, Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer; */
(( java.lang.String ) p1 ).toCharArray ( ); // invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C
/* invoke-direct {v2, p0, v8}, Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer;-><init>(Lorg/apache/commons/codec/language/ColognePhonetic;[C)V */
/* .line 329 */
/* .local v2, "input":Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer; */
/* const/16 v3, 0x2d */
/* .line 330 */
/* .local v3, "lastChar":C */
/* const/16 v4, 0x2f */
/* .line 334 */
/* .local v4, "lastCode":C */
v7 = (( org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer ) v2 ).length ( ); // invoke-virtual {v2}, Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer;->length()I
/* .line 336 */
/* .local v7, "rightLength":I */
} // :cond_1
} // :goto_1
/* if-lez v7, :cond_1c */
/* .line 337 */
v0 = (( org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer ) v2 ).removeNext ( ); // invoke-virtual {v2}, Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer;->removeNext()C
/* .line 339 */
/* .local v0, "chr":C */
v7 = (( org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer ) v2 ).length ( ); // invoke-virtual {v2}, Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer;->length()I
/* if-lez v7, :cond_5 */
/* .line 340 */
v5 = (( org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer ) v2 ).getNextChar ( ); // invoke-virtual {v2}, Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer;->getNextChar()C
/* .line 345 */
/* .local v5, "nextChar":C */
} // :goto_2
v8 = org.apache.commons.codec.language.ColognePhonetic.AEIJOUY;
v8 = org.apache.commons.codec.language.ColognePhonetic .arrayContains ( v8,v0 );
if ( v8 != null) { // if-eqz v8, :cond_6
/* .line 346 */
/* const/16 v1, 0x30 */
/* .line 392 */
/* .local v1, "code":C */
} // :goto_3
/* const/16 v8, 0x2d */
/* if-eq v1, v8, :cond_4 */
/* if-eq v4, v1, :cond_2 */
/* if-ne v1, v10, :cond_3 */
/* if-eq v4, v9, :cond_3 */
} // :cond_2
/* if-lt v1, v10, :cond_3 */
/* const/16 v8, 0x38 */
/* if-le v1, v8, :cond_4 */
/* .line 393 */
} // :cond_3
(( org.apache.commons.codec.language.ColognePhonetic$CologneOutputBuffer ) v6 ).addRight ( v1 ); // invoke-virtual {v6, v1}, Lorg/apache/commons/codec/language/ColognePhonetic$CologneOutputBuffer;->addRight(C)V
/* .line 396 */
} // :cond_4
/* move v3, v0 */
/* .line 397 */
/* move v4, v1 */
/* .line 342 */
} // .end local v1 # "code":C
} // .end local v5 # "nextChar":C
} // :cond_5
/* const/16 v5, 0x2d */
/* .restart local v5 # "nextChar":C */
/* .line 347 */
} // :cond_6
/* if-eq v0, v11, :cond_7 */
/* const/16 v8, 0x41 */
/* if-lt v0, v8, :cond_7 */
/* if-le v0, v13, :cond_8 */
/* .line 348 */
} // :cond_7
/* if-eq v4, v9, :cond_1 */
/* .line 351 */
/* const/16 v1, 0x2d */
/* .restart local v1 # "code":C */
/* .line 352 */
} // .end local v1 # "code":C
} // :cond_8
/* const/16 v8, 0x42 */
/* if-eq v0, v8, :cond_9 */
/* const/16 v8, 0x50 */
/* if-ne v0, v8, :cond_a */
/* if-eq v5, v11, :cond_a */
/* .line 353 */
} // :cond_9
/* const/16 v1, 0x31 */
/* .restart local v1 # "code":C */
/* .line 354 */
} // .end local v1 # "code":C
} // :cond_a
/* const/16 v8, 0x44 */
/* if-eq v0, v8, :cond_b */
/* const/16 v8, 0x54 */
/* if-ne v0, v8, :cond_c */
} // :cond_b
v8 = org.apache.commons.codec.language.ColognePhonetic.SCZ;
v8 = org.apache.commons.codec.language.ColognePhonetic .arrayContains ( v8,v5 );
/* if-nez v8, :cond_c */
/* .line 355 */
/* const/16 v1, 0x32 */
/* .restart local v1 # "code":C */
/* .line 356 */
} // .end local v1 # "code":C
} // :cond_c
v8 = org.apache.commons.codec.language.ColognePhonetic.WFPV;
v8 = org.apache.commons.codec.language.ColognePhonetic .arrayContains ( v8,v0 );
if ( v8 != null) { // if-eqz v8, :cond_d
/* .line 357 */
/* const/16 v1, 0x33 */
/* .restart local v1 # "code":C */
/* .line 358 */
} // .end local v1 # "code":C
} // :cond_d
v8 = org.apache.commons.codec.language.ColognePhonetic.GKQ;
v8 = org.apache.commons.codec.language.ColognePhonetic .arrayContains ( v8,v0 );
if ( v8 != null) { // if-eqz v8, :cond_e
/* .line 359 */
/* const/16 v1, 0x34 */
/* .restart local v1 # "code":C */
/* .line 360 */
} // .end local v1 # "code":C
} // :cond_e
/* const/16 v8, 0x58 */
/* if-ne v0, v8, :cond_f */
v8 = org.apache.commons.codec.language.ColognePhonetic.CKQ;
v8 = org.apache.commons.codec.language.ColognePhonetic .arrayContains ( v8,v3 );
/* if-nez v8, :cond_f */
/* .line 361 */
/* const/16 v1, 0x34 */
/* .line 362 */
/* .restart local v1 # "code":C */
(( org.apache.commons.codec.language.ColognePhonetic$CologneInputBuffer ) v2 ).addLeft ( v12 ); // invoke-virtual {v2, v12}, Lorg/apache/commons/codec/language/ColognePhonetic$CologneInputBuffer;->addLeft(C)V
/* .line 363 */
/* add-int/lit8 v7, v7, 0x1 */
/* .line 364 */
} // .end local v1 # "code":C
} // :cond_f
/* if-eq v0, v12, :cond_10 */
/* if-ne v0, v13, :cond_11 */
/* .line 365 */
} // :cond_10
/* const/16 v1, 0x38 */
/* .restart local v1 # "code":C */
/* .line 366 */
} // .end local v1 # "code":C
} // :cond_11
/* const/16 v8, 0x43 */
/* if-ne v0, v8, :cond_16 */
/* .line 367 */
/* if-ne v4, v9, :cond_13 */
/* .line 368 */
v8 = org.apache.commons.codec.language.ColognePhonetic.AHKLOQRUX;
v8 = org.apache.commons.codec.language.ColognePhonetic .arrayContains ( v8,v5 );
if ( v8 != null) { // if-eqz v8, :cond_12
/* .line 369 */
/* const/16 v1, 0x34 */
/* .restart local v1 # "code":C */
/* goto/16 :goto_3 */
/* .line 371 */
} // .end local v1 # "code":C
} // :cond_12
/* const/16 v1, 0x38 */
/* .restart local v1 # "code":C */
/* goto/16 :goto_3 */
/* .line 374 */
} // .end local v1 # "code":C
} // :cond_13
v8 = org.apache.commons.codec.language.ColognePhonetic.SZ;
v8 = org.apache.commons.codec.language.ColognePhonetic .arrayContains ( v8,v3 );
/* if-nez v8, :cond_14 */
v8 = org.apache.commons.codec.language.ColognePhonetic.AHOUKQX;
v8 = org.apache.commons.codec.language.ColognePhonetic .arrayContains ( v8,v5 );
/* if-nez v8, :cond_15 */
/* .line 375 */
} // :cond_14
/* const/16 v1, 0x38 */
/* .restart local v1 # "code":C */
/* goto/16 :goto_3 */
/* .line 377 */
} // .end local v1 # "code":C
} // :cond_15
/* const/16 v1, 0x34 */
/* .restart local v1 # "code":C */
/* goto/16 :goto_3 */
/* .line 380 */
} // .end local v1 # "code":C
} // :cond_16
v8 = org.apache.commons.codec.language.ColognePhonetic.TDX;
v8 = org.apache.commons.codec.language.ColognePhonetic .arrayContains ( v8,v0 );
if ( v8 != null) { // if-eqz v8, :cond_17
/* .line 381 */
/* const/16 v1, 0x38 */
/* .restart local v1 # "code":C */
/* goto/16 :goto_3 */
/* .line 382 */
} // .end local v1 # "code":C
} // :cond_17
/* const/16 v8, 0x52 */
/* if-ne v0, v8, :cond_18 */
/* .line 383 */
/* const/16 v1, 0x37 */
/* .restart local v1 # "code":C */
/* goto/16 :goto_3 */
/* .line 384 */
} // .end local v1 # "code":C
} // :cond_18
/* const/16 v8, 0x4c */
/* if-ne v0, v8, :cond_19 */
/* .line 385 */
/* const/16 v1, 0x35 */
/* .restart local v1 # "code":C */
/* goto/16 :goto_3 */
/* .line 386 */
} // .end local v1 # "code":C
} // :cond_19
/* const/16 v8, 0x4d */
/* if-eq v0, v8, :cond_1a */
/* const/16 v8, 0x4e */
/* if-ne v0, v8, :cond_1b */
/* .line 387 */
} // :cond_1a
/* const/16 v1, 0x36 */
/* .restart local v1 # "code":C */
/* goto/16 :goto_3 */
/* .line 389 */
} // .end local v1 # "code":C
} // :cond_1b
/* move v1, v0 */
/* .restart local v1 # "code":C */
/* goto/16 :goto_3 */
/* .line 399 */
} // .end local v0 # "chr":C
} // .end local v1 # "code":C
} // .end local v5 # "nextChar":C
} // :cond_1c
(( org.apache.commons.codec.language.ColognePhonetic$CologneOutputBuffer ) v6 ).toString ( ); // invoke-virtual {v6}, Lorg/apache/commons/codec/language/ColognePhonetic$CologneOutputBuffer;->toString()Ljava/lang/String;
/* goto/16 :goto_0 */
} // .end method
public java.lang.Object encode ( java.lang.Object p0 ) {
/* .locals 3 */
/* .param p1, "object" # Ljava/lang/Object; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/commons/codec/EncoderException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 404 */
/* instance-of v0, p1, Ljava/lang/String; */
/* if-nez v0, :cond_0 */
/* .line 405 */
/* new-instance v0, Lorg/apache/commons/codec/EncoderException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "This method\'s parameter was expected to be of the type "; // const-string v2, "This method\'s parameter was expected to be of the type "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const-class v2, Ljava/lang/String; */
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ".But actually it was of the type "; // const-string v2, ".But actually it was of the type "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "."; // const-string v2, "."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 411 */
} // :cond_0
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "object":Ljava/lang/Object;
(( org.apache.commons.codec.language.ColognePhonetic ) p0 ).encode ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/ColognePhonetic;->encode(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public java.lang.String encode ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
/* .line 416 */
(( org.apache.commons.codec.language.ColognePhonetic ) p0 ).colognePhonetic ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/ColognePhonetic;->colognePhonetic(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public Boolean isEncodeEqual ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "text1" # Ljava/lang/String; */
/* .param p2, "text2" # Ljava/lang/String; */
/* .prologue */
/* .line 420 */
(( org.apache.commons.codec.language.ColognePhonetic ) p0 ).colognePhonetic ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/ColognePhonetic;->colognePhonetic(Ljava/lang/String;)Ljava/lang/String;
(( org.apache.commons.codec.language.ColognePhonetic ) p0 ).colognePhonetic ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/commons/codec/language/ColognePhonetic;->colognePhonetic(Ljava/lang/String;)Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
