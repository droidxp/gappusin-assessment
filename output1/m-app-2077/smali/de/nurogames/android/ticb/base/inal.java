class inal extends java.lang.Enum {
	 /* .source "tinysanta.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/tinysanta; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x401a */
/* name = "Managed" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Enum", */
/* "<", */
/* "Lde/nurogames/android/ticb/base/tinysanta$Managed;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
private static final de.nurogames.android.ticb.base.tinysanta$Managed ENUM$VALUES; //synthetic
public static final de.nurogames.android.ticb.base.tinysanta$Managed MANAGED;
public static final de.nurogames.android.ticb.base.tinysanta$Managed SUBSCRIPTION;
public static final de.nurogames.android.ticb.base.tinysanta$Managed UNMANAGED;
/* # direct methods */
static inal ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 2; // const/4 v4, 0x2
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 280 */
/* new-instance v0, Lde/nurogames/android/ticb/base/tinysanta$Managed; */
final String v1 = "MANAGED"; // const-string v1, "MANAGED"
/* invoke-direct {v0, v1, v2}, Lde/nurogames/android/ticb/base/tinysanta$Managed;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lde/nurogames/android/ticb/base/tinysanta$Managed; */
final String v1 = "UNMANAGED"; // const-string v1, "UNMANAGED"
/* invoke-direct {v0, v1, v3}, Lde/nurogames/android/ticb/base/tinysanta$Managed;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lde/nurogames/android/ticb/base/tinysanta$Managed; */
final String v1 = "SUBSCRIPTION"; // const-string v1, "SUBSCRIPTION"
/* invoke-direct {v0, v1, v4}, Lde/nurogames/android/ticb/base/tinysanta$Managed;-><init>(Ljava/lang/String;I)V */
int v0 = 3; // const/4 v0, 0x3
/* new-array v0, v0, [Lde/nurogames/android/ticb/base/tinysanta$Managed; */
v1 = de.nurogames.android.ticb.base.tinysanta$Managed.MANAGED;
/* aput-object v1, v0, v2 */
v1 = de.nurogames.android.ticb.base.tinysanta$Managed.UNMANAGED;
/* aput-object v1, v0, v3 */
v1 = de.nurogames.android.ticb.base.tinysanta$Managed.SUBSCRIPTION;
/* aput-object v1, v0, v4 */
return;
} // .end method
private inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 280 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
return;
} // .end method
public static de.nurogames.android.ticb.base.tinysanta$Managed valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1 */
/* const-class v0, Lde/nurogames/android/ticb/base/tinysanta$Managed; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lde/nurogames/android/ticb/base/tinysanta$Managed; */
} // .end method
public static de.nurogames.android.ticb.base.tinysanta$Managed values ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 1 */
v0 = de.nurogames.android.ticb.base.tinysanta$Managed.ENUM$VALUES;
/* array-length v1, v0 */
/* new-array v2, v1, [Lde/nurogames/android/ticb/base/tinysanta$Managed; */
java.lang.System .arraycopy ( v0,v3,v2,v3,v1 );
} // .end method
