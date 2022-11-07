public class com.google.ads.mediation.MediationAdRequest {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 private com.google.ads.AdRequest a;
	 private Boolean b;
	 private Boolean c;
	 /* # direct methods */
	 public com.google.ads.mediation.MediationAdRequest ( ) {
		 /* .locals 1 */
		 /* .param p1, "request" # Lcom/google/ads/AdRequest; */
		 /* .param p2, "context" # Landroid/content/Context; */
		 /* .param p3, "shareLocation" # Z */
		 /* .prologue */
		 /* .line 35 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 36 */
		 this.a = p1;
		 /* .line 37 */
		 /* iput-boolean p3, p0, Lcom/google/ads/mediation/MediationAdRequest;->c:Z */
		 /* .line 39 */
		 /* if-nez p2, :cond_0 */
		 /* .line 40 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/google/ads/mediation/MediationAdRequest;->b:Z */
		 /* .line 44 */
	 } // :goto_0
	 return;
	 /* .line 42 */
} // :cond_0
v0 = (( com.google.ads.AdRequest ) p1 ).isTestDevice ( p2 ); // invoke-virtual {p1, p2}, Lcom/google/ads/AdRequest;->isTestDevice(Landroid/content/Context;)Z
/* iput-boolean v0, p0, Lcom/google/ads/mediation/MediationAdRequest;->b:Z */
} // .end method
/* # virtual methods */
public java.lang.Integer getAgeInYears ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 6; // const/4 v4, 0x6
int v3 = 1; // const/4 v3, 0x1
/* .line 67 */
v0 = this.a;
(( com.google.ads.AdRequest ) v0 ).getBirthday ( ); // invoke-virtual {v0}, Lcom/google/ads/AdRequest;->getBirthday()Ljava/util/Date;
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 68 */
	 java.util.Calendar .getInstance ( );
	 /* .line 69 */
	 java.util.Calendar .getInstance ( );
	 /* .line 70 */
	 v0 = this.a;
	 (( com.google.ads.AdRequest ) v0 ).getBirthday ( ); // invoke-virtual {v0}, Lcom/google/ads/AdRequest;->getBirthday()Ljava/util/Date;
	 (( java.util.Calendar ) v1 ).setTime ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V
	 /* .line 72 */
	 v0 = 	 (( java.util.Calendar ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I
	 v3 = 	 (( java.util.Calendar ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I
	 /* sub-int/2addr v0, v3 */
	 java.lang.Integer .valueOf ( v0 );
	 /* .line 73 */
	 v2 = 	 (( java.util.Calendar ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/Calendar;->get(I)I
	 v1 = 	 (( java.util.Calendar ) v1 ).get ( v4 ); // invoke-virtual {v1, v4}, Ljava/util/Calendar;->get(I)I
	 /* if-ge v2, v1, :cond_0 */
	 /* .line 75 */
	 v0 = 	 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
	 /* add-int/lit8 v0, v0, -0x1 */
	 java.lang.Integer .valueOf ( v0 );
	 /* .line 81 */
} // :cond_0
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.util.Date getBirthday ( ) {
/* .locals 1 */
/* .prologue */
/* .line 57 */
v0 = this.a;
(( com.google.ads.AdRequest ) v0 ).getBirthday ( ); // invoke-virtual {v0}, Lcom/google/ads/AdRequest;->getBirthday()Ljava/util/Date;
} // .end method
public com.google.ads.AdRequest$Gender getGender ( ) {
/* .locals 1 */
/* .prologue */
/* .line 50 */
v0 = this.a;
(( com.google.ads.AdRequest ) v0 ).getGender ( ); // invoke-virtual {v0}, Lcom/google/ads/AdRequest;->getGender()Lcom/google/ads/AdRequest$Gender;
} // .end method
public java.util.Set getKeywords ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 88 */
v0 = this.a;
(( com.google.ads.AdRequest ) v0 ).getKeywords ( ); // invoke-virtual {v0}, Lcom/google/ads/AdRequest;->getKeywords()Ljava/util/Set;
/* if-nez v0, :cond_0 */
/* .line 89 */
int v0 = 0; // const/4 v0, 0x0
/* .line 92 */
} // :goto_0
} // :cond_0
v0 = this.a;
(( com.google.ads.AdRequest ) v0 ).getKeywords ( ); // invoke-virtual {v0}, Lcom/google/ads/AdRequest;->getKeywords()Ljava/util/Set;
java.util.Collections .unmodifiableSet ( v0 );
} // .end method
public android.location.Location getLocation ( ) {
/* .locals 2 */
/* .prologue */
/* .line 100 */
v0 = this.a;
(( com.google.ads.AdRequest ) v0 ).getLocation ( ); // invoke-virtual {v0}, Lcom/google/ads/AdRequest;->getLocation()Landroid/location/Location;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lcom/google/ads/mediation/MediationAdRequest;->c:Z */
/* if-nez v0, :cond_1 */
/* .line 101 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 104 */
} // :goto_0
} // :cond_1
/* new-instance v0, Landroid/location/Location; */
v1 = this.a;
(( com.google.ads.AdRequest ) v1 ).getLocation ( ); // invoke-virtual {v1}, Lcom/google/ads/AdRequest;->getLocation()Landroid/location/Location;
/* invoke-direct {v0, v1}, Landroid/location/Location;-><init>(Landroid/location/Location;)V */
} // .end method
public Boolean isTesting ( ) {
/* .locals 1 */
/* .prologue */
/* .line 114 */
/* iget-boolean v0, p0, Lcom/google/ads/mediation/MediationAdRequest;->b:Z */
} // .end method
