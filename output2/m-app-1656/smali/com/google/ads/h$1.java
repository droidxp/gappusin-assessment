class com.google.ads.h$1 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/google/ads/h;->b()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.google.ads.h a; //synthetic
/* # direct methods */
 com.google.ads.h$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 152 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 157 */
v0 = this.a;
v0 = (( com.google.ads.h ) v0 ).k ( ); // invoke-virtual {v0}, Lcom/google/ads/h;->k()Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 158 */
	 v0 = this.a;
	 com.google.ads.h .a ( v0 );
	 com.google.ads.util.a .b ( v0 );
	 /* .line 160 */
	 try { // :try_start_0
		 v0 = this.a;
		 com.google.ads.h .a ( v0 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 169 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "Called destroy() for adapter with class: "; // const-string v1, "Called destroy() for adapter with class: "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.a;
		 com.google.ads.h .a ( v1 );
		 (( java.lang.Object ) v1 ).getClass ( ); // invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.google.ads.util.b .a ( v0 );
		 /* .line 172 */
	 } // :cond_0
} // :goto_0
return;
/* .line 161 */
/* :catch_0 */
/* move-exception v0 */
/* .line 164 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Error while destroying adapter ("; // const-string v2, "Error while destroying adapter ("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
(( com.google.ads.h ) v2 ).g ( ); // invoke-virtual {v2}, Lcom/google/ads/h;->g()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "):"; // const-string v2, "):"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .b ( v1,v0 );
} // .end method
