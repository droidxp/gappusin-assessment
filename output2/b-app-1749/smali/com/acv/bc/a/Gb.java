public class com.acv.bc.a.Gb {
	 /* # static fields */
	 public static final java.lang.String a;
	 private static com.acv.bc.a.Gb b;
	 /* # instance fields */
	 private android.content.Context c;
	 private com.acv.bc.a.Mk d;
	 private com.acv.bc.a.Mm e;
	 /* # direct methods */
	 static com.acv.bc.a.Gb ( ) {
		 /* .locals 1 */
		 /* const-class v0, Lcom/acv/bc/a/Gb; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 public com.acv.bc.a.Gb ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.c = p1;
		 /* invoke-direct {p0}, Lcom/acv/bc/a/Gb;->c()V */
		 return;
	 } // .end method
	 public static java.lang.String a ( Integer p0 ) {
		 /* .locals 4 */
		 try { // :try_start_0
			 v0 = com.acv.bc.a.Gb.b;
			 v0 = this.d;
			 (( com.acv.bc.a.Mk ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/acv/bc/a/Mk;->a()Ljava/util/Map;
		 v0 = 		 } // :cond_0
		 /* if-nez v0, :cond_1 */
	 } // :goto_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_1
} // :cond_1
/* check-cast v0, Ljava/lang/String; */
java.lang.String .valueOf ( p0 );
v3 = (( java.lang.String ) v3 ).equals ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* check-cast v0, Lcom/acv/bc/a/Wd; */
(( com.acv.bc.a.Wd ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/acv/bc/a/Wd;->b()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public static synchronized Boolean a ( android.content.Context p0 ) {
/* .locals 2 */
/* const-class v1, Lcom/acv/bc/a/Gb; */
/* monitor-enter v1 */
try { // :try_start_0
	 v0 = com.acv.bc.a.Gb.b;
	 /* if-nez v0, :cond_0 */
	 /* new-instance v0, Lcom/acv/bc/a/Gb; */
	 /* invoke-direct {v0, p0}, Lcom/acv/bc/a/Gb;-><init>(Landroid/content/Context;)V */
} // :cond_0
v0 = com.acv.bc.a.Gb.b;
(( com.acv.bc.a.Gb ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/acv/bc/a/Gb;->a()Z
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit v1 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* throw v0 */
} // .end method
private void c ( ) {
/* .locals 4 */
v0 = this.c;
com.acv.bc.a.Mm .a ( v0 );
/* new-instance v0, Lcom/acv/bc/a/Mk; */
v1 = this.c;
/* invoke-direct {v0, v1}, Lcom/acv/bc/a/Mk;-><init>(Landroid/content/Context;)V */
this.d = v0;
v0 = this.d;
v1 = this.c;
v2 = com.acv.bc.a.Mk.b;
int v3 = 0; // const/4 v3, 0x0
(( android.content.Context ) v1 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
(( com.acv.bc.a.Mk ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/acv/bc/a/Mk;->a(Landroid/content/SharedPreferences;)V
v0 = com.acv.bc.a.Gb.a;
v1 = this.d;
com.acv.bc.bc.Gg .a ( v1 );
com.acv.bc.bc.Mk .a ( v0,v1 );
return;
} // .end method
/* # virtual methods */
public Boolean a ( ) {
/* .locals 4 */
v0 = this.d;
v0 = (( com.acv.bc.a.Mk ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/acv/bc/a/Mk;->d()I
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
v0 = (( com.acv.bc.a.Gb ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/acv/bc/a/Gb;->b()Z
} // :goto_0
} // :cond_0
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
v2 = this.d;
(( com.acv.bc.a.Mk ) v2 ).f ( ); // invoke-virtual {v2}, Lcom/acv/bc/a/Mk;->f()J
/* move-result-wide v2 */
/* sub-long/2addr v0, v2 */
java.lang.Math .abs ( v0,v1 );
/* move-result-wide v0 */
v2 = this.d;
(( com.acv.bc.a.Mk ) v2 ).e ( ); // invoke-virtual {v2}, Lcom/acv/bc/a/Mk;->e()J
/* move-result-wide v2 */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_1 */
v0 = (( com.acv.bc.a.Gb ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/acv/bc/a/Gb;->b()Z
} // :cond_1
v0 = this.d;
v0 = (( com.acv.bc.a.Mk ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/acv/bc/a/Mk;->b()Z
} // .end method
public Boolean b ( ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
v1 = this.e;
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = this.e;
v1 = (( com.acv.bc.a.Mm ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/acv/bc/a/Mm;->a()Z
if ( v1 != null) { // if-eqz v1, :cond_1
} // :cond_0
} // :goto_0
} // :cond_1
/* new-instance v1, Lcom/acv/bc/a/Mm; */
v2 = this.c;
v3 = this.d;
/* invoke-direct {v1, v2, v3}, Lcom/acv/bc/a/Mm;-><init>(Landroid/content/Context;Lcom/acv/bc/a/Mk;)V */
this.e = v1;
v1 = this.e;
(( com.acv.bc.a.Mm ) v1 ).start ( ); // invoke-virtual {v1}, Lcom/acv/bc/a/Mm;->start()V
v1 = this.e;
v1 = (( com.acv.bc.a.Mm ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/acv/bc/a/Mm;->a()Z
/* if-nez v1, :cond_0 */
v0 = this.d;
v0 = (( com.acv.bc.a.Mk ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/acv/bc/a/Mk;->b()Z
} // .end method
