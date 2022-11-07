class ynthetic {
	 /* .source "JsonGeneratorBase.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/codehaus/jackson/impl/JsonGeneratorBase; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1008 */
/* name = null */
} // .end annotation
/* # static fields */
static final $SwitchMap$org$codehaus$jackson$JsonParser$NumberType; //synthetic
static final $SwitchMap$org$codehaus$jackson$JsonToken; //synthetic
/* # direct methods */
static ynthetic ( ) {
/* .locals 3 */
/* .prologue */
/* .line 328 */
org.codehaus.jackson.JsonToken .values ( );
/* array-length v0, v0 */
/* new-array v0, v0, [I */
try { // :try_start_0
	 v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
	 v1 = org.codehaus.jackson.JsonToken.START_OBJECT;
	 v1 = 	 (( org.codehaus.jackson.JsonToken ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
	 int v2 = 1; // const/4 v2, 0x1
	 /* aput v2, v0, v1 */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_f */
} // :goto_0
try { // :try_start_1
	 v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
	 v1 = org.codehaus.jackson.JsonToken.END_OBJECT;
	 v1 = 	 (( org.codehaus.jackson.JsonToken ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
	 int v2 = 2; // const/4 v2, 0x2
	 /* aput v2, v0, v1 */
	 /* :try_end_1 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_e */
} // :goto_1
try { // :try_start_2
	 v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
	 v1 = org.codehaus.jackson.JsonToken.START_ARRAY;
	 v1 = 	 (( org.codehaus.jackson.JsonToken ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
	 int v2 = 3; // const/4 v2, 0x3
	 /* aput v2, v0, v1 */
	 /* :try_end_2 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_d */
} // :goto_2
try { // :try_start_3
	 v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
	 v1 = org.codehaus.jackson.JsonToken.END_ARRAY;
	 v1 = 	 (( org.codehaus.jackson.JsonToken ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
	 int v2 = 4; // const/4 v2, 0x4
	 /* aput v2, v0, v1 */
	 /* :try_end_3 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_3 ..:try_end_3} :catch_c */
} // :goto_3
try { // :try_start_4
	 v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
	 v1 = org.codehaus.jackson.JsonToken.FIELD_NAME;
	 v1 = 	 (( org.codehaus.jackson.JsonToken ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
	 int v2 = 5; // const/4 v2, 0x5
	 /* aput v2, v0, v1 */
	 /* :try_end_4 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_4 ..:try_end_4} :catch_b */
} // :goto_4
try { // :try_start_5
	 v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
	 v1 = org.codehaus.jackson.JsonToken.VALUE_STRING;
	 v1 = 	 (( org.codehaus.jackson.JsonToken ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
	 int v2 = 6; // const/4 v2, 0x6
	 /* aput v2, v0, v1 */
	 /* :try_end_5 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_5 ..:try_end_5} :catch_a */
} // :goto_5
try { // :try_start_6
	 v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
	 v1 = org.codehaus.jackson.JsonToken.VALUE_NUMBER_INT;
	 v1 = 	 (( org.codehaus.jackson.JsonToken ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
	 int v2 = 7; // const/4 v2, 0x7
	 /* aput v2, v0, v1 */
	 /* :try_end_6 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_6 ..:try_end_6} :catch_9 */
} // :goto_6
try { // :try_start_7
	 v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
	 v1 = org.codehaus.jackson.JsonToken.VALUE_NUMBER_FLOAT;
	 v1 = 	 (( org.codehaus.jackson.JsonToken ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
	 /* const/16 v2, 0x8 */
	 /* aput v2, v0, v1 */
	 /* :try_end_7 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_7 ..:try_end_7} :catch_8 */
} // :goto_7
try { // :try_start_8
	 v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
	 v1 = org.codehaus.jackson.JsonToken.VALUE_TRUE;
	 v1 = 	 (( org.codehaus.jackson.JsonToken ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
	 /* const/16 v2, 0x9 */
	 /* aput v2, v0, v1 */
	 /* :try_end_8 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_8 ..:try_end_8} :catch_7 */
} // :goto_8
try { // :try_start_9
	 v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
	 v1 = org.codehaus.jackson.JsonToken.VALUE_FALSE;
	 v1 = 	 (( org.codehaus.jackson.JsonToken ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
	 /* const/16 v2, 0xa */
	 /* aput v2, v0, v1 */
	 /* :try_end_9 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_9 ..:try_end_9} :catch_6 */
} // :goto_9
try { // :try_start_a
	 v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
	 v1 = org.codehaus.jackson.JsonToken.VALUE_NULL;
	 v1 = 	 (( org.codehaus.jackson.JsonToken ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
	 /* const/16 v2, 0xb */
	 /* aput v2, v0, v1 */
	 /* :try_end_a */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_a ..:try_end_a} :catch_5 */
} // :goto_a
try { // :try_start_b
	 v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonToken;
	 v1 = org.codehaus.jackson.JsonToken.VALUE_EMBEDDED_OBJECT;
	 v1 = 	 (( org.codehaus.jackson.JsonToken ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonToken;->ordinal()I
	 /* const/16 v2, 0xc */
	 /* aput v2, v0, v1 */
	 /* :try_end_b */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_b ..:try_end_b} :catch_4 */
	 /* .line 348 */
} // :goto_b
org.codehaus.jackson.JsonParser$NumberType .values ( );
/* array-length v0, v0 */
/* new-array v0, v0, [I */
try { // :try_start_c
	 v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonParser$NumberType;
	 v1 = org.codehaus.jackson.JsonParser$NumberType.INT;
	 v1 = 	 (( org.codehaus.jackson.JsonParser$NumberType ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonParser$NumberType;->ordinal()I
	 int v2 = 1; // const/4 v2, 0x1
	 /* aput v2, v0, v1 */
	 /* :try_end_c */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_c ..:try_end_c} :catch_3 */
} // :goto_c
try { // :try_start_d
	 v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonParser$NumberType;
	 v1 = org.codehaus.jackson.JsonParser$NumberType.BIG_INTEGER;
	 v1 = 	 (( org.codehaus.jackson.JsonParser$NumberType ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonParser$NumberType;->ordinal()I
	 int v2 = 2; // const/4 v2, 0x2
	 /* aput v2, v0, v1 */
	 /* :try_end_d */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_d ..:try_end_d} :catch_2 */
} // :goto_d
try { // :try_start_e
	 v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonParser$NumberType;
	 v1 = org.codehaus.jackson.JsonParser$NumberType.BIG_DECIMAL;
	 v1 = 	 (( org.codehaus.jackson.JsonParser$NumberType ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonParser$NumberType;->ordinal()I
	 int v2 = 3; // const/4 v2, 0x3
	 /* aput v2, v0, v1 */
	 /* :try_end_e */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_e ..:try_end_e} :catch_1 */
} // :goto_e
try { // :try_start_f
	 v0 = org.codehaus.jackson.impl.JsonGeneratorBase$1.$SwitchMap$org$codehaus$jackson$JsonParser$NumberType;
	 v1 = org.codehaus.jackson.JsonParser$NumberType.FLOAT;
	 v1 = 	 (( org.codehaus.jackson.JsonParser$NumberType ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonParser$NumberType;->ordinal()I
	 int v2 = 4; // const/4 v2, 0x4
	 /* aput v2, v0, v1 */
	 /* :try_end_f */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_f ..:try_end_f} :catch_0 */
} // :goto_f
return;
/* :catch_0 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v0 */
/* :catch_2 */
/* move-exception v0 */
/* :catch_3 */
/* move-exception v0 */
/* .line 328 */
/* :catch_4 */
/* move-exception v0 */
/* :catch_5 */
/* move-exception v0 */
/* :catch_6 */
/* move-exception v0 */
/* :catch_7 */
/* move-exception v0 */
/* :catch_8 */
/* move-exception v0 */
/* :catch_9 */
/* move-exception v0 */
/* goto/16 :goto_6 */
/* :catch_a */
/* move-exception v0 */
/* goto/16 :goto_5 */
/* :catch_b */
/* move-exception v0 */
/* goto/16 :goto_4 */
/* :catch_c */
/* move-exception v0 */
/* goto/16 :goto_3 */
/* :catch_d */
/* move-exception v0 */
/* goto/16 :goto_2 */
/* :catch_e */
/* move-exception v0 */
/* goto/16 :goto_1 */
/* :catch_f */
/* move-exception v0 */
/* goto/16 :goto_0 */
} // .end method
