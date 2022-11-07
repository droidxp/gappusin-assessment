public class com.zong.android.engine.task.PricePointTask {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/zong/android/engine/task/PricePointTask$a; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String a;
/* # direct methods */
static com.zong.android.engine.task.PricePointTask ( ) {
	 /* .locals 1 */
	 /* const-class v0, Lcom/zong/android/engine/task/PricePointTask; */
	 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
	 return;
} // .end method
 com.zong.android.engine.task.PricePointTask ( ) { //synthethic
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, v0}, Lcom/zong/android/engine/task/PricePointTask;-><init>(B)V */
	 return;
} // .end method
private com.zong.android.engine.task.PricePointTask ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
private static com.zong.android.engine.xml.pojo.lookup.ZongPricePoint a ( java.lang.String p0 ) {
	 /* .locals 5 */
	 int v1 = 0; // const/4 v1, 0x0
	 try { // :try_start_0
		 zongfuscated.g .a ( p0 );
		 /* new-instance v2, Ljava/io/ByteArrayInputStream; */
		 /* invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
		 /* new-instance v3, Ljava/io/ObjectInputStream; */
		 /* invoke-direct {v3, v2}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V */
		 (( java.io.ObjectInputStream ) v3 ).readObject ( ); // invoke-virtual {v3}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
		 /* check-cast v0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint; */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 try { // :try_start_1
			 (( java.io.ObjectInputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/ObjectInputStream;->close()V
			 /* :try_end_1 */
			 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* move-object v4, v0 */
		 /* move-object v0, v1 */
		 /* move-object v1, v4 */
	 } // :goto_1
	 v2 = com.zong.android.engine.task.PricePointTask.a;
	 final String v3 = "Failed extractFromBlob"; // const-string v3, "Failed extractFromBlob"
	 zongfuscated.q .a ( v2,v3,v1 );
	 /* :catch_1 */
	 /* move-exception v1 */
} // .end method
private static java.lang.String a ( com.zong.android.engine.xml.pojo.lookup.ZongPricePoint p0 ) {
	 /* .locals 4 */
	 int v1 = 0; // const/4 v1, 0x0
	 try { // :try_start_0
		 /* new-instance v2, Ljava/io/ByteArrayOutputStream; */
		 /* invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V */
		 /* new-instance v0, Ljava/io/ObjectOutputStream; */
		 /* invoke-direct {v0, v2}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V */
		 (( java.io.ObjectOutputStream ) v0 ).writeObject ( p0 ); // invoke-virtual {v0, p0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
		 (( java.io.ObjectOutputStream ) v0 ).flush ( ); // invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->flush()V
		 (( java.io.ObjectOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->close()V
		 /* new-instance v0, Ljava/lang/String; */
		 (( java.io.ByteArrayOutputStream ) v2 ).toByteArray ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
		 zongfuscated.g .a ( v2 );
		 /* invoke-direct {v0, v2}, Ljava/lang/String;-><init>([C)V */
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 } // :goto_0
	 /* :catch_0 */
	 /* move-exception v0 */
	 v2 = com.zong.android.engine.task.PricePointTask.a;
	 final String v3 = "Failed makeBlob"; // const-string v3, "Failed makeBlob"
	 zongfuscated.q .a ( v2,v3,v0 );
	 /* move-object v0, v1 */
} // .end method
public static com.zong.android.engine.task.PricePointTask getInstance ( ) {
	 /* .locals 1 */
	 com.zong.android.engine.task.PricePointTask$a .a ( );
} // .end method
/* # virtual methods */
public void flushCache ( android.content.Context p0 ) {
	 /* .locals 2 */
	 final String v0 = "PricePointsCache"; // const-string v0, "PricePointsCache"
	 int v1 = 0; // const/4 v1, 0x0
	 (( android.content.Context ) p1 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 if ( v0 != null) { // if-eqz v0, :cond_0
	 } // :cond_0
	 return;
} // .end method
public com.zong.android.engine.xml.pojo.lookup.ZongPricePoint getPricePoints ( android.content.Context p0, Boolean p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5 ) {
	 /* .locals 15 */
	 int v4 = 0; // const/4 v4, 0x0
	 if ( p2 != null) { // if-eqz p2, :cond_4
		 v5 = com.zong.android.engine.task.PricePointTask.a;
		 final String v6 = "Enable PricePoints CACHE"; // const-string v6, "Enable PricePoints CACHE"
		 zongfuscated.q .a ( v5,v6 );
		 final String v5 = "PricePointsCache"; // const-string v5, "PricePointsCache"
		 int v6 = 0; // const/4 v6, 0x0
		 /* move-object/from16 v0, p1 */
		 (( android.content.Context ) v0 ).getSharedPreferences ( v5, v6 ); // invoke-virtual {v0, v5, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 if ( v5 != null) { // if-eqz v5, :cond_0
			 final String v6 = "time"; // const-string v6, "time"
			 /* const-wide/16 v7, 0x0 */
			 /* move-result-wide v6 */
			 java.lang.Long .valueOf ( v6,v7 );
			 java.lang.System .currentTimeMillis ( );
			 /* move-result-wide v7 */
			 (( java.lang.Long ) v6 ).longValue ( ); // invoke-virtual {v6}, Ljava/lang/Long;->longValue()J
			 /* move-result-wide v9 */
			 /* sub-long v6, v7, v9 */
			 /* const-wide/32 v8, 0x1499700 */
			 /* cmp-long v6, v6, v8 */
			 /* if-gez v6, :cond_3 */
			 final String v6 = "country"; // const-string v6, "country"
			 int v7 = 0; // const/4 v7, 0x0
			 final String v7 = "currencyCode"; // const-string v7, "currencyCode"
			 int v8 = 0; // const/4 v8, 0x0
			 final String v8 = "clientRef"; // const-string v8, "clientRef"
			 int v9 = 0; // const/4 v9, 0x0
			 /* move-object/from16 v0, p5 */
			 v6 = 			 (( java.lang.String ) v6 ).equalsIgnoreCase ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
			 if ( v6 != null) { // if-eqz v6, :cond_2
				 /* move-object/from16 v0, p6 */
				 v6 = 				 (( java.lang.String ) v7 ).equalsIgnoreCase ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
				 if ( v6 != null) { // if-eqz v6, :cond_2
					 /* move-object/from16 v0, p4 */
					 v6 = 					 (( java.lang.String ) v8 ).equalsIgnoreCase ( v0 ); // invoke-virtual {v8, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
					 if ( v6 != null) { // if-eqz v6, :cond_2
						 v4 = com.zong.android.engine.task.PricePointTask.a;
						 final String v6 = "Using PricePoints CACHE"; // const-string v6, "Using PricePoints CACHE"
						 zongfuscated.q .a ( v4,v6 );
						 final String v4 = "pricePoints"; // const-string v4, "pricePoints"
						 int v6 = 0; // const/4 v6, 0x0
						 com.zong.android.engine.task.PricePointTask .a ( v4 );
					 } // :cond_0
				 } // :goto_0
				 /* if-nez v4, :cond_1 */
				 int v5 = 0; // const/4 v5, 0x0
				 /* new-instance v7, Lzongfuscated/y; */
				 /* move-object/from16 v0, p3 */
				 /* move-object/from16 v1, p4 */
				 /* move-object/from16 v2, p5 */
				 /* move-object/from16 v3, p6 */
				 /* invoke-direct {v7, v0, v1, v2, v3}, Lzongfuscated/y;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
			 } // :goto_1
			 /* if-nez v4, :cond_1 */
			 int v6 = 3; // const/4 v6, 0x3
			 /* if-lt v5, v6, :cond_5 */
		 } // :cond_1
	 } // :cond_2
	 v5 = com.zong.android.engine.task.PricePointTask.a;
	 final String v6 = "Owner change:: Flushing PricePoints CACHE"; // const-string v6, "Owner change:: Flushing PricePoints CACHE"
	 zongfuscated.q .a ( v5,v6 );
} // :cond_3
v5 = com.zong.android.engine.task.PricePointTask.a;
final String v6 = "Time-to-Live expired:: Flushing PricePoints CACHE"; // const-string v6, "Time-to-Live expired:: Flushing PricePoints CACHE"
zongfuscated.q .a ( v5,v6 );
} // :cond_4
v5 = com.zong.android.engine.task.PricePointTask.a;
final String v6 = "Disable PricePoints CACHE"; // const-string v6, "Disable PricePoints CACHE"
zongfuscated.q .a ( v5,v6 );
} // :cond_5
/* add-int/lit8 v5, v5, 0x1 */
(( zongfuscated.y ) v7 ).a ( ); // invoke-virtual {v7}, Lzongfuscated/y;->a()Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;
if ( v6 != null) { // if-eqz v6, :cond_7
v4 = com.zong.android.engine.task.PricePointTask.a;
final String v8 = "Ctry"; // const-string v8, "Ctry"
int v9 = 1; // const/4 v9, 0x1
/* new-array v9, v9, [Ljava/lang/String; */
int v10 = 0; // const/4 v10, 0x0
(( com.zong.android.engine.xml.pojo.lookup.ZongPricePoint ) v6 ).getCountryCode ( ); // invoke-virtual {v6}, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;->getCountryCode()Ljava/lang/String;
/* aput-object v11, v9, v10 */
zongfuscated.q .a ( v4,v8,v9 );
v4 = com.zong.android.engine.task.PricePointTask.a;
final String v8 = "Cur"; // const-string v8, "Cur"
int v9 = 1; // const/4 v9, 0x1
/* new-array v9, v9, [Ljava/lang/String; */
int v10 = 0; // const/4 v10, 0x0
(( com.zong.android.engine.xml.pojo.lookup.ZongPricePoint ) v6 ).getLocalCurrency ( ); // invoke-virtual {v6}, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;->getLocalCurrency()Ljava/lang/String;
/* aput-object v11, v9, v10 */
zongfuscated.q .a ( v4,v8,v9 );
(( com.zong.android.engine.xml.pojo.lookup.ZongPricePoint ) v6 ).getProviders ( ); // invoke-virtual {v6}, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;->getProviders()Ljava/util/HashMap;
(( java.util.HashMap ) v4 ).keySet ( ); // invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
v4 = } // :goto_2
/* if-nez v4, :cond_8 */
(( com.zong.android.engine.xml.pojo.lookup.ZongPricePoint ) v6 ).getItems ( ); // invoke-virtual {v6}, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;->getItems()Ljava/util/ArrayList;
(( java.util.ArrayList ) v4 ).iterator ( ); // invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v4 = } // :cond_6
/* if-nez v4, :cond_9 */
if ( p2 != null) { // if-eqz p2, :cond_7
v4 = com.zong.android.engine.task.PricePointTask.a;
final String v8 = "Created PricePoints CACHE"; // const-string v8, "Created PricePoints CACHE"
zongfuscated.q .a ( v4,v8 );
/* invoke-virtual/range {p0 ..p1}, Lcom/zong/android/engine/task/PricePointTask;->flushCache(Landroid/content/Context;)V */
final String v4 = "PricePointsCache"; // const-string v4, "PricePointsCache"
int v8 = 0; // const/4 v8, 0x0
/* move-object/from16 v0, p1 */
(( android.content.Context ) v0 ).getSharedPreferences ( v4, v8 ); // invoke-virtual {v0, v4, v8}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
final String v8 = "time"; // const-string v8, "time"
java.lang.System .currentTimeMillis ( );
/* move-result-wide v9 */
final String v8 = "clientRef"; // const-string v8, "clientRef"
/* move-object/from16 v0, p4 */
final String v8 = "country"; // const-string v8, "country"
/* move-object/from16 v0, p5 */
final String v8 = "currencyCode"; // const-string v8, "currencyCode"
/* move-object/from16 v0, p6 */
final String v8 = "pricePoints"; // const-string v8, "pricePoints"
com.zong.android.engine.task.PricePointTask .a ( v6 );
} // :cond_7
/* move-object v4, v6 */
/* goto/16 :goto_1 */
} // :cond_8
/* check-cast v4, Ljava/lang/String; */
v9 = com.zong.android.engine.task.PricePointTask.a;
final String v10 = "Root Prov Key"; // const-string v10, "Root Prov Key"
int v11 = 2; // const/4 v11, 0x2
/* new-array v11, v11, [Ljava/lang/String; */
int v12 = 0; // const/4 v12, 0x0
/* aput-object v4, v11, v12 */
int v12 = 1; // const/4 v12, 0x1
(( com.zong.android.engine.xml.pojo.lookup.ZongPricePoint ) v6 ).getProviders ( ); // invoke-virtual {v6}, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;->getProviders()Ljava/util/HashMap;
(( java.util.HashMap ) v13 ).get ( v4 ); // invoke-virtual {v13, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v4, Ljava/lang/String; */
/* aput-object v4, v11, v12 */
zongfuscated.q .a ( v9,v10,v11 );
} // :cond_9
/* check-cast v4, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem; */
v9 = com.zong.android.engine.task.PricePointTask.a;
final String v10 = "Ref"; // const-string v10, "Ref"
int v11 = 1; // const/4 v11, 0x1
/* new-array v11, v11, [Ljava/lang/String; */
int v12 = 0; // const/4 v12, 0x0
(( com.zong.android.engine.xml.pojo.lookup.ZongPricePointItem ) v4 ).getItemRef ( ); // invoke-virtual {v4}, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->getItemRef()Ljava/lang/String;
/* aput-object v13, v11, v12 */
zongfuscated.q .a ( v9,v10,v11 );
v9 = com.zong.android.engine.task.PricePointTask.a;
final String v10 = "URL"; // const-string v10, "URL"
int v11 = 1; // const/4 v11, 0x1
/* new-array v11, v11, [Ljava/lang/String; */
int v12 = 0; // const/4 v12, 0x0
(( com.zong.android.engine.xml.pojo.lookup.ZongPricePointItem ) v4 ).getEntrypointUrl ( ); // invoke-virtual {v4}, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->getEntrypointUrl()Ljava/lang/String;
/* aput-object v13, v11, v12 */
zongfuscated.q .a ( v9,v10,v11 );
(( com.zong.android.engine.xml.pojo.lookup.ZongPricePointItem ) v4 ).getProviders ( ); // invoke-virtual {v4}, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->getProviders()Ljava/util/HashMap;
if ( v9 != null) { // if-eqz v9, :cond_6
(( com.zong.android.engine.xml.pojo.lookup.ZongPricePointItem ) v4 ).getProviders ( ); // invoke-virtual {v4}, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->getProviders()Ljava/util/HashMap;
(( java.util.HashMap ) v4 ).keySet ( ); // invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
v4 = } // :goto_3
if ( v4 != null) { // if-eqz v4, :cond_6
/* check-cast v4, Ljava/lang/String; */
v10 = com.zong.android.engine.task.PricePointTask.a;
final String v11 = "Item Key"; // const-string v11, "Item Key"
int v12 = 2; // const/4 v12, 0x2
/* new-array v12, v12, [Ljava/lang/String; */
int v13 = 0; // const/4 v13, 0x0
/* aput-object v4, v12, v13 */
int v13 = 1; // const/4 v13, 0x1
(( com.zong.android.engine.xml.pojo.lookup.ZongPricePoint ) v6 ).getProviders ( ); // invoke-virtual {v6}, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;->getProviders()Ljava/util/HashMap;
(( java.util.HashMap ) v14 ).get ( v4 ); // invoke-virtual {v14, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v4, Ljava/lang/String; */
/* aput-object v4, v12, v13 */
zongfuscated.q .a ( v10,v11,v12 );
} // .end method
