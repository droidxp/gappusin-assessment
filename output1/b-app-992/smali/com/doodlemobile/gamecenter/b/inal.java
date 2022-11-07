public class inal {
	 /* # static fields */
	 private static Boolean a;
	 private static java.lang.Long b;
	 private static java.lang.Long c;
	 private static java.lang.Long d;
	 private static java.lang.String e;
	 private static java.lang.String f;
	 private static Long g;
	 private static Long h;
	 private static java.lang.Integer i;
	 private static java.lang.Integer j;
	 private static java.lang.Long k;
	 private static java.lang.Long l;
	 private static java.lang.String m;
	 private static java.lang.String n;
	 private static android.content.Context o;
	 private static Long p;
	 private static Long q;
	 private static Long r;
	 private static Long s;
	 private static Long t;
	 private static java.lang.String u;
	 private static java.lang.String v;
	 private static java.lang.String w;
	 private static java.lang.String x;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 5 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const-wide/16 v3, 0x0 */
		 int v2 = 0; // const/4 v2, 0x0
		 int v0 = 1; // const/4 v0, 0x1
		 com.doodlemobile.gamecenter.b.b.a = (v0!= 0);
		 java.lang.Long .valueOf ( v3,v4 );
		 java.lang.Long .valueOf ( v3,v4 );
		 java.lang.Long .valueOf ( v3,v4 );
		 /* sput-wide v3, Lcom/doodlemobile/gamecenter/b/b;->g:J */
		 /* sput-wide v3, Lcom/doodlemobile/gamecenter/b/b;->h:J */
		 java.lang.Integer .valueOf ( v1 );
		 java.lang.Integer .valueOf ( v1 );
		 java.lang.Long .valueOf ( v3,v4 );
		 /* const-wide/16 v0, -0x1 */
		 java.lang.Long .valueOf ( v0,v1 );
		 final String v0 = "https://s3.amazonaws.com/dm-games/feature1"; // const-string v0, "https://s3.amazonaws.com/dm-games/feature1"
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 10 */
		 int v9 = 1; // const/4 v9, 0x1
		 /* const-wide/16 v7, -0x1 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* const-wide/16 v5, 0x0 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 final String v0 = "gamecenter_settings"; // const-string v0, "gamecenter_settings"
		 (( android.content.Context ) p1 ).getSharedPreferences ( v0, v3 ); // invoke-virtual {p1, v0, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 v1 = 		 final String v1 = "isfirstopen"; // const-string v1, "isfirstopen"
		 com.doodlemobile.gamecenter.b.b.a = (v1!= 0);
		 final String v1 = "feature_timestamp"; // const-string v1, "feature_timestamp"
		 /* move-result-wide v1 */
		 java.lang.Long .valueOf ( v1,v2 );
		 final String v1 = "allgame_timestamp"; // const-string v1, "allgame_timestamp"
		 /* move-result-wide v1 */
		 java.lang.Long .valueOf ( v1,v2 );
		 final String v1 = "headicon_timestamp"; // const-string v1, "headicon_timestamp"
		 /* move-result-wide v1 */
		 java.lang.Long .valueOf ( v1,v2 );
		 final String v1 = "user_id"; // const-string v1, "user_id"
		 final String v1 = "nickname"; // const-string v1, "nickname"
		 final String v1 = "max_score"; // const-string v1, "max_score"
		 /* move-result-wide v1 */
		 /* sput-wide v1, Lcom/doodlemobile/gamecenter/b/b;->g:J */
		 final String v1 = "onlinetime"; // const-string v1, "onlinetime"
		 /* move-result-wide v1 */
		 /* sput-wide v1, Lcom/doodlemobile/gamecenter/b/b;->h:J */
		 v1 = 		 final String v1 = "global_rank"; // const-string v1, "global_rank"
		 java.lang.Integer .valueOf ( v1 );
		 v1 = 		 final String v1 = "beg_rank"; // const-string v1, "beg_rank"
		 java.lang.Integer .valueOf ( v1 );
		 final String v1 = "me_top_score"; // const-string v1, "me_top_score"
		 /* move-result-wide v1 */
		 java.lang.Long .valueOf ( v1,v2 );
		 final String v1 = "me_this_score"; // const-string v1, "me_this_score"
		 /* move-result-wide v1 */
		 java.lang.Long .valueOf ( v1,v2 );
		 final String v1 = "featurefilename"; // const-string v1, "featurefilename"
		 final String v2 = "https://s3.amazonaws.com/dm-games/feature1"; // const-string v2, "https://s3.amazonaws.com/dm-games/feature1"
		 v2 = android.os.Build$VERSION.SDK;
		 /* new-instance v3, Ljava/lang/Integer; */
		 /* invoke-direct {v3, v2}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V */
		 v2 = 		 (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
		 /* const/16 v3, 0xb */
		 /* if-lt v2, v3, :cond_0 */
		 final String v2 = "//"; // const-string v2, "//"
		 (( java.lang.String ) v1 ).split ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v3 = "http://"; // const-string v3, "http://"
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* aget-object v1, v1, v9 */
		 (( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // :cond_0
	 final String v1 = "facebook_id"; // const-string v1, "facebook_id"
	 final String v1 = "gamename"; // const-string v1, "gamename"
	 final String v1 = "companyname"; // const-string v1, "companyname"
	 final String v1 = "imageuri"; // const-string v1, "imageuri"
	 final String v1 = "marketuri"; // const-string v1, "marketuri"
	 final String v1 = "lastpromotedialog"; // const-string v1, "lastpromotedialog"
	 /* move-result-wide v0 */
	 /* sput-wide v0, Lcom/doodlemobile/gamecenter/b/b;->t:J */
	 return;
} // .end method
public static void a ( ) {
	 /* .locals 3 */
	 int v2 = 0; // const/4 v2, 0x0
	 v0 = com.doodlemobile.gamecenter.b.b.o;
	 final String v1 = "gamecenter_settings"; // const-string v1, "gamecenter_settings"
	 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 com.doodlemobile.gamecenter.b.b.a = (v2!= 0);
	 final String v1 = "isfirstopen"; // const-string v1, "isfirstopen"
	 /* sget-boolean v2, Lcom/doodlemobile/gamecenter/b/b;->a:Z */
	 return;
} // .end method
public static void a ( Integer p0 ) {
	 /* .locals 3 */
	 v0 = com.doodlemobile.gamecenter.b.b.o;
	 final String v1 = "gamecenter_settings"; // const-string v1, "gamecenter_settings"
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 java.lang.Integer .valueOf ( p0 );
	 final String v1 = "global_rank"; // const-string v1, "global_rank"
	 v2 = com.doodlemobile.gamecenter.b.b.i;
	 v2 = 	 (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
	 return;
} // .end method
public static void a ( Long p0 ) {
	 /* .locals 4 */
	 v0 = com.doodlemobile.gamecenter.b.b.o;
	 final String v1 = "gamecenter_settings"; // const-string v1, "gamecenter_settings"
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 java.lang.Long .valueOf ( p0,p1 );
	 final String v1 = "headicon_timestamp"; // const-string v1, "headicon_timestamp"
	 v2 = com.doodlemobile.gamecenter.b.b.d;
	 (( java.lang.Long ) v2 ).longValue ( ); // invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
	 /* move-result-wide v2 */
	 return;
} // .end method
public static void a ( java.lang.String p0 ) {
	 /* .locals 3 */
	 v0 = com.doodlemobile.gamecenter.b.b.o;
	 final String v1 = "gamecenter_settings"; // const-string v1, "gamecenter_settings"
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 final String v1 = "user_id"; // const-string v1, "user_id"
	 v2 = com.doodlemobile.gamecenter.b.b.e;
	 return;
} // .end method
public static void b ( Long p0 ) {
	 /* .locals 4 */
	 v0 = com.doodlemobile.gamecenter.b.b.o;
	 final String v1 = "gamecenter_settings"; // const-string v1, "gamecenter_settings"
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 java.lang.Long .valueOf ( p0,p1 );
	 final String v1 = "me_top_score"; // const-string v1, "me_top_score"
	 v2 = com.doodlemobile.gamecenter.b.b.k;
	 (( java.lang.Long ) v2 ).longValue ( ); // invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
	 /* move-result-wide v2 */
	 return;
} // .end method
public static void b ( java.lang.String p0 ) {
	 /* .locals 3 */
	 v0 = com.doodlemobile.gamecenter.b.b.o;
	 final String v1 = "gamecenter_settings"; // const-string v1, "gamecenter_settings"
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 final String v1 = "featurefilename"; // const-string v1, "featurefilename"
	 v2 = com.doodlemobile.gamecenter.b.b.m;
	 return;
} // .end method
public static Boolean b ( ) {
	 /* .locals 1 */
	 /* sget-boolean v0, Lcom/doodlemobile/gamecenter/b/b;->a:Z */
} // .end method
public static Long c ( ) {
	 /* .locals 2 */
	 v0 = com.doodlemobile.gamecenter.b.b.b;
	 (( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
	 /* move-result-wide v0 */
	 /* return-wide v0 */
} // .end method
public static void c ( Long p0 ) {
	 /* .locals 4 */
	 v0 = com.doodlemobile.gamecenter.b.b.o;
	 final String v1 = "gamecenter_settings"; // const-string v1, "gamecenter_settings"
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 java.lang.Long .valueOf ( p0,p1 );
	 final String v1 = "me_this_score"; // const-string v1, "me_this_score"
	 v2 = com.doodlemobile.gamecenter.b.b.l;
	 (( java.lang.Long ) v2 ).longValue ( ); // invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
	 /* move-result-wide v2 */
	 return;
} // .end method
public static void c ( java.lang.String p0 ) {
	 /* .locals 3 */
	 v0 = com.doodlemobile.gamecenter.b.b.o;
	 final String v1 = "gamecenter_settings"; // const-string v1, "gamecenter_settings"
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 final String v1 = "nickname"; // const-string v1, "nickname"
	 v2 = com.doodlemobile.gamecenter.b.b.f;
	 return;
} // .end method
public static Long d ( ) {
	 /* .locals 2 */
	 v0 = com.doodlemobile.gamecenter.b.b.d;
	 (( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
	 /* move-result-wide v0 */
	 /* return-wide v0 */
} // .end method
public static void d ( Long p0 ) {
	 /* .locals 4 */
	 v0 = com.doodlemobile.gamecenter.b.b.o;
	 final String v1 = "gamecenter_settings"; // const-string v1, "gamecenter_settings"
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 /* sput-wide p0, Lcom/doodlemobile/gamecenter/b/b;->p:J */
	 final String v1 = "level"; // const-string v1, "level"
	 /* sget-wide v2, Lcom/doodlemobile/gamecenter/b/b;->p:J */
	 return;
} // .end method
public static synchronized Boolean d ( java.lang.String p0 ) {
	 /* .locals 4 */
	 final String v0 = "facebook_id"; // const-string v0, "facebook_id"
	 /* const-class v0, Lcom/doodlemobile/gamecenter/b/b; */
	 /* monitor-enter v0 */
	 try { // :try_start_0
		 v1 = com.doodlemobile.gamecenter.b.b.o;
		 final String v2 = "gamecenter_settings"; // const-string v2, "gamecenter_settings"
		 int v3 = 0; // const/4 v3, 0x0
		 (( android.content.Context ) v1 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 final String v2 = "null"; // const-string v2, "null"
			 v2 = 			 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 /* if-nez v2, :cond_0 */
			 final String v2 = "facebook_id"; // const-string v2, "facebook_id"
			 v3 = com.doodlemobile.gamecenter.b.b.n;
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 } // :goto_0
		 int v1 = 1; // const/4 v1, 0x1
		 /* monitor-exit v0 */
	 } // :cond_0
	 int v2 = 0; // const/4 v2, 0x0
	 try { // :try_start_1
		 final String v2 = "facebook_id"; // const-string v2, "facebook_id"
		 v3 = com.doodlemobile.gamecenter.b.b.n;
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* :catchall_0 */
		 /* move-exception v1 */
		 /* monitor-exit v0 */
		 /* throw v1 */
	 } // .end method
	 public static Long e ( ) {
		 /* .locals 2 */
		 v0 = com.doodlemobile.gamecenter.b.b.c;
		 (( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
		 /* move-result-wide v0 */
		 /* return-wide v0 */
	 } // .end method
	 public static void e ( Long p0 ) {
		 /* .locals 4 */
		 v0 = com.doodlemobile.gamecenter.b.b.o;
		 final String v1 = "gamecenter_settings"; // const-string v1, "gamecenter_settings"
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 /* sput-wide p0, Lcom/doodlemobile/gamecenter/b/b;->s:J */
		 final String v1 = "xp"; // const-string v1, "xp"
		 /* sget-wide v2, Lcom/doodlemobile/gamecenter/b/b;->s:J */
		 return;
	 } // .end method
	 public static void e ( java.lang.String p0 ) {
		 /* .locals 3 */
		 v0 = com.doodlemobile.gamecenter.b.b.o;
		 final String v1 = "gamecenter_settings"; // const-string v1, "gamecenter_settings"
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 final String v1 = "gamename"; // const-string v1, "gamename"
		 v2 = com.doodlemobile.gamecenter.b.b.u;
		 return;
	 } // .end method
	 public static java.lang.String f ( ) {
		 /* .locals 1 */
		 v0 = com.doodlemobile.gamecenter.b.b.e;
	 } // .end method
	 public static void f ( Long p0 ) {
		 /* .locals 3 */
		 v0 = com.doodlemobile.gamecenter.b.b.o;
		 final String v1 = "gamecenter_settings"; // const-string v1, "gamecenter_settings"
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 /* sput-wide p0, Lcom/doodlemobile/gamecenter/b/b;->q:J */
		 final String v1 = "total_xp"; // const-string v1, "total_xp"
		 return;
	 } // .end method
	 public static void f ( java.lang.String p0 ) {
		 /* .locals 3 */
		 v0 = com.doodlemobile.gamecenter.b.b.o;
		 final String v1 = "gamecenter_settings"; // const-string v1, "gamecenter_settings"
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 final String v1 = "companyname"; // const-string v1, "companyname"
		 v2 = com.doodlemobile.gamecenter.b.b.v;
		 return;
	 } // .end method
	 public static java.lang.String g ( ) {
		 /* .locals 1 */
		 v0 = com.doodlemobile.gamecenter.b.b.f;
	 } // .end method
	 public static void g ( Long p0 ) {
		 /* .locals 3 */
		 v0 = com.doodlemobile.gamecenter.b.b.o;
		 final String v1 = "gamecenter_settings"; // const-string v1, "gamecenter_settings"
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 /* sput-wide p0, Lcom/doodlemobile/gamecenter/b/b;->r:J */
		 final String v1 = "next_xp"; // const-string v1, "next_xp"
		 return;
	 } // .end method
	 public static void g ( java.lang.String p0 ) {
		 /* .locals 3 */
		 v0 = com.doodlemobile.gamecenter.b.b.o;
		 final String v1 = "gamecenter_settings"; // const-string v1, "gamecenter_settings"
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 final String v1 = "imageuri"; // const-string v1, "imageuri"
		 v2 = com.doodlemobile.gamecenter.b.b.w;
		 return;
	 } // .end method
	 public static Integer h ( ) {
		 /* .locals 1 */
		 v0 = com.doodlemobile.gamecenter.b.b.i;
		 v0 = 		 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
	 } // .end method
	 public static void h ( java.lang.String p0 ) {
		 /* .locals 3 */
		 v0 = com.doodlemobile.gamecenter.b.b.o;
		 final String v1 = "gamecenter_settings"; // const-string v1, "gamecenter_settings"
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 final String v1 = "marketuri"; // const-string v1, "marketuri"
		 v2 = com.doodlemobile.gamecenter.b.b.x;
		 return;
	 } // .end method
	 public static Boolean h ( Long p0 ) {
		 /* .locals 6 */
		 int v5 = 1; // const/4 v5, 0x1
		 int v4 = 0; // const/4 v4, 0x0
		 v0 = com.doodlemobile.gamecenter.b.b.o;
		 (( android.content.Context ) v0 ).getApplicationContext ( ); // invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
		 final String v1 = "connectivity"; // const-string v1, "connectivity"
		 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/net/ConnectivityManager; */
		 (( android.net.ConnectivityManager ) v0 ).getActiveNetworkInfo ( ); // invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
		 /* if-nez v0, :cond_1 */
		 /* move v0, v4 */
	 } // :goto_0
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* sget-wide v0, Lcom/doodlemobile/gamecenter/b/b;->t:J */
		 /* sub-long v0, p0, v0 */
		 /* const-wide/32 v2, 0x5265c00 */
		 /* cmp-long v0, v0, v2 */
		 /* if-gtz v0, :cond_0 */
		 /* sget-wide v0, Lcom/doodlemobile/gamecenter/b/b;->t:J */
		 /* cmp-long v0, p0, v0 */
		 /* if-gez v0, :cond_2 */
	 } // :cond_0
	 v0 = com.doodlemobile.gamecenter.b.b.o;
	 final String v1 = "gamecenter_settings"; // const-string v1, "gamecenter_settings"
	 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v4 ); // invoke-virtual {v0, v1, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 /* sput-wide p0, Lcom/doodlemobile/gamecenter/b/b;->t:J */
	 final String v1 = "lastpromotedialog"; // const-string v1, "lastpromotedialog"
	 /* sget-wide v2, Lcom/doodlemobile/gamecenter/b/b;->t:J */
	 /* move v0, v5 */
} // :goto_1
} // :cond_1
/* move v0, v5 */
} // :cond_2
/* move v0, v4 */
} // .end method
public static Long i ( ) {
/* .locals 2 */
v0 = com.doodlemobile.gamecenter.b.b.k;
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public static Long j ( ) {
/* .locals 2 */
v0 = com.doodlemobile.gamecenter.b.b.l;
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public static synchronized java.lang.String k ( ) {
/* .locals 2 */
/* const-class v0, Lcom/doodlemobile/gamecenter/b/b; */
/* monitor-enter v0 */
try { // :try_start_0
v1 = com.doodlemobile.gamecenter.b.b.n;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* throw v1 */
} // .end method
public static Long l ( ) {
/* .locals 2 */
/* sget-wide v0, Lcom/doodlemobile/gamecenter/b/b;->p:J */
/* return-wide v0 */
} // .end method
public static Long m ( ) {
/* .locals 2 */
/* sget-wide v0, Lcom/doodlemobile/gamecenter/b/b;->s:J */
/* return-wide v0 */
} // .end method
public static Long n ( ) {
/* .locals 2 */
/* sget-wide v0, Lcom/doodlemobile/gamecenter/b/b;->r:J */
/* return-wide v0 */
} // .end method
public static java.lang.String o ( ) {
/* .locals 1 */
v0 = com.doodlemobile.gamecenter.b.b.u;
} // .end method
public static java.lang.String p ( ) {
/* .locals 1 */
v0 = com.doodlemobile.gamecenter.b.b.w;
} // .end method
public static java.lang.String q ( ) {
/* .locals 1 */
v0 = com.doodlemobile.gamecenter.b.b.x;
} // .end method
