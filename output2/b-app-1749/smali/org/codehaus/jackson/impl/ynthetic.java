class ynthetic {
	 /* .source "ByteSourceBootstrapper.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/codehaus/jackson/impl/ByteSourceBootstrapper; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1008 */
/* name = null */
} // .end annotation
/* # static fields */
static final $SwitchMap$org$codehaus$jackson$JsonEncoding; //synthetic
/* # direct methods */
static ynthetic ( ) {
/* .locals 3 */
/* .prologue */
/* .line 175 */
org.codehaus.jackson.JsonEncoding .values ( );
/* array-length v0, v0 */
/* new-array v0, v0, [I */
try { // :try_start_0
	 v0 = org.codehaus.jackson.impl.ByteSourceBootstrapper$1.$SwitchMap$org$codehaus$jackson$JsonEncoding;
	 v1 = org.codehaus.jackson.JsonEncoding.UTF32_BE;
	 v1 = 	 (( org.codehaus.jackson.JsonEncoding ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonEncoding;->ordinal()I
	 int v2 = 1; // const/4 v2, 0x1
	 /* aput v2, v0, v1 */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_4 */
} // :goto_0
try { // :try_start_1
	 v0 = org.codehaus.jackson.impl.ByteSourceBootstrapper$1.$SwitchMap$org$codehaus$jackson$JsonEncoding;
	 v1 = org.codehaus.jackson.JsonEncoding.UTF32_LE;
	 v1 = 	 (( org.codehaus.jackson.JsonEncoding ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonEncoding;->ordinal()I
	 int v2 = 2; // const/4 v2, 0x2
	 /* aput v2, v0, v1 */
	 /* :try_end_1 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_3 */
} // :goto_1
try { // :try_start_2
	 v0 = org.codehaus.jackson.impl.ByteSourceBootstrapper$1.$SwitchMap$org$codehaus$jackson$JsonEncoding;
	 v1 = org.codehaus.jackson.JsonEncoding.UTF16_BE;
	 v1 = 	 (( org.codehaus.jackson.JsonEncoding ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonEncoding;->ordinal()I
	 int v2 = 3; // const/4 v2, 0x3
	 /* aput v2, v0, v1 */
	 /* :try_end_2 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_2 */
} // :goto_2
try { // :try_start_3
	 v0 = org.codehaus.jackson.impl.ByteSourceBootstrapper$1.$SwitchMap$org$codehaus$jackson$JsonEncoding;
	 v1 = org.codehaus.jackson.JsonEncoding.UTF16_LE;
	 v1 = 	 (( org.codehaus.jackson.JsonEncoding ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonEncoding;->ordinal()I
	 int v2 = 4; // const/4 v2, 0x4
	 /* aput v2, v0, v1 */
	 /* :try_end_3 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_3 ..:try_end_3} :catch_1 */
} // :goto_3
try { // :try_start_4
	 v0 = org.codehaus.jackson.impl.ByteSourceBootstrapper$1.$SwitchMap$org$codehaus$jackson$JsonEncoding;
	 v1 = org.codehaus.jackson.JsonEncoding.UTF8;
	 v1 = 	 (( org.codehaus.jackson.JsonEncoding ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/codehaus/jackson/JsonEncoding;->ordinal()I
	 int v2 = 5; // const/4 v2, 0x5
	 /* aput v2, v0, v1 */
	 /* :try_end_4 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_4 ..:try_end_4} :catch_0 */
} // :goto_4
return;
/* :catch_0 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v0 */
/* :catch_2 */
/* move-exception v0 */
/* :catch_3 */
/* move-exception v0 */
/* :catch_4 */
/* move-exception v0 */
} // .end method
