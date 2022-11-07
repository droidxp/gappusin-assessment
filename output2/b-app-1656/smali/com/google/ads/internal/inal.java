public class inal extends java.lang.Exception {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Boolean a;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
		 /* .line 25 */
		 /* iput-boolean p2, p0, Lcom/google/ads/internal/b;->a:Z */
		 /* .line 26 */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 36 */
		 /* invoke-direct {p0, p1, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
		 /* .line 38 */
		 /* iput-boolean p2, p0, Lcom/google/ads/internal/b;->a:Z */
		 /* .line 39 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 42 */
		 (( com.google.ads.internal.b ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/ads/internal/b;->c(Ljava/lang/String;)Ljava/lang/String;
		 com.google.ads.util.b .b ( v0 );
		 /* .line 43 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.google.ads.util.b .a ( v0,p0 );
		 /* .line 44 */
		 return;
	 } // .end method
	 public void b ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 47 */
		 /* new-instance v0, Ljava/lang/RuntimeException; */
		 (( com.google.ads.internal.b ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/ads/internal/b;->c(Ljava/lang/String;)Ljava/lang/String;
		 /* iget-boolean v2, p0, Lcom/google/ads/internal/b;->a:Z */
		 if ( v2 != null) { // if-eqz v2, :cond_0
		 } // :goto_0
		 /* invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
		 /* throw v0 */
	 } // :cond_0
	 int p0 = 0; // const/4 p0, 0x0
} // .end method
public java.lang.String c ( java.lang.String p0 ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 56 */
	 /* iget-boolean v0, p0, Lcom/google/ads/internal/b;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 57 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = ": "; // const-string v1, ": "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( com.google.ads.internal.b ) p0 ).getMessage ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/b;->getMessage()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 59 */
	 } // :cond_0
} // .end method
