public class com.google.ads.util.a {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/util/a$a; */
	 /* } */
} // .end annotation
/* # static fields */
private static Boolean a;
/* # direct methods */
static com.google.ads.util.a ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 33 */
	 final String v0 = "GoogleAdsAssertion"; // const-string v0, "GoogleAdsAssertion"
	 int v1 = 3; // const/4 v1, 0x3
	 v0 = 	 android.util.Log .isLoggable ( v0,v1 );
	 com.google.ads.util.a.a = (v0!= 0);
	 return;
} // .end method
public static void a ( java.lang.Object p0 ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 53 */
	 /* if-nez p0, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
} // :goto_0
final String v1 = "Assertion that an object is null failed."; // const-string v1, "Assertion that an object is null failed."
com.google.ads.util.a .c ( v0,v1 );
/* .line 55 */
return;
/* .line 53 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static void a ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 3 */
/* .prologue */
/* .line 71 */
/* if-ne p0, p1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Assertion that \'a\' and \'b\' refer to the same object failed.a: "; // const-string v2, "Assertion that \'a\' and \'b\' refer to the same object failed.a: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = ", b: "; // const-string v2, ", b: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.a .c ( v0,v1 );
/* .line 74 */
return;
/* .line 71 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static void a ( java.lang.String p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 91 */
v0 = android.text.TextUtils .isEmpty ( p0 );
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Expected a non empty string, got: "; // const-string v2, "Expected a non empty string, got: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.a .c ( v0,v1 );
/* .line 93 */
return;
/* .line 91 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static void a ( Boolean p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 37 */
final String v0 = "Assertion failed."; // const-string v0, "Assertion failed."
com.google.ads.util.a .c ( p0,v0 );
/* .line 38 */
return;
} // .end method
public static void a ( Boolean p0, java.lang.String p1 ) {
/* .locals 0 */
/* .prologue */
/* .line 41 */
com.google.ads.util.a .c ( p0,p1 );
/* .line 42 */
return;
} // .end method
public static void b ( java.lang.Object p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 62 */
if ( p0 != null) { // if-eqz p0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
final String v1 = "Assertion that an object is not null failed."; // const-string v1, "Assertion that an object is not null failed."
com.google.ads.util.a .c ( v0,v1 );
/* .line 64 */
return;
/* .line 62 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static void b ( Boolean p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 45 */
/* if-nez p0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
final String v1 = "Assertion failed."; // const-string v1, "Assertion failed."
com.google.ads.util.a .c ( v0,v1 );
/* .line 46 */
return;
/* .line 45 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static void b ( Boolean p0, java.lang.String p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 49 */
/* if-nez p0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
com.google.ads.util.a .c ( v0,p1 );
/* .line 50 */
return;
/* .line 49 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private static void c ( Boolean p0, java.lang.String p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 107 */
final String v0 = "GoogleAdsAssertion"; // const-string v0, "GoogleAdsAssertion"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
/* if-nez v0, :cond_1 */
/* sget-boolean v0, Lcom/google/ads/util/a;->a:Z */
/* if-nez v0, :cond_1 */
/* .line 116 */
} // :cond_0
return;
/* .line 111 */
} // :cond_1
/* if-nez p0, :cond_0 */
/* .line 112 */
/* new-instance v0, Lcom/google/ads/util/a$a; */
/* invoke-direct {v0, p1}, Lcom/google/ads/util/a$a;-><init>(Ljava/lang/String;)V */
/* .line 113 */
final String v1 = "GoogleAdsAssertion"; // const-string v1, "GoogleAdsAssertion"
android.util.Log .d ( v1,p1,v0 );
/* .line 114 */
/* throw v0 */
} // .end method
