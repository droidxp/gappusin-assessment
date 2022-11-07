public class com.google.ads.h {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 final com.google.ads.internal.h a;
	 private final com.google.ads.f b;
	 private Boolean c;
	 private Boolean d;
	 private final com.google.ads.e e;
	 private com.google.ads.mediation.MediationAdapter f;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lcom/google/ads/mediation/MediationAdapter", */
	 /* "<**>;" */
	 /* } */
} // .end annotation
} // .end field
private Boolean g;
private Boolean h;
private android.view.View i;
private final android.os.Handler j;
private final java.lang.String k;
private final com.google.ads.AdRequest l;
private final java.util.HashMap m;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.google.ads.h ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/google/ads/e;", */
/* "Lcom/google/ads/internal/h;", */
/* "Lcom/google/ads/f;", */
/* "Ljava/lang/String;", */
/* "Lcom/google/ads/AdRequest;", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 97 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 98 */
v0 = android.text.TextUtils .isEmpty ( p4 );
com.google.ads.util.a .b ( v0 );
/* .line 99 */
this.e = p1;
/* .line 100 */
this.a = p2;
/* .line 101 */
this.b = p3;
/* .line 102 */
this.k = p4;
/* .line 103 */
this.l = p5;
/* .line 104 */
this.m = p6;
/* .line 105 */
/* iput-boolean v1, p0, Lcom/google/ads/h;->c:Z */
/* .line 106 */
/* iput-boolean v1, p0, Lcom/google/ads/h;->d:Z */
/* .line 107 */
this.f = v2;
/* .line 108 */
/* iput-boolean v1, p0, Lcom/google/ads/h;->g:Z */
/* .line 109 */
/* iput-boolean v1, p0, Lcom/google/ads/h;->h:Z */
/* .line 110 */
this.i = v2;
/* .line 111 */
/* new-instance v0, Landroid/os/Handler; */
android.os.Looper .getMainLooper ( );
/* invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
this.j = v0;
/* .line 112 */
return;
} // .end method
static com.google.ads.mediation.MediationAdapter a ( Object p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 42 */
v0 = this.f;
} // .end method
/* # virtual methods */
public com.google.ads.f a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 118 */
v0 = this.b;
} // .end method
public synchronized void a ( android.app.Activity p0 ) {
/* .locals 7 */
/* .prologue */
/* .line 132 */
/* monitor-enter p0 */
try { // :try_start_0
/* iget-boolean v0, p0, Lcom/google/ads/h;->g:Z */
final String v1 = "startLoadAdTask has already been called."; // const-string v1, "startLoadAdTask has already been called."
com.google.ads.util.a .b ( v0,v1 );
/* .line 134 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/ads/h;->g:Z */
/* .line 138 */
v6 = this.j;
/* new-instance v0, Lcom/google/ads/i; */
v3 = this.k;
v4 = this.l;
v5 = this.m;
/* move-object v1, p0 */
/* move-object v2, p1 */
/* invoke-direct/range {v0 ..v5}, Lcom/google/ads/i;-><init>(Lcom/google/ads/h;Landroid/app/Activity;Ljava/lang/String;Lcom/google/ads/AdRequest;Ljava/util/HashMap;)V */
(( android.os.Handler ) v6 ).post ( v0 ); // invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 141 */
/* monitor-exit p0 */
return;
/* .line 132 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
synchronized void a ( android.view.View p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 266 */
/* monitor-enter p0 */
try { // :try_start_0
this.i = p1;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 267 */
/* monitor-exit p0 */
return;
/* .line 266 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
synchronized void a ( com.google.ads.mediation.MediationAdapter p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/google/ads/mediation/MediationAdapter", */
/* "<**>;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 251 */
/* monitor-enter p0 */
try { // :try_start_0
this.f = p1;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 252 */
/* monitor-exit p0 */
return;
/* .line 251 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
synchronized void a ( Boolean p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 244 */
/* monitor-enter p0 */
try { // :try_start_0
/* iput-boolean p1, p0, Lcom/google/ads/h;->d:Z */
/* .line 245 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/ads/h;->c:Z */
/* .line 246 */
(( java.lang.Object ) p0 ).notify ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notify()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 247 */
/* monitor-exit p0 */
return;
/* .line 244 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void b ( ) {
/* .locals 2 */
/* .prologue */
/* .line 144 */
/* monitor-enter p0 */
try { // :try_start_0
	 /* iget-boolean v0, p0, Lcom/google/ads/h;->g:Z */
	 final String v1 = "destroy() called but startLoadAdTask has not been called."; // const-string v1, "destroy() called but startLoadAdTask has not been called."
	 com.google.ads.util.a .a ( v0,v1 );
	 /* .line 152 */
	 v0 = this.j;
	 /* new-instance v1, Lcom/google/ads/h$1; */
	 /* invoke-direct {v1, p0}, Lcom/google/ads/h$1;-><init>(Lcom/google/ads/h;)V */
	 (( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 174 */
	 /* monitor-exit p0 */
	 return;
	 /* .line 144 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public synchronized Boolean c ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 181 */
	 /* monitor-enter p0 */
	 try { // :try_start_0
		 /* iget-boolean v0, p0, Lcom/google/ads/h;->c:Z */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* monitor-exit p0 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit p0 */
		 /* throw v0 */
	 } // .end method
	 public synchronized Boolean d ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 190 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 v0 = 			 (( com.google.ads.h ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/google/ads/h;->c()Z
			 final String v1 = "isLoadAdTaskSuccessful() called when isLoadAdTaskDone() is false."; // const-string v1, "isLoadAdTaskSuccessful() called when isLoadAdTaskDone() is false."
			 com.google.ads.util.a .a ( v0,v1 );
			 /* .line 192 */
			 /* iget-boolean v0, p0, Lcom/google/ads/h;->d:Z */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* monitor-exit p0 */
			 /* .line 190 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit p0 */
			 /* throw v0 */
		 } // .end method
		 public synchronized android.view.View e ( ) {
			 /* .locals 2 */
			 /* .prologue */
			 /* .line 196 */
			 /* monitor-enter p0 */
			 try { // :try_start_0
				 v0 = 				 (( com.google.ads.h ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/google/ads/h;->c()Z
				 final String v1 = "getAdView() called when isLoadAdTaskDone() is false."; // const-string v1, "getAdView() called when isLoadAdTaskDone() is false."
				 com.google.ads.util.a .a ( v0,v1 );
				 /* .line 198 */
				 v0 = this.i;
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* monitor-exit p0 */
				 /* .line 196 */
				 /* :catchall_0 */
				 /* move-exception v0 */
				 /* monitor-exit p0 */
				 /* throw v0 */
			 } // .end method
			 public synchronized void f ( ) {
				 /* .locals 3 */
				 /* .prologue */
				 /* .line 202 */
				 /* monitor-enter p0 */
				 try { // :try_start_0
					 v0 = this.a;
					 v0 = 					 (( com.google.ads.internal.h ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/h;->a()Z
					 com.google.ads.util.a .a ( v0 );
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* .line 206 */
					 try { // :try_start_1
						 v0 = this.f;
						 /* check-cast v0, Lcom/google/ads/mediation/MediationInterstitialAdapter; */
						 /* .line 208 */
						 v1 = this.j;
						 /* new-instance v2, Lcom/google/ads/h$2; */
						 /* invoke-direct {v2, p0, v0}, Lcom/google/ads/h$2;-><init>(Lcom/google/ads/h;Lcom/google/ads/mediation/MediationInterstitialAdapter;)V */
						 (( android.os.Handler ) v1 ).post ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
						 /* :try_end_1 */
						 /* .catch Ljava/lang/ClassCastException; {:try_start_1 ..:try_end_1} :catch_0 */
						 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
						 /* .line 228 */
					 } // :goto_0
					 /* monitor-exit p0 */
					 return;
					 /* .line 224 */
					 /* :catch_0 */
					 /* move-exception v0 */
					 /* .line 225 */
					 try { // :try_start_2
						 final String v1 = "In Ambassador.show(): ambassador.adapter does not implement the MediationInterstitialAdapter interface."; // const-string v1, "In Ambassador.show(): ambassador.adapter does not implement the MediationInterstitialAdapter interface."
						 com.google.ads.util.b .b ( v1,v0 );
						 /* :try_end_2 */
						 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
						 /* .line 202 */
						 /* :catchall_0 */
						 /* move-exception v0 */
						 /* monitor-exit p0 */
						 /* throw v0 */
					 } // .end method
					 public synchronized java.lang.String g ( ) {
						 /* .locals 1 */
						 /* .prologue */
						 /* .line 238 */
						 /* monitor-enter p0 */
						 try { // :try_start_0
							 v0 = this.f;
							 if ( v0 != null) { // if-eqz v0, :cond_0
								 v0 = this.f;
								 (( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
								 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
								 /* :try_end_0 */
								 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
							 } // :goto_0
							 /* monitor-exit p0 */
						 } // :cond_0
						 try { // :try_start_1
							 final String v0 = "\"adapter was not created.\""; // const-string v0, "\"adapter was not created.\""
							 /* :try_end_1 */
							 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
							 /* :catchall_0 */
							 /* move-exception v0 */
							 /* monitor-exit p0 */
							 /* throw v0 */
						 } // .end method
						 synchronized com.google.ads.mediation.MediationAdapter h ( ) {
							 /* .locals 1 */
							 /* .annotation system Ldalvik/annotation/Signature; */
							 /* value = { */
							 /* "()", */
							 /* "Lcom/google/ads/mediation/MediationAdapter", */
							 /* "<**>;" */
							 /* } */
						 } // .end annotation
						 /* .prologue */
						 /* .line 255 */
						 /* monitor-enter p0 */
						 try { // :try_start_0
							 v0 = this.f;
							 /* :try_end_0 */
							 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
							 /* monitor-exit p0 */
							 /* :catchall_0 */
							 /* move-exception v0 */
							 /* monitor-exit p0 */
							 /* throw v0 */
						 } // .end method
						 com.google.ads.e i ( ) {
							 /* .locals 1 */
							 /* .prologue */
							 /* .line 262 */
							 v0 = this.e;
						 } // .end method
						 synchronized void j ( ) {
							 /* .locals 1 */
							 /* .prologue */
							 /* .line 270 */
							 /* monitor-enter p0 */
							 int v0 = 1; // const/4 v0, 0x1
							 try { // :try_start_0
								 /* iput-boolean v0, p0, Lcom/google/ads/h;->h:Z */
								 /* :try_end_0 */
								 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
								 /* .line 271 */
								 /* monitor-exit p0 */
								 return;
								 /* .line 270 */
								 /* :catchall_0 */
								 /* move-exception v0 */
								 /* monitor-exit p0 */
								 /* throw v0 */
							 } // .end method
							 synchronized Boolean k ( ) {
								 /* .locals 1 */
								 /* .prologue */
								 /* .line 274 */
								 /* monitor-enter p0 */
								 try { // :try_start_0
									 /* iget-boolean v0, p0, Lcom/google/ads/h;->h:Z */
									 /* :try_end_0 */
									 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
									 /* monitor-exit p0 */
									 /* :catchall_0 */
									 /* move-exception v0 */
									 /* monitor-exit p0 */
									 /* throw v0 */
								 } // .end method
