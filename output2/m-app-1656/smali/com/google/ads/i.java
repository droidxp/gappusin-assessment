class com.google.ads.i implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/i$a; */
	 /* } */
} // .end annotation
/* # instance fields */
private final com.google.ads.h a;
private final java.lang.String b;
private final com.google.ads.AdRequest c;
private final java.util.HashMap d;
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
private final Boolean e;
private final java.lang.ref.WeakReference f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/WeakReference", */
/* "<", */
/* "Landroid/app/Activity;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.google.ads.i ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/google/ads/h;", */
/* "Landroid/app/Activity;", */
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
/* .line 95 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 96 */
this.a = p1;
/* .line 97 */
this.b = p3;
/* .line 98 */
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.f = v0;
/* .line 99 */
this.c = p4;
/* .line 102 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0, p5}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V */
this.d = v0;
/* .line 103 */
v0 = this.d;
v0 = com.google.ads.i .a ( v0 );
/* iput-boolean v0, p0, Lcom/google/ads/i;->e:Z */
/* .line 104 */
return;
} // .end method
private void a ( com.google.ads.mediation.MediationAdapter p0 ) {
/* .locals 13 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T::", */
/* "Lcom/google/ads/mediation/NetworkExtras;", */
/* "U:", */
/* "Lcom/google/ads/mediation/MediationServerParameters;", */
/* ">(", */
/* "Lcom/google/ads/mediation/MediationAdapter", */
/* "<TT;TU;>;)V" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/ads/mediation/MediationServerParameters$MappingException;, */
/* Lcom/google/ads/i$a;, */
/* Ljava/lang/IllegalAccessException;, */
/* Ljava/lang/InstantiationException; */
/* } */
} // .end annotation
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 142 */
v0 = this.f;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v2, Landroid/app/Activity; */
/* .line 143 */
/* if-nez v2, :cond_0 */
/* .line 144 */
/* new-instance v0, Lcom/google/ads/i$a; */
final String v1 = "Activity became null while trying to instantiate adapter."; // const-string v1, "Activity became null while trying to instantiate adapter."
/* invoke-direct {v0, v1}, Lcom/google/ads/i$a;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 147 */
} // :cond_0
v0 = this.a;
(( com.google.ads.h ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/ads/h;->a(Lcom/google/ads/mediation/MediationAdapter;)V
/* .line 152 */
/* .line 154 */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 155 */
(( java.lang.Class ) v0 ).newInstance ( ); // invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/mediation/MediationServerParameters; */
/* .line 156 */
v3 = this.d;
(( com.google.ads.mediation.MediationServerParameters ) v0 ).load ( v3 ); // invoke-virtual {v0, v3}, Lcom/google/ads/mediation/MediationServerParameters;->load(Ljava/util/Map;)V
/* move-object v3, v0 */
/* .line 162 */
} // :goto_0
/* .line 164 */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 165 */
v1 = this.c;
(( com.google.ads.AdRequest ) v1 ).getNetworkExtras ( v0 ); // invoke-virtual {v1, v0}, Lcom/google/ads/AdRequest;->getNetworkExtras(Ljava/lang/Class;)Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/mediation/NetworkExtras; */
/* move-object v5, v0 */
/* .line 170 */
} // :goto_1
/* new-instance v4, Lcom/google/ads/mediation/MediationAdRequest; */
v0 = this.c;
/* iget-boolean v1, p0, Lcom/google/ads/i;->e:Z */
/* invoke-direct {v4, v0, v2, v1}, Lcom/google/ads/mediation/MediationAdRequest;-><init>(Lcom/google/ads/AdRequest;Landroid/content/Context;Z)V */
/* .line 174 */
v0 = this.a;
v0 = this.a;
v0 = (( com.google.ads.internal.h ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/h;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 175 */
/* instance-of v0, p1, Lcom/google/ads/mediation/MediationInterstitialAdapter; */
/* if-nez v0, :cond_1 */
/* .line 176 */
/* new-instance v0, Lcom/google/ads/i$a; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Adapter "; // const-string v2, "Adapter "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.b;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " doesn\'t support the MediationInterstitialAdapter"; // const-string v2, " doesn\'t support the MediationInterstitialAdapter"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " interface."; // const-string v2, " interface."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lcom/google/ads/i$a;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
/* move-object v0, p1 */
/* .line 180 */
/* check-cast v0, Lcom/google/ads/mediation/MediationInterstitialAdapter; */
/* .line 182 */
/* new-instance v1, Lcom/google/ads/k; */
v6 = this.a;
/* invoke-direct {v1, v6}, Lcom/google/ads/k;-><init>(Lcom/google/ads/h;)V */
/* invoke-interface/range {v0 ..v5}, Lcom/google/ads/mediation/MediationInterstitialAdapter;->requestInterstitialAd(Lcom/google/ads/mediation/MediationInterstitialListener;Landroid/app/Activity;Lcom/google/ads/mediation/MediationServerParameters;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/NetworkExtras;)V */
/* .line 202 */
} // :goto_2
v0 = this.a;
(( com.google.ads.h ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/google/ads/h;->j()V
/* .line 203 */
return;
/* .line 189 */
} // :cond_2
/* instance-of v0, p1, Lcom/google/ads/mediation/MediationBannerAdapter; */
/* if-nez v0, :cond_3 */
/* .line 190 */
/* new-instance v0, Lcom/google/ads/i$a; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Adapter "; // const-string v2, "Adapter "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.b;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " doesn\'t support the MediationBannerAdapter interface"; // const-string v2, " doesn\'t support the MediationBannerAdapter interface"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lcom/google/ads/i$a;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_3
/* move-object v6, p1 */
/* .line 193 */
/* check-cast v6, Lcom/google/ads/mediation/MediationBannerAdapter; */
/* .line 195 */
/* new-instance v7, Lcom/google/ads/j; */
v0 = this.a;
/* invoke-direct {v7, v0}, Lcom/google/ads/j;-><init>(Lcom/google/ads/h;)V */
v0 = this.a;
v0 = this.a;
(( com.google.ads.internal.h ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/h;->b()Lcom/google/ads/AdSize;
/* move-object v8, v2 */
/* move-object v9, v3 */
/* move-object v11, v4 */
/* move-object v12, v5 */
/* invoke-interface/range {v6 ..v12}, Lcom/google/ads/mediation/MediationBannerAdapter;->requestBannerAd(Lcom/google/ads/mediation/MediationBannerListener;Landroid/app/Activity;Lcom/google/ads/mediation/MediationServerParameters;Lcom/google/ads/AdSize;Lcom/google/ads/mediation/MediationAdRequest;Lcom/google/ads/mediation/NetworkExtras;)V */
} // :cond_4
/* move-object v5, v1 */
/* goto/16 :goto_1 */
} // :cond_5
/* move-object v3, v1 */
/* goto/16 :goto_0 */
} // .end method
private void a ( java.lang.String p0, java.lang.Throwable p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 132 */
com.google.ads.util.b .b ( p1,p2 );
/* .line 133 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( com.google.ads.h ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/h;->a(Z)V
/* .line 134 */
return;
} // .end method
private static Boolean a ( java.util.Map p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)Z" */
/* } */
} // .end annotation
/* .prologue */
/* .line 67 */
final String v0 = "gwhirl_share_location"; // const-string v0, "gwhirl_share_location"
/* check-cast v0, Ljava/lang/String; */
/* .line 68 */
final String v1 = "1"; // const-string v1, "1"
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 69 */
int v0 = 1; // const/4 v0, 0x1
/* .line 79 */
} // :goto_0
/* .line 73 */
} // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
final String v1 = "0"; // const-string v1, "0"
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_1 */
/* .line 74 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Received an illegal value, \'"; // const-string v2, "Received an illegal value, \'"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\', for the special share location parameter from mediation server"; // const-string v1, "\', for the special share location parameter from mediation server"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " (expected \'0\' or \'1\').Will not share the location."; // const-string v1, " (expected \'0\' or \'1\').Will not share the location."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .b ( v0 );
/* .line 79 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 113 */
try { // :try_start_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Trying to instantiate: "; // const-string v1, "Trying to instantiate: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .a ( v0 );
/* .line 116 */
v0 = this.b;
/* const-class v1, Lcom/google/ads/mediation/MediationAdapter; */
com.google.ads.g .a ( v0,v1 );
/* check-cast v0, Lcom/google/ads/mediation/MediationAdapter; */
/* .line 119 */
/* invoke-direct {p0, v0}, Lcom/google/ads/i;->a(Lcom/google/ads/mediation/MediationAdapter;)V */
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 129 */
} // :goto_0
return;
/* .line 120 */
/* :catch_0 */
/* move-exception v0 */
/* .line 121 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Cannot find adapter class \'"; // const-string v2, "Cannot find adapter class \'"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.b;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\'.Did you link the ad network\'s mediation adapter? Skipping ad network."; // const-string v2, "\'.Did you link the ad network\'s mediation adapter? Skipping ad network."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, v1, v0}, Lcom/google/ads/i;->a(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* .line 124 */
/* :catch_1 */
/* move-exception v0 */
/* .line 126 */
final String v1 = "Error while creating adapter and loading ad from ad network.Skipping ad network."; // const-string v1, "Error while creating adapter and loading ad from ad network.Skipping ad network."
/* invoke-direct {p0, v1, v0}, Lcom/google/ads/i;->a(Ljava/lang/String;Ljava/lang/Throwable;)V */
} // .end method
