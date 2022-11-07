public class org.apache.commons.codec.language.bm.Lang {
	 /* .source "Lang.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/commons/codec/language/bm/Lang$1;, */
	 /* Lorg/apache/commons/codec/language/bm/Lang$LangRule; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String LANGUAGE_RULES_RN;
private static final java.util.Map Langs;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Lorg/apache/commons/codec/language/bm/NameType;", */
/* "Lorg/apache/commons/codec/language/bm/Lang;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
private final org.apache.commons.codec.language.bm.Languages languages;
private final java.util.List rules;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Lorg/apache/commons/codec/language/bm/Lang$LangRule;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static org.apache.commons.codec.language.bm.Lang ( ) {
/* .locals 7 */
/* .prologue */
/* .line 96 */
/* new-instance v4, Ljava/util/EnumMap; */
/* const-class v5, Lorg/apache/commons/codec/language/bm/NameType; */
/* invoke-direct {v4, v5}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V */
/* .line 101 */
org.apache.commons.codec.language.bm.NameType .values ( );
/* .local v0, "arr$":[Lorg/apache/commons/codec/language/bm/NameType; */
/* array-length v2, v0 */
/* .local v2, "len$":I */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i$":I */
} // :goto_0
/* if-ge v1, v2, :cond_0 */
/* aget-object v3, v0, v1 */
/* .line 102 */
/* .local v3, "s":Lorg/apache/commons/codec/language/bm/NameType; */
v4 = org.apache.commons.codec.language.bm.Lang.Langs;
final String v5 = "org/apache/commons/codec/language/bm/lang.txt"; // const-string v5, "org/apache/commons/codec/language/bm/lang.txt"
org.apache.commons.codec.language.bm.Languages .getInstance ( v3 );
org.apache.commons.codec.language.bm.Lang .loadFromResource ( v5,v6 );
/* .line 101 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 104 */
} // .end local v3 # "s":Lorg/apache/commons/codec/language/bm/NameType;
} // :cond_0
return;
} // .end method
private org.apache.commons.codec.language.bm.Lang ( ) {
/* .locals 1 */
/* .param p2, "languages" # Lorg/apache/commons/codec/language/bm/Languages; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List", */
/* "<", */
/* "Lorg/apache/commons/codec/language/bm/Lang$LangRule;", */
/* ">;", */
/* "Lorg/apache/commons/codec/language/bm/Languages;", */
/* ")V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 188 */
/* .local p1, "rules":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/codec/language/bm/Lang$LangRule;>;" */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 189 */
java.util.Collections .unmodifiableList ( p1 );
this.rules = v0;
/* .line 190 */
this.languages = p2;
/* .line 191 */
return;
} // .end method
public static org.apache.commons.codec.language.bm.Lang instance ( org.apache.commons.codec.language.bm.NameType p0 ) {
/* .locals 1 */
/* .param p0, "nameType" # Lorg/apache/commons/codec/language/bm/NameType; */
/* .prologue */
/* .line 114 */
v0 = org.apache.commons.codec.language.bm.Lang.Langs;
/* check-cast v0, Lorg/apache/commons/codec/language/bm/Lang; */
} // .end method
public static org.apache.commons.codec.language.bm.Lang loadFromResource ( java.lang.String p0, org.apache.commons.codec.language.bm.Languages p1 ) {
/* .locals 14 */
/* .param p0, "languageRulesResourceName" # Ljava/lang/String; */
/* .param p1, "languages" # Lorg/apache/commons/codec/language/bm/Languages; */
/* .prologue */
/* .line 130 */
/* new-instance v9, Ljava/util/ArrayList; */
/* invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V */
/* .line 131 */
/* .local v9, "rules":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/codec/language/bm/Lang$LangRule;>;" */
/* const-class v11, Lorg/apache/commons/codec/language/bm/Lang; */
(( java.lang.Class ) v11 ).getClassLoader ( ); // invoke-virtual {v11}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
(( java.lang.ClassLoader ) v11 ).getResourceAsStream ( p0 ); // invoke-virtual {v11, p0}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
/* .line 133 */
/* .local v3, "lRulesIS":Ljava/io/InputStream; */
/* if-nez v3, :cond_0 */
/* .line 134 */
/* new-instance v11, Ljava/lang/IllegalStateException; */
final String v12 = "Unable to resolve required resource:org/apache/commons/codec/language/bm/lang.txt"; // const-string v12, "Unable to resolve required resource:org/apache/commons/codec/language/bm/lang.txt"
/* invoke-direct {v11, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 137 */
} // :cond_0
/* new-instance v10, Ljava/util/Scanner; */
final String v11 = "UTF-8"; // const-string v11, "UTF-8"
/* invoke-direct {v10, v3, v11}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V */
/* .line 138 */
/* .local v10, "scanner":Ljava/util/Scanner; */
int v2 = 0; // const/4 v2, 0x0
/* .line 139 */
/* .local v2, "inExtendedComment":Z */
} // :cond_1
} // :goto_0
v11 = (( java.util.Scanner ) v10 ).hasNextLine ( ); // invoke-virtual {v10}, Ljava/util/Scanner;->hasNextLine()Z
if ( v11 != null) { // if-eqz v11, :cond_6
/* .line 140 */
(( java.util.Scanner ) v10 ).nextLine ( ); // invoke-virtual {v10}, Ljava/util/Scanner;->nextLine()Ljava/lang/String;
/* .line 141 */
/* .local v8, "rawLine":Ljava/lang/String; */
/* move-object v5, v8 */
/* .line 143 */
/* .local v5, "line":Ljava/lang/String; */
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 145 */
final String v11 = "*/"; // const-string v11, "*/"
v11 = (( java.lang.String ) v5 ).endsWith ( v11 ); // invoke-virtual {v5, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_1
/* .line 146 */
int v2 = 0; // const/4 v2, 0x0
/* .line 149 */
} // :cond_2
final String v11 = "/*"; // const-string v11, "/*"
v11 = (( java.lang.String ) v5 ).startsWith ( v11 ); // invoke-virtual {v5, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_3
/* .line 150 */
int v2 = 1; // const/4 v2, 0x1
/* .line 153 */
} // :cond_3
final String v11 = "//"; // const-string v11, "//"
v1 = (( java.lang.String ) v5 ).indexOf ( v11 ); // invoke-virtual {v5, v11}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* .line 154 */
/* .local v1, "cmtI":I */
/* if-ltz v1, :cond_4 */
/* .line 155 */
int v11 = 0; // const/4 v11, 0x0
(( java.lang.String ) v5 ).substring ( v11, v1 ); // invoke-virtual {v5, v11, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 159 */
} // :cond_4
(( java.lang.String ) v5 ).trim ( ); // invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 161 */
v11 = (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
if ( v11 != null) { // if-eqz v11, :cond_1
/* .line 166 */
final String v11 = "\\s+"; // const-string v11, "\\s+"
(( java.lang.String ) v5 ).split ( v11 ); // invoke-virtual {v5, v11}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 168 */
/* .local v6, "parts":[Ljava/lang/String; */
/* array-length v11, v6 */
int v12 = 3; // const/4 v12, 0x3
/* if-eq v11, v12, :cond_5 */
/* .line 169 */
/* new-instance v11, Ljava/lang/IllegalArgumentException; */
/* new-instance v12, Ljava/lang/StringBuilder; */
/* invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V */
final String v13 = "Malformed line \'"; // const-string v13, "Malformed line \'"
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).append ( v8 ); // invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v13 = "\' in language resource \'"; // const-string v13, "\' in language resource \'"
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).append ( p0 ); // invoke-virtual {v12, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v13 = "\'"; // const-string v13, "\'"
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v11, v12}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 173 */
} // :cond_5
int v11 = 0; // const/4 v11, 0x0
/* aget-object v11, v6, v11 */
java.util.regex.Pattern .compile ( v11 );
/* .line 174 */
/* .local v7, "pattern":Ljava/util/regex/Pattern; */
int v11 = 1; // const/4 v11, 0x1
/* aget-object v11, v6, v11 */
final String v12 = "\\+"; // const-string v12, "\\+"
(( java.lang.String ) v11 ).split ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 175 */
/* .local v4, "langs":[Ljava/lang/String; */
int v11 = 2; // const/4 v11, 0x2
/* aget-object v11, v6, v11 */
final String v12 = "true"; // const-string v12, "true"
v0 = (( java.lang.String ) v11 ).equals ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* .line 177 */
/* .local v0, "accept":Z */
/* new-instance v11, Lorg/apache/commons/codec/language/bm/Lang$LangRule; */
/* new-instance v12, Ljava/util/HashSet; */
java.util.Arrays .asList ( v4 );
/* invoke-direct {v12, v13}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V */
int v13 = 0; // const/4 v13, 0x0
/* invoke-direct {v11, v7, v12, v0, v13}, Lorg/apache/commons/codec/language/bm/Lang$LangRule;-><init>(Ljava/util/regex/Pattern;Ljava/util/Set;ZLorg/apache/commons/codec/language/bm/Lang$1;)V */
/* goto/16 :goto_0 */
/* .line 182 */
} // .end local v0 # "accept":Z
} // .end local v1 # "cmtI":I
} // .end local v4 # "langs":[Ljava/lang/String;
} // .end local v5 # "line":Ljava/lang/String;
} // .end local v6 # "parts":[Ljava/lang/String;
} // .end local v7 # "pattern":Ljava/util/regex/Pattern;
} // .end local v8 # "rawLine":Ljava/lang/String;
} // :cond_6
/* new-instance v11, Lorg/apache/commons/codec/language/bm/Lang; */
/* invoke-direct {v11, v9, p1}, Lorg/apache/commons/codec/language/bm/Lang;-><init>(Ljava/util/List;Lorg/apache/commons/codec/language/bm/Languages;)V */
} // .end method
/* # virtual methods */
public java.lang.String guessLanguage ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
/* .line 201 */
(( org.apache.commons.codec.language.bm.Lang ) p0 ).guessLanguages ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/bm/Lang;->guessLanguages(Ljava/lang/String;)Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;
/* .line 202 */
/* .local v0, "ls":Lorg/apache/commons/codec/language/bm/Languages$LanguageSet; */
v1 = (( org.apache.commons.codec.language.bm.Languages$LanguageSet ) v0 ).isSingleton ( ); // invoke-virtual {v0}, Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;->isSingleton()Z
if ( v1 != null) { // if-eqz v1, :cond_0
(( org.apache.commons.codec.language.bm.Languages$LanguageSet ) v0 ).getAny ( ); // invoke-virtual {v0}, Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;->getAny()Ljava/lang/String;
} // :goto_0
} // :cond_0
final String v1 = "any"; // const-string v1, "any"
} // .end method
public org.apache.commons.codec.language.bm.Languages$LanguageSet guessLanguages ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p1, "input" # Ljava/lang/String; */
/* .prologue */
/* .line 213 */
v5 = java.util.Locale.ENGLISH;
(( java.lang.String ) p1 ).toLowerCase ( v5 ); // invoke-virtual {p1, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
/* .line 215 */
/* .local v4, "text":Ljava/lang/String; */
/* new-instance v1, Ljava/util/HashSet; */
v5 = this.languages;
(( org.apache.commons.codec.language.bm.Languages ) v5 ).getLanguages ( ); // invoke-virtual {v5}, Lorg/apache/commons/codec/language/bm/Languages;->getLanguages()Ljava/util/Set;
/* invoke-direct {v1, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V */
/* .line 216 */
/* .local v1, "langs":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
v5 = this.rules;
/* .local v0, "i$":Ljava/util/Iterator; */
} // :cond_0
v5 = } // :goto_0
if ( v5 != null) { // if-eqz v5, :cond_2
/* check-cast v3, Lorg/apache/commons/codec/language/bm/Lang$LangRule; */
/* .line 217 */
/* .local v3, "rule":Lorg/apache/commons/codec/language/bm/Lang$LangRule; */
v5 = (( org.apache.commons.codec.language.bm.Lang$LangRule ) v3 ).matches ( v4 ); // invoke-virtual {v3, v4}, Lorg/apache/commons/codec/language/bm/Lang$LangRule;->matches(Ljava/lang/String;)Z
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 218 */
v5 = org.apache.commons.codec.language.bm.Lang$LangRule .access$100 ( v3 );
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 219 */
org.apache.commons.codec.language.bm.Lang$LangRule .access$200 ( v3 );
/* .line 221 */
} // :cond_1
org.apache.commons.codec.language.bm.Lang$LangRule .access$200 ( v3 );
/* .line 226 */
} // .end local v3 # "rule":Lorg/apache/commons/codec/language/bm/Lang$LangRule;
} // :cond_2
org.apache.commons.codec.language.bm.Languages$LanguageSet .from ( v1 );
/* .line 227 */
/* .local v2, "ls":Lorg/apache/commons/codec/language/bm/Languages$LanguageSet; */
v5 = org.apache.commons.codec.language.bm.Languages.NO_LANGUAGES;
v5 = (( java.lang.Object ) v2 ).equals ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_3
v2 = org.apache.commons.codec.language.bm.Languages.ANY_LANGUAGE;
} // .end local v2 # "ls":Lorg/apache/commons/codec/language/bm/Languages$LanguageSet;
} // :cond_3
} // .end method
