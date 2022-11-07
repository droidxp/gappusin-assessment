public class com.adknowledge.superrewards.model.SROffer implements java.io.Serializable {
	 /* .source "SROffer.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.lang.String CLICK_URL;
	 public static final java.lang.String CURRENCY;
	 public static final java.lang.String DESCRIPTION;
	 public static final java.lang.String GEO_AVAILABILITY;
	 public static final java.lang.String ICON;
	 public static final java.lang.String ICON_LARGE;
	 public static final java.lang.String ID;
	 public static final java.lang.String IMAGE;
	 public static final java.lang.String LONG_DESCRIPTION;
	 public static final java.lang.String METHOD_TYPES;
	 public static final java.lang.String NAME;
	 public static final java.lang.String N_PAGES;
	 public static final java.lang.String OFFER;
	 public static final java.lang.String OFFERS;
	 public static final java.lang.String OFFER_TYPE;
	 public static final java.lang.String PAYOUT;
	 public static final java.lang.String PRICE_POINTS;
	 public static final java.lang.String PROBLEMS_PAGE;
	 public static final java.lang.String REQUIREMENTS;
	 public static final java.lang.String SHORT_DESCRIPTION;
	 public static final java.lang.String SHORT_NAME;
	 public static final java.lang.String SRXML;
	 public static final java.lang.String TESTOFFER;
	 public static final java.lang.String TITLE;
	 public static final java.lang.String TYPE;
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 private final java.lang.String DefaultImageFree;
	 private final java.lang.String DefaultImagePurchase;
	 private java.lang.String currency;
	 private java.lang.String description;
	 private java.lang.String geo_availability;
	 private java.lang.String icon;
	 private java.lang.String iconLarge;
	 private java.lang.String id;
	 private java.lang.String image;
	 private java.lang.String longDescription;
	 private java.util.List methodTypes;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List", */
	 /* "<", */
	 /* "Lcom/adknowledge/superrewards/model/SRMethodType;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private java.lang.String name;
private java.lang.String npages;
private com.adknowledge.superrewards.model.SROfferType offerType;
private java.lang.String payout;
private java.util.List pricePoints;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/adknowledge/superrewards/model/SRPricePoint;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.lang.String problemsPage;
private java.lang.String requirements;
private java.lang.String shortDescription;
private java.lang.String shortName;
private com.adknowledge.superrewards.model.SRType type;
private java.lang.String url;
/* # direct methods */
public com.adknowledge.superrewards.model.SROffer ( ) {
/* .locals 1 */
/* .prologue */
/* .line 154 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 33 */
final String v0 = "http://cdn.superrewards-offers.com/img/offerwall/v2/images/off_image_purchase.png"; // const-string v0, "http://cdn.superrewards-offers.com/img/offerwall/v2/images/off_image_purchase.png"
this.DefaultImagePurchase = v0;
/* .line 34 */
final String v0 = "http://cdn.superrewards-offers.com/img/offerwall/v2/images/off_image_free.png"; // const-string v0, "http://cdn.superrewards-offers.com/img/offerwall/v2/images/off_image_free.png"
this.DefaultImageFree = v0;
/* .line 104 */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
final String v0 = "http://cdn.superrewards-offers.com/img/offerwall/v2/images/off_image_purchase.png"; // const-string v0, "http://cdn.superrewards-offers.com/img/offerwall/v2/images/off_image_purchase.png"
this.image = v0;
/* .line 155 */
return;
} // .end method
public com.adknowledge.superrewards.model.SROffer ( ) {
/* .locals 1 */
/* .param p1, "currency" # Ljava/lang/String; */
/* .param p2, "npages" # Ljava/lang/String; */
/* .param p3, "problemsPage" # Ljava/lang/String; */
/* .prologue */
/* .line 148 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 33 */
final String v0 = "http://cdn.superrewards-offers.com/img/offerwall/v2/images/off_image_purchase.png"; // const-string v0, "http://cdn.superrewards-offers.com/img/offerwall/v2/images/off_image_purchase.png"
this.DefaultImagePurchase = v0;
/* .line 34 */
final String v0 = "http://cdn.superrewards-offers.com/img/offerwall/v2/images/off_image_free.png"; // const-string v0, "http://cdn.superrewards-offers.com/img/offerwall/v2/images/off_image_free.png"
this.DefaultImageFree = v0;
/* .line 104 */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
final String v0 = "http://cdn.superrewards-offers.com/img/offerwall/v2/images/off_image_purchase.png"; // const-string v0, "http://cdn.superrewards-offers.com/img/offerwall/v2/images/off_image_purchase.png"
this.image = v0;
/* .line 149 */
this.currency = p1;
/* .line 150 */
this.npages = p2;
/* .line 151 */
this.problemsPage = p3;
/* .line 152 */
return;
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 5 */
/* .param p1, "obj" # Ljava/lang/Object; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 374 */
/* if-ne p0, p1, :cond_1 */
/* .line 510 */
} // :cond_0
} // :goto_0
/* .line 377 */
} // :cond_1
/* if-nez p1, :cond_2 */
/* move v1, v2 */
/* .line 378 */
/* .line 380 */
} // :cond_2
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* if-eq v3, v4, :cond_3 */
/* move v1, v2 */
/* .line 381 */
} // :cond_3
/* move-object v0, p1 */
/* .line 383 */
/* check-cast v0, Lcom/adknowledge/superrewards/model/SROffer; */
/* .line 384 */
/* .local v0, "other":Lcom/adknowledge/superrewards/model/SROffer; */
v3 = this.currency;
/* if-nez v3, :cond_4 */
/* .line 385 */
v3 = this.currency;
if ( v3 != null) { // if-eqz v3, :cond_5
/* move v1, v2 */
/* .line 386 */
/* .line 388 */
} // :cond_4
v3 = this.currency;
v4 = this.currency;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_5 */
/* move v1, v2 */
/* .line 389 */
/* .line 391 */
} // :cond_5
v3 = this.description;
/* if-nez v3, :cond_6 */
/* .line 392 */
v3 = this.description;
if ( v3 != null) { // if-eqz v3, :cond_7
/* move v1, v2 */
/* .line 393 */
/* .line 395 */
} // :cond_6
v3 = this.description;
v4 = this.description;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_7 */
/* move v1, v2 */
/* .line 396 */
/* .line 398 */
} // :cond_7
v3 = this.icon;
/* if-nez v3, :cond_8 */
/* .line 399 */
v3 = this.icon;
if ( v3 != null) { // if-eqz v3, :cond_9
/* move v1, v2 */
/* .line 400 */
/* .line 402 */
} // :cond_8
v3 = this.icon;
v4 = this.icon;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_9 */
/* move v1, v2 */
/* .line 403 */
/* .line 405 */
} // :cond_9
v3 = this.iconLarge;
/* if-nez v3, :cond_a */
/* .line 406 */
v3 = this.iconLarge;
if ( v3 != null) { // if-eqz v3, :cond_b
/* move v1, v2 */
/* .line 407 */
/* .line 409 */
} // :cond_a
v3 = this.iconLarge;
v4 = this.iconLarge;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_b */
/* move v1, v2 */
/* .line 410 */
/* .line 412 */
} // :cond_b
v3 = this.id;
/* if-nez v3, :cond_c */
/* .line 413 */
v3 = this.id;
if ( v3 != null) { // if-eqz v3, :cond_d
/* move v1, v2 */
/* .line 414 */
/* .line 416 */
} // :cond_c
v3 = this.id;
v4 = this.id;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_d */
/* move v1, v2 */
/* .line 417 */
/* goto/16 :goto_0 */
/* .line 419 */
} // :cond_d
v3 = this.longDescription;
/* if-nez v3, :cond_e */
/* .line 420 */
v3 = this.longDescription;
if ( v3 != null) { // if-eqz v3, :cond_f
/* move v1, v2 */
/* .line 421 */
/* goto/16 :goto_0 */
/* .line 423 */
} // :cond_e
v3 = this.longDescription;
v4 = this.longDescription;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_f */
/* move v1, v2 */
/* .line 424 */
/* goto/16 :goto_0 */
/* .line 426 */
} // :cond_f
v3 = this.methodTypes;
/* if-nez v3, :cond_10 */
/* .line 427 */
v3 = this.methodTypes;
if ( v3 != null) { // if-eqz v3, :cond_11
/* move v1, v2 */
/* .line 428 */
/* goto/16 :goto_0 */
/* .line 430 */
} // :cond_10
v3 = this.methodTypes;
v4 = this.methodTypes;
v3 = (( java.lang.Object ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_11 */
/* move v1, v2 */
/* .line 431 */
/* goto/16 :goto_0 */
/* .line 433 */
} // :cond_11
v3 = this.name;
/* if-nez v3, :cond_12 */
/* .line 434 */
v3 = this.name;
if ( v3 != null) { // if-eqz v3, :cond_13
/* move v1, v2 */
/* .line 435 */
/* goto/16 :goto_0 */
/* .line 437 */
} // :cond_12
v3 = this.name;
v4 = this.name;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_13 */
/* move v1, v2 */
/* .line 438 */
/* goto/16 :goto_0 */
/* .line 440 */
} // :cond_13
v3 = this.npages;
/* if-nez v3, :cond_14 */
/* .line 441 */
v3 = this.npages;
if ( v3 != null) { // if-eqz v3, :cond_15
/* move v1, v2 */
/* .line 442 */
/* goto/16 :goto_0 */
/* .line 444 */
} // :cond_14
v3 = this.npages;
v4 = this.npages;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_15 */
/* move v1, v2 */
/* .line 445 */
/* goto/16 :goto_0 */
/* .line 447 */
} // :cond_15
v3 = this.offerType;
/* if-nez v3, :cond_16 */
/* .line 448 */
v3 = this.offerType;
if ( v3 != null) { // if-eqz v3, :cond_17
/* move v1, v2 */
/* .line 449 */
/* goto/16 :goto_0 */
/* .line 451 */
} // :cond_16
v3 = this.offerType;
v4 = this.offerType;
v3 = (( com.adknowledge.superrewards.model.SROfferType ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Lcom/adknowledge/superrewards/model/SROfferType;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_17 */
/* move v1, v2 */
/* .line 452 */
/* goto/16 :goto_0 */
/* .line 454 */
} // :cond_17
v3 = this.payout;
/* if-nez v3, :cond_18 */
/* .line 455 */
v3 = this.payout;
if ( v3 != null) { // if-eqz v3, :cond_19
/* move v1, v2 */
/* .line 456 */
/* goto/16 :goto_0 */
/* .line 458 */
} // :cond_18
v3 = this.payout;
v4 = this.payout;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_19 */
/* move v1, v2 */
/* .line 459 */
/* goto/16 :goto_0 */
/* .line 461 */
} // :cond_19
v3 = this.pricePoints;
/* if-nez v3, :cond_1a */
/* .line 462 */
v3 = this.pricePoints;
if ( v3 != null) { // if-eqz v3, :cond_1b
/* move v1, v2 */
/* .line 463 */
/* goto/16 :goto_0 */
/* .line 465 */
} // :cond_1a
v3 = this.pricePoints;
v4 = this.pricePoints;
v3 = (( java.lang.Object ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_1b */
/* move v1, v2 */
/* .line 466 */
/* goto/16 :goto_0 */
/* .line 468 */
} // :cond_1b
v3 = this.problemsPage;
/* if-nez v3, :cond_1c */
/* .line 469 */
v3 = this.problemsPage;
if ( v3 != null) { // if-eqz v3, :cond_1d
/* move v1, v2 */
/* .line 470 */
/* goto/16 :goto_0 */
/* .line 472 */
} // :cond_1c
v3 = this.problemsPage;
v4 = this.problemsPage;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_1d */
/* move v1, v2 */
/* .line 473 */
/* goto/16 :goto_0 */
/* .line 475 */
} // :cond_1d
v3 = this.requirements;
/* if-nez v3, :cond_1e */
/* .line 476 */
v3 = this.requirements;
if ( v3 != null) { // if-eqz v3, :cond_1f
/* move v1, v2 */
/* .line 477 */
/* goto/16 :goto_0 */
/* .line 479 */
} // :cond_1e
v3 = this.requirements;
v4 = this.requirements;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_1f */
/* move v1, v2 */
/* .line 480 */
/* goto/16 :goto_0 */
/* .line 482 */
} // :cond_1f
v3 = this.shortDescription;
/* if-nez v3, :cond_20 */
/* .line 483 */
v3 = this.shortDescription;
if ( v3 != null) { // if-eqz v3, :cond_21
/* move v1, v2 */
/* .line 484 */
/* goto/16 :goto_0 */
/* .line 486 */
} // :cond_20
v3 = this.shortDescription;
v4 = this.shortDescription;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_21 */
/* move v1, v2 */
/* .line 487 */
/* goto/16 :goto_0 */
/* .line 489 */
} // :cond_21
v3 = this.shortName;
/* if-nez v3, :cond_22 */
/* .line 490 */
v3 = this.shortName;
if ( v3 != null) { // if-eqz v3, :cond_23
/* move v1, v2 */
/* .line 491 */
/* goto/16 :goto_0 */
/* .line 493 */
} // :cond_22
v3 = this.shortName;
v4 = this.shortName;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_23 */
/* move v1, v2 */
/* .line 494 */
/* goto/16 :goto_0 */
/* .line 496 */
} // :cond_23
v3 = this.type;
/* if-nez v3, :cond_24 */
/* .line 497 */
v3 = this.type;
if ( v3 != null) { // if-eqz v3, :cond_25
/* move v1, v2 */
/* .line 498 */
/* goto/16 :goto_0 */
/* .line 500 */
} // :cond_24
v3 = this.type;
v4 = this.type;
v3 = (( com.adknowledge.superrewards.model.SRType ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Lcom/adknowledge/superrewards/model/SRType;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_25 */
/* move v1, v2 */
/* .line 501 */
/* goto/16 :goto_0 */
/* .line 503 */
} // :cond_25
v3 = this.url;
/* if-nez v3, :cond_26 */
/* .line 504 */
v3 = this.url;
if ( v3 != null) { // if-eqz v3, :cond_0
/* move v1, v2 */
/* .line 505 */
/* goto/16 :goto_0 */
/* .line 507 */
} // :cond_26
v3 = this.url;
v4 = this.url;
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_0 */
/* move v1, v2 */
/* .line 508 */
/* goto/16 :goto_0 */
} // .end method
public java.lang.String getCurrency ( ) {
/* .locals 1 */
/* .prologue */
/* .line 158 */
v0 = this.currency;
} // .end method
public java.lang.String getDescription ( ) {
/* .locals 1 */
/* .prologue */
/* .line 219 */
v0 = this.description;
} // .end method
public java.lang.String getIcon ( ) {
/* .locals 1 */
/* .prologue */
/* .line 276 */
v0 = this.icon;
} // .end method
public java.lang.String getIconLarge ( ) {
/* .locals 1 */
/* .prologue */
/* .line 299 */
v0 = this.iconLarge;
} // .end method
public java.lang.String getId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 186 */
v0 = this.id;
} // .end method
public java.lang.String getImage ( ) {
/* .locals 1 */
/* .prologue */
/* .line 280 */
v0 = this.image;
} // .end method
public java.lang.String getLongDescription ( ) {
/* .locals 1 */
/* .prologue */
/* .line 323 */
v0 = this.longDescription;
} // .end method
public java.util.List getMethodTypes ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/adknowledge/superrewards/model/SRMethodType;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 339 */
v0 = this.methodTypes;
} // .end method
public java.lang.String getName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 194 */
v0 = this.name;
} // .end method
public java.lang.String getNpages ( ) {
/* .locals 1 */
/* .prologue */
/* .line 166 */
v0 = this.npages;
} // .end method
public com.adknowledge.superrewards.model.SROfferType getOfferType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 268 */
v0 = this.offerType;
} // .end method
public java.lang.String getPayout ( ) {
/* .locals 1 */
/* .prologue */
/* .line 235 */
v0 = this.payout;
} // .end method
public java.util.List getPricePoints ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/adknowledge/superrewards/model/SRPricePoint;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 331 */
v0 = this.pricePoints;
} // .end method
public java.lang.String getProblemsPage ( ) {
/* .locals 1 */
/* .prologue */
/* .line 174 */
v0 = this.problemsPage;
} // .end method
public java.lang.String getRequirements ( ) {
/* .locals 1 */
/* .prologue */
/* .line 227 */
v0 = this.requirements;
} // .end method
public java.lang.String getShortDescription ( ) {
/* .locals 1 */
/* .prologue */
/* .line 315 */
v0 = this.shortDescription;
} // .end method
public java.lang.String getShortName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 307 */
v0 = this.shortName;
} // .end method
public com.adknowledge.superrewards.model.SRType getType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 243 */
v0 = this.type;
} // .end method
public java.lang.String getUrl ( ) {
/* .locals 1 */
/* .prologue */
/* .line 260 */
v0 = this.url;
} // .end method
public Integer hashCode ( ) {
/* .locals 5 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 348 */
/* const/16 v0, 0x1f */
/* .line 349 */
/* .local v0, "prime":I */
int v1 = 1; // const/4 v1, 0x1
/* .line 350 */
/* .local v1, "result":I */
v2 = this.currency;
/* if-nez v2, :cond_0 */
/* move v2, v3 */
} // :goto_0
/* add-int/lit8 v1, v2, 0x1f */
/* .line 351 */
/* mul-int/lit8 v4, v1, 0x1f */
v2 = this.description;
/* if-nez v2, :cond_1 */
/* move v2, v3 */
} // :goto_1
/* add-int v1, v4, v2 */
/* .line 352 */
/* mul-int/lit8 v4, v1, 0x1f */
v2 = this.icon;
/* if-nez v2, :cond_2 */
/* move v2, v3 */
} // :goto_2
/* add-int v1, v4, v2 */
/* .line 353 */
/* mul-int/lit8 v4, v1, 0x1f */
v2 = this.image;
/* if-nez v2, :cond_3 */
/* move v2, v3 */
} // :goto_3
/* add-int v1, v4, v2 */
/* .line 354 */
/* mul-int/lit8 v4, v1, 0x1f */
v2 = this.iconLarge;
/* if-nez v2, :cond_4 */
/* move v2, v3 */
} // :goto_4
/* add-int v1, v4, v2 */
/* .line 355 */
/* mul-int/lit8 v4, v1, 0x1f */
v2 = this.id;
/* if-nez v2, :cond_5 */
/* move v2, v3 */
} // :goto_5
/* add-int v1, v4, v2 */
/* .line 356 */
/* mul-int/lit8 v4, v1, 0x1f */
v2 = this.longDescription;
/* if-nez v2, :cond_6 */
/* move v2, v3 */
} // :goto_6
/* add-int v1, v4, v2 */
/* .line 357 */
/* mul-int/lit8 v4, v1, 0x1f */
v2 = this.methodTypes;
/* if-nez v2, :cond_7 */
/* move v2, v3 */
} // :goto_7
/* add-int v1, v4, v2 */
/* .line 358 */
/* mul-int/lit8 v4, v1, 0x1f */
v2 = this.name;
/* if-nez v2, :cond_8 */
/* move v2, v3 */
} // :goto_8
/* add-int v1, v4, v2 */
/* .line 359 */
/* mul-int/lit8 v4, v1, 0x1f */
v2 = this.npages;
/* if-nez v2, :cond_9 */
/* move v2, v3 */
} // :goto_9
/* add-int v1, v4, v2 */
/* .line 360 */
/* mul-int/lit8 v4, v1, 0x1f */
v2 = this.offerType;
/* if-nez v2, :cond_a */
/* move v2, v3 */
} // :goto_a
/* add-int v1, v4, v2 */
/* .line 361 */
/* mul-int/lit8 v4, v1, 0x1f */
v2 = this.payout;
/* if-nez v2, :cond_b */
/* move v2, v3 */
} // :goto_b
/* add-int v1, v4, v2 */
/* .line 362 */
/* mul-int/lit8 v4, v1, 0x1f */
v2 = this.pricePoints;
/* if-nez v2, :cond_c */
/* move v2, v3 */
} // :goto_c
/* add-int v1, v4, v2 */
/* .line 363 */
/* mul-int/lit8 v4, v1, 0x1f */
v2 = this.problemsPage;
/* if-nez v2, :cond_d */
/* move v2, v3 */
} // :goto_d
/* add-int v1, v4, v2 */
/* .line 364 */
/* mul-int/lit8 v4, v1, 0x1f */
v2 = this.requirements;
/* if-nez v2, :cond_e */
/* move v2, v3 */
} // :goto_e
/* add-int v1, v4, v2 */
/* .line 365 */
/* mul-int/lit8 v4, v1, 0x1f */
v2 = this.shortDescription;
/* if-nez v2, :cond_f */
/* move v2, v3 */
} // :goto_f
/* add-int v1, v4, v2 */
/* .line 366 */
/* mul-int/lit8 v4, v1, 0x1f */
v2 = this.shortName;
/* if-nez v2, :cond_10 */
/* move v2, v3 */
} // :goto_10
/* add-int v1, v4, v2 */
/* .line 367 */
/* mul-int/lit8 v4, v1, 0x1f */
v2 = this.type;
/* if-nez v2, :cond_11 */
/* move v2, v3 */
} // :goto_11
/* add-int v1, v4, v2 */
/* .line 368 */
/* mul-int/lit8 v2, v1, 0x1f */
v4 = this.url;
/* if-nez v4, :cond_12 */
} // :goto_12
/* add-int v1, v2, v3 */
/* .line 369 */
/* .line 350 */
} // :cond_0
v2 = this.currency;
v2 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
/* goto/16 :goto_0 */
/* .line 351 */
} // :cond_1
v2 = this.description;
v2 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
/* goto/16 :goto_1 */
/* .line 352 */
} // :cond_2
v2 = this.icon;
v2 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
/* goto/16 :goto_2 */
/* .line 353 */
} // :cond_3
v2 = this.image;
v2 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
/* goto/16 :goto_3 */
/* .line 354 */
} // :cond_4
v2 = this.iconLarge;
v2 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
/* goto/16 :goto_4 */
/* .line 355 */
} // :cond_5
v2 = this.id;
v2 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
/* goto/16 :goto_5 */
/* .line 356 */
} // :cond_6
v2 = this.longDescription;
v2 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
/* goto/16 :goto_6 */
/* .line 357 */
} // :cond_7
v2 = this.methodTypes;
v2 = (( java.lang.Object ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I
/* goto/16 :goto_7 */
/* .line 358 */
} // :cond_8
v2 = this.name;
v2 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
/* goto/16 :goto_8 */
/* .line 359 */
} // :cond_9
v2 = this.npages;
v2 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
/* goto/16 :goto_9 */
/* .line 360 */
} // :cond_a
v2 = this.offerType;
v2 = (( com.adknowledge.superrewards.model.SROfferType ) v2 ).hashCode ( ); // invoke-virtual {v2}, Lcom/adknowledge/superrewards/model/SROfferType;->hashCode()I
/* goto/16 :goto_a */
/* .line 361 */
} // :cond_b
v2 = this.payout;
v2 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
/* goto/16 :goto_b */
/* .line 362 */
} // :cond_c
v2 = this.pricePoints;
v2 = (( java.lang.Object ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I
/* goto/16 :goto_c */
/* .line 363 */
} // :cond_d
v2 = this.problemsPage;
v2 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
/* goto/16 :goto_d */
/* .line 364 */
} // :cond_e
v2 = this.requirements;
v2 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
/* goto/16 :goto_e */
/* .line 365 */
} // :cond_f
v2 = this.shortDescription;
v2 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
/* goto/16 :goto_f */
/* .line 366 */
} // :cond_10
v2 = this.shortName;
v2 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
/* goto/16 :goto_10 */
/* .line 367 */
} // :cond_11
v2 = this.type;
v2 = (( com.adknowledge.superrewards.model.SRType ) v2 ).hashCode ( ); // invoke-virtual {v2}, Lcom/adknowledge/superrewards/model/SRType;->hashCode()I
/* goto/16 :goto_11 */
/* .line 368 */
} // :cond_12
v3 = this.url;
v3 = (( java.lang.String ) v3 ).hashCode ( ); // invoke-virtual {v3}, Ljava/lang/String;->hashCode()I
/* goto/16 :goto_12 */
} // .end method
public Boolean isFree ( ) {
/* .locals 2 */
/* .prologue */
/* .line 247 */
v0 = this.type;
(( com.adknowledge.superrewards.model.SRType ) v0 ).toString ( ); // invoke-virtual {v0}, Lcom/adknowledge/superrewards/model/SRType;->toString()Ljava/lang/String;
(( java.lang.String ) v0 ).toLowerCase ( ); // invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
final String v1 = "free"; // const-string v1, "free"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 248 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void setCurrency ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "currency" # Ljava/lang/String; */
/* .prologue */
/* .line 162 */
this.currency = p1;
/* .line 163 */
return;
} // .end method
public void setDescription ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "description" # Ljava/lang/String; */
/* .prologue */
/* .line 223 */
this.description = p1;
/* .line 224 */
return;
} // .end method
public void setFreeImage ( ) {
/* .locals 1 */
/* .prologue */
/* .line 289 */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
final String v0 = "http://cdn.superrewards-offers.com/img/offerwall/v2/images/off_image_free.png"; // const-string v0, "http://cdn.superrewards-offers.com/img/offerwall/v2/images/off_image_free.png"
this.image = v0;
/* .line 291 */
return;
} // .end method
public void setGeoAvailability ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "geo" # Ljava/lang/String; */
/* .prologue */
/* .line 182 */
this.geo_availability = p1;
/* .line 183 */
return;
} // .end method
public void setIcon ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "icon" # Ljava/lang/String; */
/* .prologue */
/* .line 295 */
int v0 = 0; // const/4 v0, 0x0
this.icon = v0;
/* .line 296 */
return;
} // .end method
public void setIconLarge ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "iconLarge" # Ljava/lang/String; */
/* .prologue */
/* .line 303 */
this.iconLarge = p1;
/* .line 304 */
return;
} // .end method
public void setId ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "id" # Ljava/lang/String; */
/* .prologue */
/* .line 190 */
this.id = p1;
/* .line 191 */
return;
} // .end method
public void setImage ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "image" # Ljava/lang/String; */
/* .prologue */
/* .line 284 */
this.image = p1;
/* .line 286 */
return;
} // .end method
public void setLongDescription ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "longDescription" # Ljava/lang/String; */
/* .prologue */
/* .line 327 */
this.longDescription = p1;
/* .line 328 */
return;
} // .end method
public void setMethodTypes ( java.util.List p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/adknowledge/superrewards/model/SRMethodType;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 343 */
/* .local p1, "methodTypes":Ljava/util/List;, "Ljava/util/List<Lcom/adknowledge/superrewards/model/SRMethodType;>;" */
this.methodTypes = p1;
/* .line 344 */
return;
} // .end method
public void setName ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 199 */
this.name = p1;
/* .line 201 */
(( java.lang.String ) p1 ).toLowerCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
final String v1 = "paypalec"; // const-string v1, "paypalec"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 202 */
final String v0 = "Paypal"; // const-string v0, "Paypal"
this.name = v0;
/* .line 205 */
} // :cond_0
(( java.lang.String ) p1 ).toLowerCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
final String v1 = "gate2shop"; // const-string v1, "gate2shop"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 206 */
final String v0 = "Credit Card"; // const-string v0, "Credit Card"
this.name = v0;
/* .line 209 */
} // :cond_1
(( java.lang.String ) p1 ).toLowerCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
final String v1 = "google"; // const-string v1, "google"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 210 */
final String v0 = "Google"; // const-string v0, "Google"
this.name = v0;
/* .line 213 */
} // :cond_2
(( java.lang.String ) p1 ).toLowerCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
final String v1 = "zongplus"; // const-string v1, "zongplus"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 214 */
final String v0 = "zong"; // const-string v0, "zong"
this.name = v0;
/* .line 216 */
} // :cond_3
return;
} // .end method
public void setNpages ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "npages" # Ljava/lang/String; */
/* .prologue */
/* .line 170 */
this.npages = p1;
/* .line 171 */
return;
} // .end method
public void setOfferType ( com.adknowledge.superrewards.model.SROfferType p0 ) {
/* .locals 0 */
/* .param p1, "offerType" # Lcom/adknowledge/superrewards/model/SROfferType; */
/* .prologue */
/* .line 272 */
this.offerType = p1;
/* .line 273 */
return;
} // .end method
public void setPayout ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "payout" # Ljava/lang/String; */
/* .prologue */
/* .line 239 */
this.payout = p1;
/* .line 240 */
return;
} // .end method
public void setPricePoints ( java.util.List p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/adknowledge/superrewards/model/SRPricePoint;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 335 */
/* .local p1, "pricePoints":Ljava/util/List;, "Ljava/util/List<Lcom/adknowledge/superrewards/model/SRPricePoint;>;" */
this.pricePoints = p1;
/* .line 336 */
return;
} // .end method
public void setProblemsPage ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "problemsPage" # Ljava/lang/String; */
/* .prologue */
/* .line 178 */
this.problemsPage = p1;
/* .line 179 */
return;
} // .end method
public void setRequirements ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "requirements" # Ljava/lang/String; */
/* .prologue */
/* .line 231 */
this.requirements = p1;
/* .line 232 */
return;
} // .end method
public void setShortDescription ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "shortDescription" # Ljava/lang/String; */
/* .prologue */
/* .line 319 */
this.shortDescription = p1;
/* .line 320 */
return;
} // .end method
public void setShortName ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "shortName" # Ljava/lang/String; */
/* .prologue */
/* .line 311 */
this.shortName = p1;
/* .line 312 */
return;
} // .end method
public void setType ( com.adknowledge.superrewards.model.SRType p0 ) {
/* .locals 0 */
/* .param p1, "type" # Lcom/adknowledge/superrewards/model/SRType; */
/* .prologue */
/* .line 252 */
this.type = p1;
/* .line 257 */
return;
} // .end method
public void setUrl ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 264 */
this.url = p1;
/* .line 265 */
return;
} // .end method
