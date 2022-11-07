public class com.a.f.w {
	 /* # static fields */
	 public static java.lang.String a;
	 private static java.lang.String b;
	 private static Boolean c;
	 private static com.calmei.jmsn.PlaneFightActivity d;
	 /* # direct methods */
	 static com.a.f.w ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 int v0 = 0; // const/4 v0, 0x0
		 com.a.f.w.c = (v0!= 0);
		 return;
	 } // .end method
	 public com.a.f.w ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String a ( ) {
		 /* .locals 4 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
		 /* new-instance v1, Lcom/a/f/g; */
		 v2 = com.a.f.w.d;
		 /* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
		 /* new-instance v1, Lcom/a/f/a; */
		 /* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
		 (( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
		 (( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
		 final String v2 = "type"; // const-string v2, "type"
		 final String v3 = "payapp"; // const-string v3, "payapp"
		 (( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
		 final String v2 = "sn"; // const-string v2, "sn"
		 com.a.f.g .k ( );
		 (( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
		 (( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
		 (( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
		 (( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
		 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 } // .end method
	 public static java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 5 */
		 /* new-instance v0, Lcom/a/f/g; */
		 v1 = com.a.f.w.d;
		 /* invoke-direct {v0, v1}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
		 /* new-instance v1, Lcom/a/f/a; */
		 /* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
		 /* new-instance v2, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
		 (( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
		 (( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
		 final String v3 = "type"; // const-string v3, "type"
		 final String v4 = "uerlayer"; // const-string v4, "uerlayer"
		 (( com.a.f.a ) v1 ).a ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
		 final String v3 = "linktype"; // const-string v3, "linktype"
		 (( com.a.f.a ) v1 ).a ( v3, p0 ); // invoke-virtual {v1, v3, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
		 final String v3 = "gametype"; // const-string v3, "gametype"
		 (( com.a.f.g ) v0 ).q ( ); // invoke-virtual {v0}, Lcom/a/f/g;->q()Ljava/lang/String;
		 (( com.a.f.a ) v1 ).a ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
		 final String v3 = "customsn"; // const-string v3, "customsn"
		 com.a.f.g .b ( );
		 (( com.a.f.a ) v1 ).a ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
		 final String v3 = "imei"; // const-string v3, "imei"
		 (( com.a.f.g ) v0 ).m ( ); // invoke-virtual {v0}, Lcom/a/f/g;->m()Ljava/lang/String;
		 (( com.a.f.a ) v1 ).a ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
		 final String v3 = "imsi"; // const-string v3, "imsi"
		 (( com.a.f.g ) v0 ).l ( ); // invoke-virtual {v0}, Lcom/a/f/g;->l()Ljava/lang/String;
		 (( com.a.f.a ) v1 ).a ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
		 final String v3 = "producesn"; // const-string v3, "producesn"
		 (( com.a.f.g ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/a/f/g;->n()Ljava/lang/String;
		 (( com.a.f.a ) v1 ).a ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
		 final String v3 = "channelsn"; // const-string v3, "channelsn"
		 (( com.a.f.g ) v0 ).o ( ); // invoke-virtual {v0}, Lcom/a/f/g;->o()Ljava/lang/String;
		 (( com.a.f.a ) v1 ).a ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
		 final String v3 = "installpath"; // const-string v3, "installpath"
		 (( com.a.f.g ) v0 ).r ( ); // invoke-virtual {v0}, Lcom/a/f/g;->r()Ljava/lang/String;
		 (( com.a.f.a ) v1 ).a ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
		 final String v3 = "versioninf"; // const-string v3, "versioninf"
		 (( com.a.f.g ) v0 ).p ( ); // invoke-virtual {v0}, Lcom/a/f/g;->p()Ljava/lang/String;
		 (( com.a.f.a ) v1 ).a ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
		 final String v3 = "appsecretkey"; // const-string v3, "appsecretkey"
		 (( com.a.f.g ) v0 ).s ( ); // invoke-virtual {v0}, Lcom/a/f/g;->s()Ljava/lang/String;
		 (( com.a.f.a ) v1 ).a ( v3, v0 ); // invoke-virtual {v1, v3, v0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
		 (( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
		 (( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
		 (( java.lang.String ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
		 (( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 final String v2 = "(#)!@&$^*%"; // const-string v2, "(#)!@&$^*%"
		 com.a.f.c .a ( v0,v2 );
		 (( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
	 } // .end method
	 public static java.lang.String a ( java.lang.String p0, Integer p1 ) {
		 /* .locals 4 */
		 int v1 = 1; // const/4 v1, 0x1
		 final String v2 = "record_gamefile.txt"; // const-string v2, "record_gamefile.txt"
		 /* new-instance v3, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* packed-switch p1, :pswitch_data_0 */
		 final String p0 = "---------erro-------"; // const-string p0, "---------erro-------"
	 } // :goto_0
	 (( java.lang.StringBuffer ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 com.a.f.w .a ( );
		 (( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 com.a.f.w .b ( );
		 (( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 } // :cond_0
	 (( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 final String v3 = "(#)!@&$^*%"; // const-string v3, "(#)!@&$^*%"
	 com.a.f.c .a ( v0,v3 );
	 com.a.f.n .a ( );
	 (( com.a.f.n ) v3 ).a ( v0, v2, v1 ); // invoke-virtual {v3, v0, v2, v1}, Lcom/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;Z)V
	 /* :pswitch_0 */
	 /* move v0, v1 */
	 /* :pswitch_1 */
	 com.a.f.w .b ( p0 );
	 /* :pswitch_2 */
	 com.a.f.w .c ( p0 );
	 /* :pswitch_3 */
	 com.a.f.w .d ( p0 );
	 /* :pswitch_4 */
	 com.a.f.w .e ( p0 );
	 /* :pswitch_5 */
	 com.a.f.w .f ( p0 );
	 /* :pswitch_6 */
	 com.a.f.w .g ( p0 );
	 /* :pswitch_7 */
	 com.a.f.w .h ( p0 );
	 /* :pswitch_8 */
	 com.a.f.w .i ( p0 );
	 /* :pswitch_9 */
	 com.a.f.w .j ( p0 );
	 /* :pswitch_a */
	 com.a.f.w .k ( p0 );
	 /* :pswitch_b */
	 com.a.f.w .m ( p0 );
	 /* :pswitch_c */
	 com.a.f.w .n ( p0 );
	 /* :pswitch_d */
	 com.a.f.w .o ( p0 );
	 /* :pswitch_e */
	 com.a.f.w .p ( p0 );
	 /* :pswitch_f */
	 com.a.f.w .s ( p0 );
	 /* :pswitch_10 */
	 com.a.f.w .l ( p0 );
	 /* :pswitch_11 */
	 com.a.f.w .q ( p0 );
	 /* :pswitch_12 */
	 com.a.f.w .r ( p0 );
	 /* nop */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x0 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
	 /* :pswitch_2 */
	 /* :pswitch_3 */
	 /* :pswitch_4 */
	 /* :pswitch_5 */
	 /* :pswitch_6 */
	 /* :pswitch_7 */
	 /* :pswitch_8 */
	 /* :pswitch_9 */
	 /* :pswitch_a */
	 /* :pswitch_b */
	 /* :pswitch_c */
	 /* :pswitch_d */
	 /* :pswitch_e */
	 /* :pswitch_10 */
	 /* :pswitch_11 */
	 /* :pswitch_12 */
	 /* :pswitch_f */
} // .end packed-switch
} // .end method
public static void a ( com.calmei.jmsn.PlaneFightActivity p0 ) {
/* .locals 1 */
com.a.f.n .a ( );
v0 = com.a.f.w.d;
com.a.f.n .a ( v0 );
return;
} // .end method
public static java.lang.String b ( ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
final String v2 = "type"; // const-string v2, "type"
final String v3 = "appstandard"; // const-string v3, "appstandard"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "sn"; // const-string v2, "sn"
com.a.f.g .h ( );
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String b ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
final String v2 = "type"; // const-string v2, "type"
final String v3 = "feeuienter"; // const-string v3, "feeuienter"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "enterfeeui"; // const-string v2, "enterfeeui"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String c ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
final String v2 = "type"; // const-string v2, "type"
final String v3 = "feesuccessed"; // const-string v3, "feesuccessed"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "feesucceed"; // const-string v2, "feesucceed"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static void c ( ) {
/* .locals 3 */
com.a.f.n .a ( );
final String v1 = "record_service.txt"; // const-string v1, "record_service.txt"
(( com.a.f.n ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/f/n;->b(Ljava/lang/String;)Ljava/lang/String;
final String v1 = "(#)!@&$^*%"; // const-string v1, "(#)!@&$^*%"
com.a.f.c .a ( v0,v1 );
/* new-instance v1, Lcom/a/f/e; */
/* invoke-direct {v1}, Lcom/a/f/e;-><init>()V */
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
try { // :try_start_0
/* new-instance v2, Lorg/json/JSONObject; */
/* invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
(( com.a.f.e ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/a/f/e;->a(Lorg/json/JSONObject;)Z
/* :try_end_0 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public static java.lang.String d ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
com.a.f.g .f ( p0 );
final String v2 = "type"; // const-string v2, "type"
final String v3 = "gamelevel"; // const-string v3, "gamelevel"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "level"; // const-string v2, "level"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String e ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
com.a.f.g .f ( p0 );
final String v2 = "type"; // const-string v2, "type"
final String v3 = "gamegunone"; // const-string v3, "gamegunone"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "buy"; // const-string v2, "buy"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static void e ( ) {
/* .locals 1 */
v0 = com.a.f.w.b;
(( java.lang.String ) v0 ).getBytes ( ); // invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
com.a.f.j .a ( v0 );
com.a.f.j .d ( );
return;
} // .end method
public static java.lang.String f ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
com.a.f.g .f ( p0 );
final String v2 = "type"; // const-string v2, "type"
final String v3 = "gameguntwo"; // const-string v3, "gameguntwo"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "buy"; // const-string v2, "buy"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String g ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
com.a.f.g .f ( p0 );
final String v2 = "type"; // const-string v2, "type"
final String v3 = "gamegunthree"; // const-string v3, "gamegunthree"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "buy"; // const-string v2, "buy"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String h ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
com.a.f.g .f ( p0 );
final String v2 = "type"; // const-string v2, "type"
final String v3 = "gamegunfour"; // const-string v3, "gamegunfour"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "buy"; // const-string v2, "buy"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String i ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
com.a.f.g .f ( p0 );
final String v2 = "type"; // const-string v2, "type"
final String v3 = "gamegunfive"; // const-string v3, "gamegunfive"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "buy"; // const-string v2, "buy"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String j ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
com.a.f.g .f ( p0 );
final String v2 = "type"; // const-string v2, "type"
final String v3 = "gamesix"; // const-string v3, "gamesix"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "buy"; // const-string v2, "buy"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String k ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
com.a.f.g .f ( p0 );
final String v2 = "type"; // const-string v2, "type"
final String v3 = "moneybuyed"; // const-string v3, "moneybuyed"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "buy"; // const-string v2, "buy"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String l ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
com.a.f.g .f ( p0 );
final String v2 = "type"; // const-string v2, "type"
final String v3 = "moneyused"; // const-string v3, "moneyused"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "use"; // const-string v2, "use"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String m ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
com.a.f.g .f ( p0 );
final String v2 = "type"; // const-string v2, "type"
final String v3 = "gameskillone"; // const-string v3, "gameskillone"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "up"; // const-string v2, "up"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String n ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
com.a.f.g .f ( p0 );
final String v2 = "type"; // const-string v2, "type"
final String v3 = "gameskilltwo"; // const-string v3, "gameskilltwo"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "up"; // const-string v2, "up"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String o ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
com.a.f.g .f ( p0 );
final String v2 = "type"; // const-string v2, "type"
final String v3 = "gameskillthree"; // const-string v3, "gameskillthree"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "up"; // const-string v2, "up"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String p ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
com.a.f.g .f ( p0 );
final String v2 = "type"; // const-string v2, "type"
final String v3 = "gameskillfour"; // const-string v3, "gameskillfour"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "up"; // const-string v2, "up"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String q ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
com.a.f.g .f ( p0 );
final String v2 = "type"; // const-string v2, "type"
final String v3 = "levelplay"; // const-string v3, "levelplay"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "level"; // const-string v2, "level"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String r ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
com.a.f.g .f ( p0 );
final String v2 = "type"; // const-string v2, "type"
final String v3 = "moneyplay"; // const-string v3, "moneyplay"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "count"; // const-string v2, "count"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String s ( java.lang.String p0 ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* new-instance v1, Lcom/a/f/g; */
v2 = com.a.f.w.d;
/* invoke-direct {v1, v2}, Lcom/a/f/g;-><init>(Landroid/app/Activity;)V */
/* new-instance v1, Lcom/a/f/a; */
/* invoke-direct {v1}, Lcom/a/f/a;-><init>()V */
(( com.a.f.a ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/a;->a()V
(( com.a.f.a ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/a/f/a;->b()V
com.a.f.g .f ( p0 );
final String v2 = "type"; // const-string v2, "type"
final String v3 = "moneyused"; // const-string v3, "moneyused"
(( com.a.f.a ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
final String v2 = "count"; // const-string v2, "count"
(( com.a.f.a ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lcom/a/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
(( com.a.f.a ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/a/f/a;->c()V
(( com.a.f.a ) v1 ).e ( ); // invoke-virtual {v1}, Lcom/a/f/a;->e()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( com.a.f.a ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/a/f/a;->d()V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
/* # virtual methods */
public void d ( ) {
/* .locals 1 */
v0 = com.a.f.w.d;
com.a.f.o .a ( v0 );
return;
} // .end method
public void t ( java.lang.String p0 ) {
/* .locals 6 */
final String v0 = "record_myfee.txt"; // const-string v0, "record_myfee.txt"
final String v1 = "record_gamefile.txt"; // const-string v1, "record_gamefile.txt"
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
com.a.f.n .a ( );
v3 = com.a.f.w.d;
com.a.f.n .a ( v3 );
com.a.f.w .c ( );
com.a.f.w .a ( p1 );
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
com.a.f.n .a ( );
v3 = (( com.a.f.n ) v3 ).a ( v1 ); // invoke-virtual {v3, v1}, Lcom/a/f/n;->a(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
com.a.f.n .a ( );
(( com.a.f.n ) v3 ).b ( v1 ); // invoke-virtual {v3, v1}, Lcom/a/f/n;->b(Ljava/lang/String;)Ljava/lang/String;
com.a.f.n .a ( );
int v5 = 1; // const/4 v5, 0x1
(( com.a.f.n ) v4 ).a ( v3, v0, v5 ); // invoke-virtual {v4, v3, v0, v5}, Lcom/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;Z)V
com.a.f.n .a ( );
(( com.a.f.n ) v3 ).c ( v1 ); // invoke-virtual {v3, v1}, Lcom/a/f/n;->c(Ljava/lang/String;)V
} // :cond_0
com.a.f.n .a ( );
(( com.a.f.n ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Lcom/a/f/n;->b(Ljava/lang/String;)Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_1
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_1
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
v0 = com.a.f.f.d;
(( com.a.f.w ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/a/f/w;->d()V
com.a.f.w .e ( );
return;
} // .end method
