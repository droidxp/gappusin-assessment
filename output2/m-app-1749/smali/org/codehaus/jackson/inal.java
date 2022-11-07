public class inal extends java.lang.Enum {
	 /* .source "JsonToken.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum", */
	 /* "<", */
	 /* "Lorg/codehaus/jackson/JsonToken;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
private static final org.codehaus.jackson.JsonToken $VALUES; //synthetic
public static final org.codehaus.jackson.JsonToken END_ARRAY;
public static final org.codehaus.jackson.JsonToken END_OBJECT;
public static final org.codehaus.jackson.JsonToken FIELD_NAME;
public static final org.codehaus.jackson.JsonToken NOT_AVAILABLE;
public static final org.codehaus.jackson.JsonToken START_ARRAY;
public static final org.codehaus.jackson.JsonToken START_OBJECT;
public static final org.codehaus.jackson.JsonToken VALUE_EMBEDDED_OBJECT;
public static final org.codehaus.jackson.JsonToken VALUE_FALSE;
public static final org.codehaus.jackson.JsonToken VALUE_NULL;
public static final org.codehaus.jackson.JsonToken VALUE_NUMBER_FLOAT;
public static final org.codehaus.jackson.JsonToken VALUE_NUMBER_INT;
public static final org.codehaus.jackson.JsonToken VALUE_STRING;
public static final org.codehaus.jackson.JsonToken VALUE_TRUE;
/* # instance fields */
final java.lang.String _serialized;
final _serializedBytes;
final _serializedChars;
/* # direct methods */
static inal ( ) {
	 /* .locals 9 */
	 /* .prologue */
	 int v8 = 3; // const/4 v8, 0x3
	 int v7 = 2; // const/4 v7, 0x2
	 int v6 = 1; // const/4 v6, 0x1
	 int v5 = 0; // const/4 v5, 0x0
	 int v4 = 0; // const/4 v4, 0x0
	 /* .line 28 */
	 /* new-instance v0, Lorg/codehaus/jackson/JsonToken; */
	 final String v1 = "NOT_AVAILABLE"; // const-string v1, "NOT_AVAILABLE"
	 /* invoke-direct {v0, v1, v5, v4}, Lorg/codehaus/jackson/JsonToken;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 34 */
	 /* new-instance v0, Lorg/codehaus/jackson/JsonToken; */
	 final String v1 = "START_OBJECT"; // const-string v1, "START_OBJECT"
	 final String v2 = "{"; // const-string v2, "{"
	 /* invoke-direct {v0, v1, v6, v2}, Lorg/codehaus/jackson/JsonToken;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 40 */
	 /* new-instance v0, Lorg/codehaus/jackson/JsonToken; */
	 final String v1 = "END_OBJECT"; // const-string v1, "END_OBJECT"
	 final String v2 = "}"; // const-string v2, "}"
	 /* invoke-direct {v0, v1, v7, v2}, Lorg/codehaus/jackson/JsonToken;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 46 */
	 /* new-instance v0, Lorg/codehaus/jackson/JsonToken; */
	 final String v1 = "START_ARRAY"; // const-string v1, "START_ARRAY"
	 final String v2 = "["; // const-string v2, "["
	 /* invoke-direct {v0, v1, v8, v2}, Lorg/codehaus/jackson/JsonToken;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 52 */
	 /* new-instance v0, Lorg/codehaus/jackson/JsonToken; */
	 final String v1 = "END_ARRAY"; // const-string v1, "END_ARRAY"
	 int v2 = 4; // const/4 v2, 0x4
	 final String v3 = "]"; // const-string v3, "]"
	 /* invoke-direct {v0, v1, v2, v3}, Lorg/codehaus/jackson/JsonToken;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 58 */
	 /* new-instance v0, Lorg/codehaus/jackson/JsonToken; */
	 final String v1 = "FIELD_NAME"; // const-string v1, "FIELD_NAME"
	 int v2 = 5; // const/4 v2, 0x5
	 /* invoke-direct {v0, v1, v2, v4}, Lorg/codehaus/jackson/JsonToken;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 72 */
	 /* new-instance v0, Lorg/codehaus/jackson/JsonToken; */
	 final String v1 = "VALUE_EMBEDDED_OBJECT"; // const-string v1, "VALUE_EMBEDDED_OBJECT"
	 int v2 = 6; // const/4 v2, 0x6
	 /* invoke-direct {v0, v1, v2, v4}, Lorg/codehaus/jackson/JsonToken;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 79 */
	 /* new-instance v0, Lorg/codehaus/jackson/JsonToken; */
	 final String v1 = "VALUE_STRING"; // const-string v1, "VALUE_STRING"
	 int v2 = 7; // const/4 v2, 0x7
	 /* invoke-direct {v0, v1, v2, v4}, Lorg/codehaus/jackson/JsonToken;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 87 */
	 /* new-instance v0, Lorg/codehaus/jackson/JsonToken; */
	 final String v1 = "VALUE_NUMBER_INT"; // const-string v1, "VALUE_NUMBER_INT"
	 /* const/16 v2, 0x8 */
	 /* invoke-direct {v0, v1, v2, v4}, Lorg/codehaus/jackson/JsonToken;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 95 */
	 /* new-instance v0, Lorg/codehaus/jackson/JsonToken; */
	 final String v1 = "VALUE_NUMBER_FLOAT"; // const-string v1, "VALUE_NUMBER_FLOAT"
	 /* const/16 v2, 0x9 */
	 /* invoke-direct {v0, v1, v2, v4}, Lorg/codehaus/jackson/JsonToken;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 101 */
	 /* new-instance v0, Lorg/codehaus/jackson/JsonToken; */
	 final String v1 = "VALUE_TRUE"; // const-string v1, "VALUE_TRUE"
	 /* const/16 v2, 0xa */
	 final String v3 = "true"; // const-string v3, "true"
	 /* invoke-direct {v0, v1, v2, v3}, Lorg/codehaus/jackson/JsonToken;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 107 */
	 /* new-instance v0, Lorg/codehaus/jackson/JsonToken; */
	 final String v1 = "VALUE_FALSE"; // const-string v1, "VALUE_FALSE"
	 /* const/16 v2, 0xb */
	 final String v3 = "false"; // const-string v3, "false"
	 /* invoke-direct {v0, v1, v2, v3}, Lorg/codehaus/jackson/JsonToken;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 113 */
	 /* new-instance v0, Lorg/codehaus/jackson/JsonToken; */
	 final String v1 = "VALUE_NULL"; // const-string v1, "VALUE_NULL"
	 /* const/16 v2, 0xc */
	 final String v3 = "null"; // const-string v3, "null"
	 /* invoke-direct {v0, v1, v2, v3}, Lorg/codehaus/jackson/JsonToken;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 /* .line 7 */
	 /* const/16 v0, 0xd */
	 /* new-array v0, v0, [Lorg/codehaus/jackson/JsonToken; */
	 v1 = org.codehaus.jackson.JsonToken.NOT_AVAILABLE;
	 /* aput-object v1, v0, v5 */
	 v1 = org.codehaus.jackson.JsonToken.START_OBJECT;
	 /* aput-object v1, v0, v6 */
	 v1 = org.codehaus.jackson.JsonToken.END_OBJECT;
	 /* aput-object v1, v0, v7 */
	 v1 = org.codehaus.jackson.JsonToken.START_ARRAY;
	 /* aput-object v1, v0, v8 */
	 int v1 = 4; // const/4 v1, 0x4
	 v2 = org.codehaus.jackson.JsonToken.END_ARRAY;
	 /* aput-object v2, v0, v1 */
	 int v1 = 5; // const/4 v1, 0x5
	 v2 = org.codehaus.jackson.JsonToken.FIELD_NAME;
	 /* aput-object v2, v0, v1 */
	 int v1 = 6; // const/4 v1, 0x6
	 v2 = org.codehaus.jackson.JsonToken.VALUE_EMBEDDED_OBJECT;
	 /* aput-object v2, v0, v1 */
	 int v1 = 7; // const/4 v1, 0x7
	 v2 = org.codehaus.jackson.JsonToken.VALUE_STRING;
	 /* aput-object v2, v0, v1 */
	 /* const/16 v1, 0x8 */
	 v2 = org.codehaus.jackson.JsonToken.VALUE_NUMBER_INT;
	 /* aput-object v2, v0, v1 */
	 /* const/16 v1, 0x9 */
	 v2 = org.codehaus.jackson.JsonToken.VALUE_NUMBER_FLOAT;
	 /* aput-object v2, v0, v1 */
	 /* const/16 v1, 0xa */
	 v2 = org.codehaus.jackson.JsonToken.VALUE_TRUE;
	 /* aput-object v2, v0, v1 */
	 /* const/16 v1, 0xb */
	 v2 = org.codehaus.jackson.JsonToken.VALUE_FALSE;
	 /* aput-object v2, v0, v1 */
	 /* const/16 v1, 0xc */
	 v2 = org.codehaus.jackson.JsonToken.VALUE_NULL;
	 /* aput-object v2, v0, v1 */
	 return;
} // .end method
private inal ( ) {
	 /* .locals 4 */
	 /* .param p3, "token" # Ljava/lang/String; */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/lang/String;", */
	 /* ")V" */
	 /* } */
} // .end annotation
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 127 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
/* .line 128 */
/* if-nez p3, :cond_1 */
/* .line 129 */
this._serialized = v2;
/* .line 130 */
this._serializedChars = v2;
/* .line 131 */
this._serializedBytes = v2;
/* .line 142 */
} // :cond_0
return;
/* .line 133 */
} // :cond_1
this._serialized = p3;
/* .line 134 */
(( java.lang.String ) p3 ).toCharArray ( ); // invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C
this._serializedChars = v2;
/* .line 136 */
v2 = this._serializedChars;
/* array-length v1, v2 */
/* .line 137 */
/* .local v1, "len":I */
/* new-array v2, v1, [B */
this._serializedBytes = v2;
/* .line 138 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* if-ge v0, v1, :cond_0 */
/* .line 139 */
v2 = this._serializedBytes;
v3 = this._serializedChars;
/* aget-char v3, v3, v0 */
/* int-to-byte v3, v3 */
/* aput-byte v3, v2, v0 */
/* .line 138 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static org.codehaus.jackson.JsonToken valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 7 */
/* const-class v0, Lorg/codehaus/jackson/JsonToken; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lorg/codehaus/jackson/JsonToken; */
} // .end method
public static org.codehaus.jackson.JsonToken values ( ) {
/* .locals 1 */
/* .prologue */
/* .line 7 */
v0 = org.codehaus.jackson.JsonToken.$VALUES;
(( org.codehaus.jackson.JsonToken ) v0 ).clone ( ); // invoke-virtual {v0}, [Lorg/codehaus/jackson/JsonToken;->clone()Ljava/lang/Object;
/* check-cast v0, [Lorg/codehaus/jackson/JsonToken; */
} // .end method
/* # virtual methods */
public asByteArray ( ) {
/* .locals 1 */
/* .prologue */
/* .line 146 */
v0 = this._serializedBytes;
} // .end method
public asCharArray ( ) {
/* .locals 1 */
/* .prologue */
/* .line 145 */
v0 = this._serializedChars;
} // .end method
public java.lang.String asString ( ) {
/* .locals 1 */
/* .prologue */
/* .line 144 */
v0 = this._serialized;
} // .end method
public Boolean isNumeric ( ) {
/* .locals 1 */
/* .prologue */
/* .line 149 */
v0 = org.codehaus.jackson.JsonToken.VALUE_NUMBER_INT;
/* if-eq p0, v0, :cond_0 */
v0 = org.codehaus.jackson.JsonToken.VALUE_NUMBER_FLOAT;
/* if-ne p0, v0, :cond_1 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isScalarValue ( ) {
/* .locals 2 */
/* .prologue */
/* .line 158 */
v0 = (( org.codehaus.jackson.JsonToken ) p0 ).ordinal ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
v1 = org.codehaus.jackson.JsonToken.VALUE_STRING;
v1 = (( org.codehaus.jackson.JsonToken ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
/* if-lt v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
