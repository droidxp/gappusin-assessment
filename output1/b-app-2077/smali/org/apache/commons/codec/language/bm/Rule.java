public class org.apache.commons.codec.language.bm.Rule {
	 /* .source "Rule.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/commons/codec/language/bm/Rule$RPattern;, */
	 /* Lorg/apache/commons/codec/language/bm/Rule$PhonemeList;, */
	 /* Lorg/apache/commons/codec/language/bm/Rule$PhonemeExpr;, */
	 /* Lorg/apache/commons/codec/language/bm/Rule$Phoneme; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String ALL;
public static final org.apache.commons.codec.language.bm.Rule$RPattern ALL_STRINGS_RMATCHER;
private static final java.lang.String DOUBLE_QUOTE;
private static final java.lang.String HASH_INCLUDE;
private static final java.util.Map RULES;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Lorg/apache/commons/codec/language/bm/NameType;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Lorg/apache/commons/codec/language/bm/RuleType;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/util/List", */
/* "<", */
/* "Lorg/apache/commons/codec/language/bm/Rule;", */
/* ">;>;>;>;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
private final org.apache.commons.codec.language.bm.Rule$RPattern lContext;
private final java.lang.String pattern;
private final org.apache.commons.codec.language.bm.Rule$PhonemeExpr phoneme;
private final org.apache.commons.codec.language.bm.Rule$RPattern rContext;
/* # direct methods */
static org.apache.commons.codec.language.bm.Rule ( ) {
/* .locals 18 */
/* .prologue */
/* .line 159 */
/* new-instance v15, Lorg/apache/commons/codec/language/bm/Rule$1; */
/* invoke-direct {v15}, Lorg/apache/commons/codec/language/bm/Rule$1;-><init>()V */
/* .line 172 */
/* new-instance v15, Ljava/util/EnumMap; */
/* const-class v16, Lorg/apache/commons/codec/language/bm/NameType; */
/* invoke-direct/range {v15 ..v16}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V */
/* .line 176 */
org.apache.commons.codec.language.bm.NameType .values ( );
/* .local v1, "arr$":[Lorg/apache/commons/codec/language/bm/NameType; */
/* array-length v8, v1 */
/* .local v8, "len$":I */
int v4 = 0; // const/4 v4, 0x0
/* .local v4, "i$":I */
/* move v6, v4 */
} // .end local v1 # "arr$":[Lorg/apache/commons/codec/language/bm/NameType;
} // .end local v4 # "i$":I
} // .end local v8 # "len$":I
/* .local v6, "i$":I */
} // :goto_0
/* if-ge v6, v8, :cond_3 */
/* aget-object v14, v1, v6 */
/* .line 177 */
/* .local v14, "s":Lorg/apache/commons/codec/language/bm/NameType; */
/* new-instance v13, Ljava/util/EnumMap; */
/* const-class v15, Lorg/apache/commons/codec/language/bm/RuleType; */
/* invoke-direct {v13, v15}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V */
/* .line 180 */
/* .local v13, "rts":Ljava/util/Map;, "Ljava/util/Map<Lorg/apache/commons/codec/language/bm/RuleType;Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lorg/apache/commons/codec/language/bm/Rule;>;>;>;" */
org.apache.commons.codec.language.bm.RuleType .values ( );
/* .local v2, "arr$":[Lorg/apache/commons/codec/language/bm/RuleType; */
/* array-length v9, v2 */
/* .local v9, "len$":I */
int v4 = 0; // const/4 v4, 0x0
} // .end local v6 # "i$":I
/* .restart local v4 # "i$":I */
/* move v5, v4 */
} // .end local v4 # "i$":I
/* .local v5, "i$":I */
} // :goto_1
/* if-ge v5, v9, :cond_2 */
/* aget-object v12, v2, v5 */
/* .line 181 */
/* .local v12, "rt":Lorg/apache/commons/codec/language/bm/RuleType; */
/* new-instance v11, Ljava/util/HashMap; */
/* invoke-direct {v11}, Ljava/util/HashMap;-><init>()V */
/* .line 183 */
/* .local v11, "rs":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lorg/apache/commons/codec/language/bm/Rule;>;>;" */
org.apache.commons.codec.language.bm.Languages .getInstance ( v14 );
/* .line 184 */
/* .local v10, "ls":Lorg/apache/commons/codec/language/bm/Languages; */
(( org.apache.commons.codec.language.bm.Languages ) v10 ).getLanguages ( ); // invoke-virtual {v10}, Lorg/apache/commons/codec/language/bm/Languages;->getLanguages()Ljava/util/Set;
} // .end local v5 # "i$":I
/* .local v4, "i$":Ljava/util/Iterator; */
v15 = } // :goto_2
if ( v15 != null) { // if-eqz v15, :cond_0
/* check-cast v7, Ljava/lang/String; */
/* .line 186 */
/* .local v7, "l":Ljava/lang/String; */
try { // :try_start_0
org.apache.commons.codec.language.bm.Rule .createScanner ( v14,v12,v7 );
org.apache.commons.codec.language.bm.Rule .createResourceName ( v14,v12,v7 );
/* invoke-static/range {v15 ..v16}, Lorg/apache/commons/codec/language/bm/Rule;->parseRules(Ljava/util/Scanner;Ljava/lang/String;)Ljava/util/List; */
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 187 */
/* :catch_0 */
/* move-exception v3 */
/* .line 188 */
/* .local v3, "e":Ljava/lang/IllegalStateException; */
/* new-instance v15, Ljava/lang/IllegalStateException; */
/* new-instance v16, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v16 ..v16}, Ljava/lang/StringBuilder;-><init>()V */
final String v17 = "Problem processing "; // const-string v17, "Problem processing "
/* invoke-virtual/range {v16 ..v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
org.apache.commons.codec.language.bm.Rule .createResourceName ( v14,v12,v7 );
/* invoke-virtual/range {v16 ..v17}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v16 ..v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* move-object/from16 v0, v16 */
/* invoke-direct {v15, v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v15 */
/* .line 191 */
} // .end local v3 # "e":Ljava/lang/IllegalStateException;
} // .end local v7 # "l":Ljava/lang/String;
} // :cond_0
v15 = org.apache.commons.codec.language.bm.RuleType.RULES;
v15 = (( org.apache.commons.codec.language.bm.RuleType ) v12 ).equals ( v15 ); // invoke-virtual {v12, v15}, Lorg/apache/commons/codec/language/bm/RuleType;->equals(Ljava/lang/Object;)Z
/* if-nez v15, :cond_1 */
/* .line 192 */
final String v15 = "common"; // const-string v15, "common"
final String v16 = "common"; // const-string v16, "common"
/* move-object/from16 v0, v16 */
org.apache.commons.codec.language.bm.Rule .createScanner ( v14,v12,v0 );
final String v17 = "common"; // const-string v17, "common"
/* move-object/from16 v0, v17 */
org.apache.commons.codec.language.bm.Rule .createResourceName ( v14,v12,v0 );
/* invoke-static/range {v16 ..v17}, Lorg/apache/commons/codec/language/bm/Rule;->parseRules(Ljava/util/Scanner;Ljava/lang/String;)Ljava/util/List; */
/* move-object/from16 v0, v16 */
/* .line 195 */
} // :cond_1
java.util.Collections .unmodifiableMap ( v11 );
/* .line 180 */
/* add-int/lit8 v4, v5, 0x1 */
/* .local v4, "i$":I */
/* move v5, v4 */
} // .end local v4 # "i$":I
/* .restart local v5 # "i$":I */
/* .line 198 */
} // .end local v10 # "ls":Lorg/apache/commons/codec/language/bm/Languages;
} // .end local v11 # "rs":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lorg/apache/commons/codec/language/bm/Rule;>;>;"
} // .end local v12 # "rt":Lorg/apache/commons/codec/language/bm/RuleType;
} // :cond_2
v15 = org.apache.commons.codec.language.bm.Rule.RULES;
java.util.Collections .unmodifiableMap ( v13 );
/* move-object/from16 v0, v16 */
/* .line 176 */
/* add-int/lit8 v4, v6, 0x1 */
} // .end local v5 # "i$":I
/* .restart local v4 # "i$":I */
/* move v6, v4 */
} // .end local v4 # "i$":I
/* .restart local v6 # "i$":I */
/* goto/16 :goto_0 */
/* .line 200 */
} // .end local v2 # "arr$":[Lorg/apache/commons/codec/language/bm/RuleType;
} // .end local v9 # "len$":I
} // .end local v13 # "rts":Ljava/util/Map;, "Ljava/util/Map<Lorg/apache/commons/codec/language/bm/RuleType;Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lorg/apache/commons/codec/language/bm/Rule;>;>;>;"
} // .end local v14 # "s":Lorg/apache/commons/codec/language/bm/NameType;
} // :cond_3
return;
} // .end method
public org.apache.commons.codec.language.bm.Rule ( ) {
/* .locals 2 */
/* .param p1, "pattern" # Ljava/lang/String; */
/* .param p2, "lContext" # Ljava/lang/String; */
/* .param p3, "rContext" # Ljava/lang/String; */
/* .param p4, "phoneme" # Lorg/apache/commons/codec/language/bm/Rule$PhonemeExpr; */
/* .prologue */
/* .line 559 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 560 */
this.pattern = p1;
/* .line 561 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "$"; // const-string v1, "$"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
org.apache.commons.codec.language.bm.Rule .pattern ( v0 );
this.lContext = v0;
/* .line 562 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "^"; // const-string v1, "^"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
org.apache.commons.codec.language.bm.Rule .pattern ( v0 );
this.rContext = v0;
/* .line 563 */
this.phoneme = p4;
/* .line 564 */
return;
} // .end method
static Boolean access$100 ( java.lang.CharSequence p0, java.lang.CharSequence p1 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Ljava/lang/CharSequence; */
/* .param p1, "x1" # Ljava/lang/CharSequence; */
/* .prologue */
/* .line 80 */
v0 = org.apache.commons.codec.language.bm.Rule .startsWith ( p0,p1 );
} // .end method
static Boolean access$200 ( java.lang.CharSequence p0, java.lang.CharSequence p1 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Ljava/lang/CharSequence; */
/* .param p1, "x1" # Ljava/lang/CharSequence; */
/* .prologue */
/* .line 80 */
v0 = org.apache.commons.codec.language.bm.Rule .endsWith ( p0,p1 );
} // .end method
static Boolean access$300 ( java.lang.CharSequence p0, Object p1 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Ljava/lang/CharSequence; */
/* .param p1, "x1" # C */
/* .prologue */
/* .line 80 */
v0 = org.apache.commons.codec.language.bm.Rule .contains ( p0,p1 );
} // .end method
private static Boolean contains ( java.lang.CharSequence p0, Object p1 ) {
/* .locals 2 */
/* .param p0, "chars" # Ljava/lang/CharSequence; */
/* .param p1, "input" # C */
/* .prologue */
/* .line 203 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
v1 = } // :goto_0
/* if-ge v0, v1, :cond_1 */
v1 = /* .line 204 */
/* if-ne v1, p1, :cond_0 */
/* .line 205 */
int v1 = 1; // const/4 v1, 0x1
/* .line 208 */
} // :goto_1
/* .line 203 */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
/* .line 208 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // .end method
private static java.lang.String createResourceName ( org.apache.commons.codec.language.bm.NameType p0, org.apache.commons.codec.language.bm.RuleType p1, java.lang.String p2 ) {
/* .locals 4 */
/* .param p0, "nameType" # Lorg/apache/commons/codec/language/bm/NameType; */
/* .param p1, "rt" # Lorg/apache/commons/codec/language/bm/RuleType; */
/* .param p2, "lang" # Ljava/lang/String; */
/* .prologue */
/* .line 212 */
final String v0 = "org/apache/commons/codec/language/bm/%s_%s_%s.txt"; // const-string v0, "org/apache/commons/codec/language/bm/%s_%s_%s.txt"
int v1 = 3; // const/4 v1, 0x3
/* new-array v1, v1, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
(( org.apache.commons.codec.language.bm.NameType ) p0 ).getName ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/language/bm/NameType;->getName()Ljava/lang/String;
/* aput-object v3, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
(( org.apache.commons.codec.language.bm.RuleType ) p1 ).getName ( ); // invoke-virtual {p1}, Lorg/apache/commons/codec/language/bm/RuleType;->getName()Ljava/lang/String;
/* aput-object v3, v1, v2 */
int v2 = 2; // const/4 v2, 0x2
/* aput-object p2, v1, v2 */
java.lang.String .format ( v0,v1 );
} // .end method
private static java.util.Scanner createScanner ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p0, "lang" # Ljava/lang/String; */
/* .prologue */
/* .line 228 */
final String v2 = "org/apache/commons/codec/language/bm/%s.txt"; // const-string v2, "org/apache/commons/codec/language/bm/%s.txt"
int v3 = 1; // const/4 v3, 0x1
/* new-array v3, v3, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
/* aput-object p0, v3, v4 */
java.lang.String .format ( v2,v3 );
/* .line 229 */
/* .local v0, "resName":Ljava/lang/String; */
/* const-class v2, Lorg/apache/commons/codec/language/bm/Languages; */
(( java.lang.Class ) v2 ).getClassLoader ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
(( java.lang.ClassLoader ) v2 ).getResourceAsStream ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
/* .line 231 */
/* .local v1, "rulesIS":Ljava/io/InputStream; */
/* if-nez v1, :cond_0 */
/* .line 232 */
/* new-instance v2, Ljava/lang/IllegalArgumentException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Unable to load resource: "; // const-string v4, "Unable to load resource: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v2 */
/* .line 235 */
} // :cond_0
/* new-instance v2, Ljava/util/Scanner; */
final String v3 = "UTF-8"; // const-string v3, "UTF-8"
/* invoke-direct {v2, v1, v3}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V */
} // .end method
private static java.util.Scanner createScanner ( org.apache.commons.codec.language.bm.NameType p0, org.apache.commons.codec.language.bm.RuleType p1, java.lang.String p2 ) {
/* .locals 5 */
/* .param p0, "nameType" # Lorg/apache/commons/codec/language/bm/NameType; */
/* .param p1, "rt" # Lorg/apache/commons/codec/language/bm/RuleType; */
/* .param p2, "lang" # Ljava/lang/String; */
/* .prologue */
/* .line 217 */
org.apache.commons.codec.language.bm.Rule .createResourceName ( p0,p1,p2 );
/* .line 218 */
/* .local v0, "resName":Ljava/lang/String; */
/* const-class v2, Lorg/apache/commons/codec/language/bm/Languages; */
(( java.lang.Class ) v2 ).getClassLoader ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
(( java.lang.ClassLoader ) v2 ).getResourceAsStream ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
/* .line 220 */
/* .local v1, "rulesIS":Ljava/io/InputStream; */
/* if-nez v1, :cond_0 */
/* .line 221 */
/* new-instance v2, Ljava/lang/IllegalArgumentException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Unable to load resource: "; // const-string v4, "Unable to load resource: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v2 */
/* .line 224 */
} // :cond_0
/* new-instance v2, Ljava/util/Scanner; */
final String v3 = "UTF-8"; // const-string v3, "UTF-8"
/* invoke-direct {v2, v1, v3}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V */
} // .end method
private static Boolean endsWith ( java.lang.CharSequence p0, java.lang.CharSequence p1 ) {
/* .locals 5 */
/* .param p0, "input" # Ljava/lang/CharSequence; */
/* .param p1, "suffix" # Ljava/lang/CharSequence; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
v4 = v3 = /* .line 239 */
/* if-le v3, v4, :cond_1 */
/* .line 247 */
} // :cond_0
} // :goto_0
/* .line 242 */
v3 = } // :cond_1
/* add-int/lit8 v0, v3, -0x1 */
v3 = /* .local v0, "i":I */
/* add-int/lit8 v1, v3, -0x1 */
/* .local v1, "j":I */
} // :goto_1
/* if-ltz v1, :cond_2 */
v4 = v3 = /* .line 243 */
/* if-ne v3, v4, :cond_0 */
/* .line 242 */
/* add-int/lit8 v0, v0, -0x1 */
/* add-int/lit8 v1, v1, -0x1 */
/* .line 247 */
} // :cond_2
int v2 = 1; // const/4 v2, 0x1
} // .end method
public static java.util.List getInstance ( org.apache.commons.codec.language.bm.NameType p0, org.apache.commons.codec.language.bm.RuleType p1, java.lang.String p2 ) {
/* .locals 6 */
/* .param p0, "nameType" # Lorg/apache/commons/codec/language/bm/NameType; */
/* .param p1, "rt" # Lorg/apache/commons/codec/language/bm/RuleType; */
/* .param p2, "lang" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lorg/apache/commons/codec/language/bm/NameType;", */
/* "Lorg/apache/commons/codec/language/bm/RuleType;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/List", */
/* "<", */
/* "Lorg/apache/commons/codec/language/bm/Rule;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 279 */
v1 = org.apache.commons.codec.language.bm.Rule.RULES;
/* check-cast v1, Ljava/util/Map; */
/* check-cast v1, Ljava/util/Map; */
/* check-cast v0, Ljava/util/List; */
/* .line 281 */
/* .local v0, "rules":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/codec/language/bm/Rule;>;" */
/* if-nez v0, :cond_0 */
/* .line 282 */
/* new-instance v1, Ljava/lang/IllegalArgumentException; */
final String v2 = "No rules found for %s, %s, %s."; // const-string v2, "No rules found for %s, %s, %s."
int v3 = 3; // const/4 v3, 0x3
/* new-array v3, v3, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
(( org.apache.commons.codec.language.bm.NameType ) p0 ).getName ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/language/bm/NameType;->getName()Ljava/lang/String;
/* aput-object v5, v3, v4 */
int v4 = 1; // const/4 v4, 0x1
(( org.apache.commons.codec.language.bm.RuleType ) p1 ).getName ( ); // invoke-virtual {p1}, Lorg/apache/commons/codec/language/bm/RuleType;->getName()Ljava/lang/String;
/* aput-object v5, v3, v4 */
int v4 = 2; // const/4 v4, 0x2
/* aput-object p2, v3, v4 */
java.lang.String .format ( v2,v3 );
/* invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 286 */
} // :cond_0
} // .end method
public static java.util.List getInstance ( org.apache.commons.codec.language.bm.NameType p0, org.apache.commons.codec.language.bm.RuleType p1, org.apache.commons.codec.language.bm.Languages$LanguageSet p2 ) {
/* .locals 1 */
/* .param p0, "nameType" # Lorg/apache/commons/codec/language/bm/NameType; */
/* .param p1, "rt" # Lorg/apache/commons/codec/language/bm/RuleType; */
/* .param p2, "langs" # Lorg/apache/commons/codec/language/bm/Languages$LanguageSet; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lorg/apache/commons/codec/language/bm/NameType;", */
/* "Lorg/apache/commons/codec/language/bm/RuleType;", */
/* "Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;", */
/* ")", */
/* "Ljava/util/List", */
/* "<", */
/* "Lorg/apache/commons/codec/language/bm/Rule;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 263 */
v0 = (( org.apache.commons.codec.language.bm.Languages$LanguageSet ) p2 ).isSingleton ( ); // invoke-virtual {p2}, Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;->isSingleton()Z
if ( v0 != null) { // if-eqz v0, :cond_0
(( org.apache.commons.codec.language.bm.Languages$LanguageSet ) p2 ).getAny ( ); // invoke-virtual {p2}, Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;->getAny()Ljava/lang/String;
org.apache.commons.codec.language.bm.Rule .getInstance ( p0,p1,v0 );
} // :goto_0
} // :cond_0
final String v0 = "any"; // const-string v0, "any"
org.apache.commons.codec.language.bm.Rule .getInstance ( p0,p1,v0 );
} // .end method
private static org.apache.commons.codec.language.bm.Rule$Phoneme parsePhoneme ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p0, "ph" # Ljava/lang/String; */
/* .prologue */
/* .line 290 */
final String v4 = "["; // const-string v4, "["
v3 = (( java.lang.String ) p0 ).indexOf ( v4 ); // invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* .line 291 */
/* .local v3, "open":I */
/* if-ltz v3, :cond_1 */
/* .line 292 */
final String v4 = "]"; // const-string v4, "]"
v4 = (( java.lang.String ) p0 ).endsWith ( v4 ); // invoke-virtual {p0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* if-nez v4, :cond_0 */
/* .line 293 */
/* new-instance v4, Ljava/lang/IllegalArgumentException; */
final String v5 = "Phoneme expression contains a \'[\' but does not end in \']\'"; // const-string v5, "Phoneme expression contains a \'[\' but does not end in \']\'"
/* invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v4 */
/* .line 295 */
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
(( java.lang.String ) p0 ).substring ( v4, v3 ); // invoke-virtual {p0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 296 */
/* .local v0, "before":Ljava/lang/String; */
/* add-int/lit8 v4, v3, 0x1 */
v5 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* add-int/lit8 v5, v5, -0x1 */
(( java.lang.String ) p0 ).substring ( v4, v5 ); // invoke-virtual {p0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 297 */
/* .local v1, "in":Ljava/lang/String; */
/* new-instance v2, Ljava/util/HashSet; */
final String v4 = "[+]"; // const-string v4, "[+]"
(( java.lang.String ) v1 ).split ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
java.util.Arrays .asList ( v4 );
/* invoke-direct {v2, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V */
/* .line 299 */
/* .local v2, "langs":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
/* new-instance v4, Lorg/apache/commons/codec/language/bm/Rule$Phoneme; */
org.apache.commons.codec.language.bm.Languages$LanguageSet .from ( v2 );
/* invoke-direct {v4, v0, v5}, Lorg/apache/commons/codec/language/bm/Rule$Phoneme;-><init>(Ljava/lang/CharSequence;Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;)V */
/* .line 301 */
} // .end local v0 # "before":Ljava/lang/String;
} // .end local v1 # "in":Ljava/lang/String;
} // .end local v2 # "langs":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
} // :goto_0
} // :cond_1
/* new-instance v4, Lorg/apache/commons/codec/language/bm/Rule$Phoneme; */
v5 = org.apache.commons.codec.language.bm.Languages.ANY_LANGUAGE;
/* invoke-direct {v4, p0, v5}, Lorg/apache/commons/codec/language/bm/Rule$Phoneme;-><init>(Ljava/lang/CharSequence;Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;)V */
} // .end method
private static org.apache.commons.codec.language.bm.Rule$PhonemeExpr parsePhonemeExpr ( java.lang.String p0 ) {
/* .locals 9 */
/* .param p0, "ph" # Ljava/lang/String; */
/* .prologue */
/* .line 306 */
final String v6 = "("; // const-string v6, "("
v6 = (( java.lang.String ) p0 ).startsWith ( v6 ); // invoke-virtual {p0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_4
/* .line 307 */
final String v6 = ")"; // const-string v6, ")"
v6 = (( java.lang.String ) p0 ).endsWith ( v6 ); // invoke-virtual {p0, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* if-nez v6, :cond_0 */
/* .line 308 */
/* new-instance v6, Ljava/lang/IllegalArgumentException; */
final String v7 = "Phoneme starts with \'(\' so must end with \')\'"; // const-string v7, "Phoneme starts with \'(\' so must end with \')\'"
/* invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v6 */
/* .line 311 */
} // :cond_0
/* new-instance v5, Ljava/util/ArrayList; */
/* invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V */
/* .line 312 */
/* .local v5, "phs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/codec/language/bm/Rule$Phoneme;>;" */
int v6 = 1; // const/4 v6, 0x1
v7 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* add-int/lit8 v7, v7, -0x1 */
(( java.lang.String ) p0 ).substring ( v6, v7 ); // invoke-virtual {p0, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 313 */
/* .local v1, "body":Ljava/lang/String; */
final String v6 = "[|]"; // const-string v6, "[|]"
(( java.lang.String ) v1 ).split ( v6 ); // invoke-virtual {v1, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .local v0, "arr$":[Ljava/lang/String; */
/* array-length v3, v0 */
/* .local v3, "len$":I */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i$":I */
} // :goto_0
/* if-ge v2, v3, :cond_1 */
/* aget-object v4, v0, v2 */
/* .line 314 */
/* .local v4, "part":Ljava/lang/String; */
org.apache.commons.codec.language.bm.Rule .parsePhoneme ( v4 );
/* .line 313 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 316 */
} // .end local v4 # "part":Ljava/lang/String;
} // :cond_1
final String v6 = "|"; // const-string v6, "|"
v6 = (( java.lang.String ) v1 ).startsWith ( v6 ); // invoke-virtual {v1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v6, :cond_2 */
final String v6 = "|"; // const-string v6, "|"
v6 = (( java.lang.String ) v1 ).endsWith ( v6 ); // invoke-virtual {v1, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 317 */
} // :cond_2
/* new-instance v6, Lorg/apache/commons/codec/language/bm/Rule$Phoneme; */
final String v7 = ""; // const-string v7, ""
v8 = org.apache.commons.codec.language.bm.Languages.ANY_LANGUAGE;
/* invoke-direct {v6, v7, v8}, Lorg/apache/commons/codec/language/bm/Rule$Phoneme;-><init>(Ljava/lang/CharSequence;Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;)V */
/* .line 320 */
} // :cond_3
/* new-instance v6, Lorg/apache/commons/codec/language/bm/Rule$PhonemeList; */
/* invoke-direct {v6, v5}, Lorg/apache/commons/codec/language/bm/Rule$PhonemeList;-><init>(Ljava/util/List;)V */
/* .line 322 */
} // .end local v0 # "arr$":[Ljava/lang/String;
} // .end local v1 # "body":Ljava/lang/String;
} // .end local v2 # "i$":I
} // .end local v3 # "len$":I
} // .end local v5 # "phs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/codec/language/bm/Rule$Phoneme;>;"
} // :goto_1
} // :cond_4
org.apache.commons.codec.language.bm.Rule .parsePhoneme ( p0 );
} // .end method
private static java.util.List parseRules ( java.util.Scanner p0, java.lang.String p1 ) {
/* .locals 20 */
/* .param p0, "scanner" # Ljava/util/Scanner; */
/* .param p1, "location" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Scanner;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/List", */
/* "<", */
/* "Lorg/apache/commons/codec/language/bm/Rule;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 327 */
/* new-instance v15, Ljava/util/ArrayList; */
/* invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V */
/* .line 328 */
/* .local v15, "lines":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/codec/language/bm/Rule;>;" */
int v10 = 0; // const/4 v10, 0x0
/* .line 330 */
/* .local v10, "currentLine":I */
int v12 = 0; // const/4 v12, 0x0
/* .line 331 */
/* .local v12, "inMultilineComment":Z */
} // :cond_0
} // :goto_0
v8 = /* invoke-virtual/range {p0 ..p0}, Ljava/util/Scanner;->hasNextLine()Z */
if ( v8 != null) { // if-eqz v8, :cond_7
/* .line 332 */
/* add-int/lit8 v10, v10, 0x1 */
/* .line 333 */
/* invoke-virtual/range {p0 ..p0}, Ljava/util/Scanner;->nextLine()Ljava/lang/String; */
/* .line 334 */
/* .local v17, "rawLine":Ljava/lang/String; */
/* move-object/from16 v14, v17 */
/* .line 336 */
/* .local v14, "line":Ljava/lang/String; */
if ( v12 != null) { // if-eqz v12, :cond_1
/* .line 337 */
final String v8 = "*/"; // const-string v8, "*/"
v8 = (( java.lang.String ) v14 ).endsWith ( v8 ); // invoke-virtual {v14, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v8 != null) { // if-eqz v8, :cond_0
/* .line 338 */
int v12 = 0; // const/4 v12, 0x0
/* .line 341 */
} // :cond_1
final String v8 = "/*"; // const-string v8, "/*"
v8 = (( java.lang.String ) v14 ).startsWith ( v8 ); // invoke-virtual {v14, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v8 != null) { // if-eqz v8, :cond_2
/* .line 342 */
int v12 = 1; // const/4 v12, 0x1
/* .line 345 */
} // :cond_2
final String v8 = "//"; // const-string v8, "//"
v9 = (( java.lang.String ) v14 ).indexOf ( v8 ); // invoke-virtual {v14, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* .line 346 */
/* .local v9, "cmtI":I */
/* if-ltz v9, :cond_3 */
/* .line 347 */
int v8 = 0; // const/4 v8, 0x0
(( java.lang.String ) v14 ).substring ( v8, v9 ); // invoke-virtual {v14, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 351 */
} // :cond_3
(( java.lang.String ) v14 ).trim ( ); // invoke-virtual {v14}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 353 */
v8 = (( java.lang.String ) v14 ).length ( ); // invoke-virtual {v14}, Ljava/lang/String;->length()I
if ( v8 != null) { // if-eqz v8, :cond_0
/* .line 357 */
final String v8 = "#include"; // const-string v8, "#include"
v8 = (( java.lang.String ) v14 ).startsWith ( v8 ); // invoke-virtual {v14, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v8 != null) { // if-eqz v8, :cond_5
/* .line 359 */
final String v8 = "#include"; // const-string v8, "#include"
v8 = (( java.lang.String ) v8 ).length ( ); // invoke-virtual {v8}, Ljava/lang/String;->length()I
(( java.lang.String ) v14 ).substring ( v8 ); // invoke-virtual {v14, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( java.lang.String ) v8 ).trim ( ); // invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 360 */
/* .local v13, "incl":Ljava/lang/String; */
final String v8 = " "; // const-string v8, " "
v8 = (( java.lang.String ) v13 ).contains ( v8 ); // invoke-virtual {v13, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v8 != null) { // if-eqz v8, :cond_4
/* .line 361 */
/* new-instance v8, Ljava/lang/IllegalArgumentException; */
/* new-instance v18, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v18 ..v18}, Ljava/lang/StringBuilder;-><init>()V */
final String v19 = "Malformed import statement \'"; // const-string v19, "Malformed import statement \'"
/* invoke-virtual/range {v18 ..v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v18 */
/* move-object/from16 v1, v17 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v19 = "\' in "; // const-string v19, "\' in "
/* invoke-virtual/range {v18 ..v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v18 */
/* move-object/from16 v1, p1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* invoke-virtual/range {v18 ..v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* move-object/from16 v0, v18 */
/* invoke-direct {v8, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v8 */
/* .line 364 */
} // :cond_4
org.apache.commons.codec.language.bm.Rule .createScanner ( v13 );
/* new-instance v18, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v18 ..v18}, Ljava/lang/StringBuilder;-><init>()V */
/* move-object/from16 v0, v18 */
/* move-object/from16 v1, p1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v19 = "->"; // const-string v19, "->"
/* invoke-virtual/range {v18 ..v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v18 */
(( java.lang.StringBuilder ) v0 ).append ( v13 ); // invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* invoke-virtual/range {v18 ..v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* move-object/from16 v0, v18 */
org.apache.commons.codec.language.bm.Rule .parseRules ( v8,v0 );
/* goto/16 :goto_0 */
/* .line 368 */
} // .end local v13 # "incl":Ljava/lang/String;
} // :cond_5
final String v8 = "\\s+"; // const-string v8, "\\s+"
(( java.lang.String ) v14 ).split ( v8 ); // invoke-virtual {v14, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 369 */
/* .local v16, "parts":[Ljava/lang/String; */
/* move-object/from16 v0, v16 */
/* array-length v8, v0 */
/* const/16 v18, 0x4 */
/* move/from16 v0, v18 */
/* if-eq v8, v0, :cond_6 */
/* .line 370 */
/* new-instance v8, Ljava/lang/IllegalArgumentException; */
/* new-instance v18, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v18 ..v18}, Ljava/lang/StringBuilder;-><init>()V */
final String v19 = "Malformed rule statement split into "; // const-string v19, "Malformed rule statement split into "
/* invoke-virtual/range {v18 ..v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v16 */
/* array-length v0, v0 */
/* move/from16 v19, v0 */
/* invoke-virtual/range {v18 ..v19}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder; */
final String v19 = " parts: "; // const-string v19, " parts: "
/* invoke-virtual/range {v18 ..v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v18 */
/* move-object/from16 v1, v17 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v19 = " in "; // const-string v19, " in "
/* invoke-virtual/range {v18 ..v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v18 */
/* move-object/from16 v1, p1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* invoke-virtual/range {v18 ..v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* move-object/from16 v0, v18 */
/* invoke-direct {v8, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v8 */
/* .line 374 */
} // :cond_6
int v8 = 0; // const/4 v8, 0x0
try { // :try_start_0
/* aget-object v8, v16, v8 */
org.apache.commons.codec.language.bm.Rule .stripQuotes ( v8 );
/* .line 375 */
/* .local v3, "pat":Ljava/lang/String; */
int v8 = 1; // const/4 v8, 0x1
/* aget-object v8, v16, v8 */
org.apache.commons.codec.language.bm.Rule .stripQuotes ( v8 );
/* .line 376 */
/* .local v4, "lCon":Ljava/lang/String; */
int v8 = 2; // const/4 v8, 0x2
/* aget-object v8, v16, v8 */
org.apache.commons.codec.language.bm.Rule .stripQuotes ( v8 );
/* .line 377 */
/* .local v5, "rCon":Ljava/lang/String; */
int v8 = 3; // const/4 v8, 0x3
/* aget-object v8, v16, v8 */
org.apache.commons.codec.language.bm.Rule .stripQuotes ( v8 );
org.apache.commons.codec.language.bm.Rule .parsePhonemeExpr ( v8 );
/* .line 378 */
/* .local v6, "ph":Lorg/apache/commons/codec/language/bm/Rule$PhonemeExpr; */
/* move v7, v10 */
/* .line 379 */
/* .local v7, "cLine":I */
/* new-instance v2, Lorg/apache/commons/codec/language/bm/Rule$2; */
/* move-object/from16 v8, p1 */
/* invoke-direct/range {v2 ..v8}, Lorg/apache/commons/codec/language/bm/Rule$2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/commons/codec/language/bm/Rule$PhonemeExpr;ILjava/lang/String;)V */
/* .line 393 */
/* .local v2, "r":Lorg/apache/commons/codec/language/bm/Rule; */
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* goto/16 :goto_0 */
/* .line 394 */
} // .end local v2 # "r":Lorg/apache/commons/codec/language/bm/Rule;
} // .end local v3 # "pat":Ljava/lang/String;
} // .end local v4 # "lCon":Ljava/lang/String;
} // .end local v5 # "rCon":Ljava/lang/String;
} // .end local v6 # "ph":Lorg/apache/commons/codec/language/bm/Rule$PhonemeExpr;
} // .end local v7 # "cLine":I
/* :catch_0 */
/* move-exception v11 */
/* .line 395 */
/* .local v11, "e":Ljava/lang/IllegalArgumentException; */
/* new-instance v8, Ljava/lang/IllegalStateException; */
/* new-instance v18, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v18 ..v18}, Ljava/lang/StringBuilder;-><init>()V */
final String v19 = "Problem parsing line \'"; // const-string v19, "Problem parsing line \'"
/* invoke-virtual/range {v18 ..v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v18 */
(( java.lang.StringBuilder ) v0 ).append ( v10 ); // invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v19 = "\' in "; // const-string v19, "\' in "
/* invoke-virtual/range {v18 ..v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v18 */
/* move-object/from16 v1, p1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* invoke-virtual/range {v18 ..v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* move-object/from16 v0, v18 */
/* invoke-direct {v8, v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v8 */
/* .line 404 */
} // .end local v9 # "cmtI":I
} // .end local v11 # "e":Ljava/lang/IllegalArgumentException;
} // .end local v14 # "line":Ljava/lang/String;
} // .end local v16 # "parts":[Ljava/lang/String;
} // .end local v17 # "rawLine":Ljava/lang/String;
} // :cond_7
} // .end method
private static org.apache.commons.codec.language.bm.Rule$RPattern pattern ( java.lang.String p0 ) {
/* .locals 13 */
/* .param p0, "regex" # Ljava/lang/String; */
/* .prologue */
int v11 = 0; // const/4 v11, 0x0
int v7 = 1; // const/4 v7, 0x1
/* .line 415 */
final String v10 = "^"; // const-string v10, "^"
v8 = (( java.lang.String ) p0 ).startsWith ( v10 ); // invoke-virtual {p0, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* .line 416 */
/* .local v8, "startsWith":Z */
final String v10 = "$"; // const-string v10, "$"
v4 = (( java.lang.String ) p0 ).endsWith ( v10 ); // invoke-virtual {p0, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* .line 417 */
/* .local v4, "endsWith":Z */
if ( v8 != null) { // if-eqz v8, :cond_0
/* move v12, v7 */
} // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_1
v10 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* add-int/lit8 v10, v10, -0x1 */
} // :goto_1
(( java.lang.String ) p0 ).substring ( v12, v10 ); // invoke-virtual {p0, v12, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 418 */
/* .local v3, "content":Ljava/lang/String; */
final String v10 = "["; // const-string v10, "["
v2 = (( java.lang.String ) v3 ).contains ( v10 ); // invoke-virtual {v3, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
/* .line 420 */
/* .local v2, "boxes":Z */
/* if-nez v2, :cond_7 */
/* .line 421 */
if ( v8 != null) { // if-eqz v8, :cond_3
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 423 */
v10 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* if-nez v10, :cond_2 */
/* .line 425 */
/* new-instance v10, Lorg/apache/commons/codec/language/bm/Rule$3; */
/* invoke-direct {v10}, Lorg/apache/commons/codec/language/bm/Rule$3;-><init>()V */
/* .line 504 */
} // :goto_2
} // .end local v2 # "boxes":Z
} // .end local v3 # "content":Ljava/lang/String;
} // :cond_0
/* move v12, v11 */
/* .line 417 */
} // :cond_1
v10 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* .line 432 */
/* .restart local v2 # "boxes":Z */
/* .restart local v3 # "content":Ljava/lang/String; */
} // :cond_2
/* new-instance v10, Lorg/apache/commons/codec/language/bm/Rule$4; */
/* invoke-direct {v10, v3}, Lorg/apache/commons/codec/language/bm/Rule$4;-><init>(Ljava/lang/String;)V */
/* .line 439 */
} // :cond_3
/* if-nez v8, :cond_4 */
if ( v4 != null) { // if-eqz v4, :cond_5
} // :cond_4
v10 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* if-nez v10, :cond_5 */
/* .line 441 */
v10 = org.apache.commons.codec.language.bm.Rule.ALL_STRINGS_RMATCHER;
/* .line 442 */
} // :cond_5
if ( v8 != null) { // if-eqz v8, :cond_6
/* .line 444 */
/* new-instance v10, Lorg/apache/commons/codec/language/bm/Rule$5; */
/* invoke-direct {v10, v3}, Lorg/apache/commons/codec/language/bm/Rule$5;-><init>(Ljava/lang/String;)V */
/* .line 450 */
} // :cond_6
if ( v4 != null) { // if-eqz v4, :cond_c
/* .line 452 */
/* new-instance v10, Lorg/apache/commons/codec/language/bm/Rule$6; */
/* invoke-direct {v10, v3}, Lorg/apache/commons/codec/language/bm/Rule$6;-><init>(Ljava/lang/String;)V */
/* .line 460 */
} // :cond_7
final String v10 = "["; // const-string v10, "["
v9 = (( java.lang.String ) v3 ).startsWith ( v10 ); // invoke-virtual {v3, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* .line 461 */
/* .local v9, "startsWithBox":Z */
final String v10 = "]"; // const-string v10, "]"
v5 = (( java.lang.String ) v3 ).endsWith ( v10 ); // invoke-virtual {v3, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* .line 463 */
/* .local v5, "endsWithBox":Z */
if ( v9 != null) { // if-eqz v9, :cond_c
if ( v5 != null) { // if-eqz v5, :cond_c
/* .line 464 */
v10 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* add-int/lit8 v10, v10, -0x1 */
(( java.lang.String ) v3 ).substring ( v7, v10 ); // invoke-virtual {v3, v7, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 465 */
/* .local v1, "boxContent":Ljava/lang/String; */
final String v10 = "["; // const-string v10, "["
v10 = (( java.lang.String ) v1 ).contains ( v10 ); // invoke-virtual {v1, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
/* if-nez v10, :cond_c */
/* .line 467 */
final String v10 = "^"; // const-string v10, "^"
v6 = (( java.lang.String ) v1 ).startsWith ( v10 ); // invoke-virtual {v1, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* .line 468 */
/* .local v6, "negate":Z */
if ( v6 != null) { // if-eqz v6, :cond_8
/* .line 469 */
(( java.lang.String ) v1 ).substring ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 471 */
} // :cond_8
/* move-object v0, v1 */
/* .line 472 */
/* .local v0, "bContent":Ljava/lang/String; */
/* if-nez v6, :cond_9 */
/* .line 474 */
/* .local v7, "shouldMatch":Z */
} // :goto_3
if ( v8 != null) { // if-eqz v8, :cond_a
if ( v4 != null) { // if-eqz v4, :cond_a
/* .line 476 */
/* new-instance v10, Lorg/apache/commons/codec/language/bm/Rule$7; */
/* invoke-direct {v10, v0, v7}, Lorg/apache/commons/codec/language/bm/Rule$7;-><init>(Ljava/lang/String;Z)V */
} // .end local v7 # "shouldMatch":Z
} // :cond_9
/* move v7, v11 */
/* .line 472 */
/* .line 482 */
/* .restart local v7 # "shouldMatch":Z */
} // :cond_a
if ( v8 != null) { // if-eqz v8, :cond_b
/* .line 484 */
/* new-instance v10, Lorg/apache/commons/codec/language/bm/Rule$8; */
/* invoke-direct {v10, v0, v7}, Lorg/apache/commons/codec/language/bm/Rule$8;-><init>(Ljava/lang/String;Z)V */
/* .line 490 */
} // :cond_b
if ( v4 != null) { // if-eqz v4, :cond_c
/* .line 492 */
/* new-instance v10, Lorg/apache/commons/codec/language/bm/Rule$9; */
/* invoke-direct {v10, v0, v7}, Lorg/apache/commons/codec/language/bm/Rule$9;-><init>(Ljava/lang/String;Z)V */
/* .line 504 */
} // .end local v0 # "bContent":Ljava/lang/String;
} // .end local v1 # "boxContent":Ljava/lang/String;
} // .end local v5 # "endsWithBox":Z
} // .end local v6 # "negate":Z
} // .end local v7 # "shouldMatch":Z
} // .end local v9 # "startsWithBox":Z
} // :cond_c
/* new-instance v10, Lorg/apache/commons/codec/language/bm/Rule$10; */
/* invoke-direct {v10, p0}, Lorg/apache/commons/codec/language/bm/Rule$10;-><init>(Ljava/lang/String;)V */
} // .end method
private static Boolean startsWith ( java.lang.CharSequence p0, java.lang.CharSequence p1 ) {
/* .locals 4 */
/* .param p0, "input" # Ljava/lang/CharSequence; */
/* .param p1, "prefix" # Ljava/lang/CharSequence; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
v3 = v2 = /* .line 516 */
/* if-le v2, v3, :cond_1 */
/* .line 524 */
} // :cond_0
} // :goto_0
/* .line 519 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
v2 = } // :goto_1
/* if-ge v0, v2, :cond_2 */
v3 = v2 = /* .line 520 */
/* if-ne v2, v3, :cond_0 */
/* .line 519 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 524 */
} // :cond_2
int v1 = 1; // const/4 v1, 0x1
} // .end method
private static java.lang.String stripQuotes ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "str" # Ljava/lang/String; */
/* .prologue */
/* .line 528 */
final String v0 = "\""; // const-string v0, "\""
v0 = (( java.lang.String ) p0 ).startsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 529 */
int v0 = 1; // const/4 v0, 0x1
(( java.lang.String ) p0 ).substring ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 532 */
} // :cond_0
final String v0 = "\""; // const-string v0, "\""
v0 = (( java.lang.String ) p0 ).endsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 533 */
int v0 = 0; // const/4 v0, 0x0
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* add-int/lit8 v1, v1, -0x1 */
(( java.lang.String ) p0 ).substring ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 536 */
} // :cond_1
} // .end method
/* # virtual methods */
public org.apache.commons.codec.language.bm.Rule$RPattern getLContext ( ) {
/* .locals 1 */
/* .prologue */
/* .line 572 */
v0 = this.lContext;
} // .end method
public java.lang.String getPattern ( ) {
/* .locals 1 */
/* .prologue */
/* .line 581 */
v0 = this.pattern;
} // .end method
public org.apache.commons.codec.language.bm.Rule$PhonemeExpr getPhoneme ( ) {
/* .locals 1 */
/* .prologue */
/* .line 590 */
v0 = this.phoneme;
} // .end method
public org.apache.commons.codec.language.bm.Rule$RPattern getRContext ( ) {
/* .locals 1 */
/* .prologue */
/* .line 599 */
v0 = this.rContext;
} // .end method
public Boolean patternAndContextMatches ( java.lang.CharSequence p0, Integer p1 ) {
/* .locals 5 */
/* .param p1, "input" # Ljava/lang/CharSequence; */
/* .param p2, "i" # I */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 614 */
/* if-gez p2, :cond_0 */
/* .line 615 */
/* new-instance v2, Ljava/lang/IndexOutOfBoundsException; */
final String v3 = "Can not match pattern at negative indexes"; // const-string v3, "Can not match pattern at negative indexes"
/* invoke-direct {v2, v3}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw v2 */
/* .line 618 */
} // :cond_0
v3 = this.pattern;
v1 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* .line 619 */
/* .local v1, "patternLength":I */
/* add-int v0, p2, v1 */
/* .line 621 */
v3 = /* .local v0, "ipl":I */
/* if-le v0, v3, :cond_2 */
/* .line 633 */
} // :cond_1
} // :goto_0
/* .line 628 */
} // :cond_2
v4 = this.pattern;
v3 = (( java.lang.Object ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 630 */
v3 = v4 = v3 = this.rContext;
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 633 */
v2 = v3 = this.lContext;
} // .end method
