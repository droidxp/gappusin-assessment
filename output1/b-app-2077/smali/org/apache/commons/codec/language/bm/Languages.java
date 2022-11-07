public class org.apache.commons.codec.language.bm.Languages {
	 /* .source "Languages.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/commons/codec/language/bm/Languages$SomeLanguages;, */
	 /* Lorg/apache/commons/codec/language/bm/Languages$LanguageSet; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String ANY;
public static final org.apache.commons.codec.language.bm.Languages$LanguageSet ANY_LANGUAGE;
private static final java.util.Map LANGUAGES;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Lorg/apache/commons/codec/language/bm/NameType;", */
/* "Lorg/apache/commons/codec/language/bm/Languages;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static final org.apache.commons.codec.language.bm.Languages$LanguageSet NO_LANGUAGES;
/* # instance fields */
private final java.util.Set languages;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static org.apache.commons.codec.language.bm.Languages ( ) {
/* .locals 6 */
/* .prologue */
/* .line 139 */
/* new-instance v4, Ljava/util/EnumMap; */
/* const-class v5, Lorg/apache/commons/codec/language/bm/NameType; */
/* invoke-direct {v4, v5}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V */
/* .line 142 */
org.apache.commons.codec.language.bm.NameType .values ( );
/* .local v0, "arr$":[Lorg/apache/commons/codec/language/bm/NameType; */
/* array-length v2, v0 */
/* .local v2, "len$":I */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i$":I */
} // :goto_0
/* if-ge v1, v2, :cond_0 */
/* aget-object v3, v0, v1 */
/* .line 143 */
/* .local v3, "s":Lorg/apache/commons/codec/language/bm/NameType; */
v4 = org.apache.commons.codec.language.bm.Languages.LANGUAGES;
org.apache.commons.codec.language.bm.Languages .langResourceName ( v3 );
org.apache.commons.codec.language.bm.Languages .getInstance ( v5 );
/* .line 142 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 189 */
} // .end local v3 # "s":Lorg/apache/commons/codec/language/bm/NameType;
} // :cond_0
/* new-instance v4, Lorg/apache/commons/codec/language/bm/Languages$1; */
/* invoke-direct {v4}, Lorg/apache/commons/codec/language/bm/Languages$1;-><init>()V */
/* .line 224 */
/* new-instance v4, Lorg/apache/commons/codec/language/bm/Languages$2; */
/* invoke-direct {v4}, Lorg/apache/commons/codec/language/bm/Languages$2;-><init>()V */
return;
} // .end method
private org.apache.commons.codec.language.bm.Languages ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 256 */
/* .local p1, "languages":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 257 */
this.languages = p1;
/* .line 258 */
return;
} // .end method
public static org.apache.commons.codec.language.bm.Languages getInstance ( java.lang.String p0 ) {
/* .locals 8 */
/* .param p0, "languagesResourceName" # Ljava/lang/String; */
/* .prologue */
/* .line 153 */
/* new-instance v3, Ljava/util/HashSet; */
/* invoke-direct {v3}, Ljava/util/HashSet;-><init>()V */
/* .line 154 */
/* .local v3, "ls":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
/* const-class v5, Lorg/apache/commons/codec/language/bm/Languages; */
(( java.lang.Class ) v5 ).getClassLoader ( ); // invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
(( java.lang.ClassLoader ) v5 ).getResourceAsStream ( p0 ); // invoke-virtual {v5, p0}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
/* .line 156 */
/* .local v1, "langIS":Ljava/io/InputStream; */
/* if-nez v1, :cond_0 */
/* .line 157 */
/* new-instance v5, Ljava/lang/IllegalArgumentException; */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "Unable to resolve required resource: "; // const-string v7, "Unable to resolve required resource: "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( p0 ); // invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v5 */
/* .line 160 */
} // :cond_0
/* new-instance v4, Ljava/util/Scanner; */
final String v5 = "UTF-8"; // const-string v5, "UTF-8"
/* invoke-direct {v4, v1, v5}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V */
/* .line 161 */
/* .local v4, "lsScanner":Ljava/util/Scanner; */
int v0 = 0; // const/4 v0, 0x0
/* .line 162 */
/* .local v0, "inExtendedComment":Z */
} // :cond_1
} // :goto_0
v5 = (( java.util.Scanner ) v4 ).hasNextLine ( ); // invoke-virtual {v4}, Ljava/util/Scanner;->hasNextLine()Z
if ( v5 != null) { // if-eqz v5, :cond_4
/* .line 163 */
(( java.util.Scanner ) v4 ).nextLine ( ); // invoke-virtual {v4}, Ljava/util/Scanner;->nextLine()Ljava/lang/String;
(( java.lang.String ) v5 ).trim ( ); // invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 164 */
/* .local v2, "line":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 165 */
final String v5 = "*/"; // const-string v5, "*/"
v5 = (( java.lang.String ) v2 ).endsWith ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 166 */
int v0 = 0; // const/4 v0, 0x0
/* .line 169 */
} // :cond_2
final String v5 = "/*"; // const-string v5, "/*"
v5 = (( java.lang.String ) v2 ).startsWith ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 170 */
int v0 = 1; // const/4 v0, 0x1
/* .line 171 */
} // :cond_3
v5 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* if-lez v5, :cond_1 */
/* .line 172 */
/* .line 177 */
} // .end local v2 # "line":Ljava/lang/String;
} // :cond_4
/* new-instance v5, Lorg/apache/commons/codec/language/bm/Languages; */
java.util.Collections .unmodifiableSet ( v3 );
/* invoke-direct {v5, v6}, Lorg/apache/commons/codec/language/bm/Languages;-><init>(Ljava/util/Set;)V */
} // .end method
public static org.apache.commons.codec.language.bm.Languages getInstance ( org.apache.commons.codec.language.bm.NameType p0 ) {
/* .locals 1 */
/* .param p0, "nameType" # Lorg/apache/commons/codec/language/bm/NameType; */
/* .prologue */
/* .line 148 */
v0 = org.apache.commons.codec.language.bm.Languages.LANGUAGES;
/* check-cast v0, Lorg/apache/commons/codec/language/bm/Languages; */
} // .end method
private static java.lang.String langResourceName ( org.apache.commons.codec.language.bm.NameType p0 ) {
/* .locals 4 */
/* .param p0, "nameType" # Lorg/apache/commons/codec/language/bm/NameType; */
/* .prologue */
/* .line 181 */
final String v0 = "org/apache/commons/codec/language/bm/%s_languages.txt"; // const-string v0, "org/apache/commons/codec/language/bm/%s_languages.txt"
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
(( org.apache.commons.codec.language.bm.NameType ) p0 ).getName ( ); // invoke-virtual {p0}, Lorg/apache/commons/codec/language/bm/NameType;->getName()Ljava/lang/String;
/* aput-object v3, v1, v2 */
java.lang.String .format ( v0,v1 );
} // .end method
/* # virtual methods */
public java.util.Set getLanguages ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 261 */
v0 = this.languages;
} // .end method
