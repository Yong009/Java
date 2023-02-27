package com.yedam.service;

public class NewCar {

	// 회원필드
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberNumber;

	
	
	// 차 기본필드
	private int carNumber;
	private String carName;
	private String carKind;

	
	
	// 차 상태 필드
//	private int carNumber;
	private int carYear;
	private int carCount;
	private int carOil;
	private int carEnoil;
	private int carTire;

	
	
	// 리뷰필드
	// private String memberId;
	// private String carName;
	private String reviewRv;

	

	// 주차필드
	// private String carKind
	private String locationPark;

	
	
	// 중고사고팔기
	// private String memberId;
	private String dealDl;
	private String dealText;

	
	
	
	// 가격필드
	private int pricePrice;
	private int priceOil;
	//private int car_number
	
	
	
	// 보험 필드
	// private String carNumber;
	private String inInsurance;
	private int inPrice;
	
	//수입
	
	
	public String getInInsurance() {
		return inInsurance;
	}



	public void setInInsurance(String inInsurance) {
		this.inInsurance = inInsurance;
	}



	public int getInPrice() {
		return inPrice;
	}



	public void setInPrice(int inPrice) {
		this.inPrice = inPrice;
	}

	// 쿠폰 필드
	private int couponNumber;
	private int couponPrice;

	// 등급 필드
	private String gradeName;
	private String gradeDc;

	// 예약 필드
	// private String memberId;
	// private int carId;
//	private String date;

	// 렌트
	
	private int rentId;
	//private int carNumber;
	private String rentDate;
	private int rentDistance;
	private String rentReserved;
	//private String member_id;
	
	
	
	
	
	

	

	public String getMemberId() {
		return memberId;
	}

	

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}

	
	
	
	
	
	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarKind() {
		return carKind;
	}

	public void setCarKind(String carKind) {
		this.carKind = carKind;
	}

	
	
	
	
	
	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public int getCarCount() {
		return carCount;
	}

	public void setCarCount(int carCount) {
		this.carCount = carCount;
	}

	public int getCarOil() {
		return carOil;
	}

	public void setCarOil(int carOil) {
		this.carOil = carOil;
	}

	public int getCarEnoil() {
		return carEnoil;
	}

	public void setCarEnoil(int carEnoil) {
		this.carEnoil = carEnoil;
	}

	public int getCarTire() {
		return carTire;
	}

	public void setCarTire(int carTire) {
		this.carTire = carTire;
	}

		
		
	
	public String getReviewRv() {
		return reviewRv;
	}

	public void setReviewRv(String reviewRv) {
		this.reviewRv = reviewRv;
	}

	
	
	
	
	public int getRentId() {
		return rentId;
	}
	public void setRentId(int rentId) {
		this.rentId = rentId;
	}
	
		public String getRentDate() {
		return rentDate;
	}

	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}

	public int getRentDistance() {
		return rentDistance;
	}

	public void setRentDistance(int rentDistance) {
		this.rentDistance = rentDistance;
	}

	public String getRentReserved() {
		return rentReserved;
	}

	public void setRentReserved(String rentReserved) {
		this.rentReserved = rentReserved;
	}

	
	
		
	
	
	public String getLocationPark() {
		return locationPark;
	}

	public void setLocationPark(String locationPark) {
		this.locationPark = locationPark;
	}

	
	
	
	
	
	
	public String getDealDl() {
		return dealDl;
	}

	public void setDealDl(String dealDl) {
		this.dealDl = dealDl;
	}

	public String getDealText() {
		return dealText;
	}

	public void setDealText(String dealText) {
		this.dealText = dealText;
	}

	public int getPricePrice() {
		return pricePrice;
	}

	public void setPricePrice(int pricePrice) {
		this.pricePrice = pricePrice;
	}

	public int getPriceOil() {
		return priceOil;
	}

	public void setPriceOil(int priceOil) {
		this.priceOil = priceOil;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	public int getCouponNumber() {
		return couponNumber;
	}

	public void setCouponNumber(int couponNumber) {
		this.couponNumber = couponNumber;
	}

	public int getCouponPrice() {
		return couponPrice;
	}

	public void setCouponPrice(int couponPrice) {
		this.couponPrice = couponPrice;
	}

	
	
	
	
	
	
	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public String getGradeDc() {
		return gradeDc;
	}

	public void setGradeDc(String gradeDc) {
		this.gradeDc = gradeDc;
	}

	
	
	
	
	

	public String getRankingPrice() {
		return rankingPrice;
	}

	public void setRankingPrice(String rankingPrice) {
		this.rankingPrice = rankingPrice;
	}

	public String getRankingCount() {
		return rankingCount;
	}

	public void setRankingCount(String rankingCount) {
		this.rankingCount = rankingCount;
	}

	public String getPenaltyStop() {
		return penaltyStop;
	}

	public void setPenaltyStop(String penaltyStop) {
		this.penaltyStop = penaltyStop;
	}

	// 랭킹 필드
	private String rankingPrice;
	private String rankingCount;

	// 패널티
	// private String memberId;
	private String penaltyStop;









	

	
	
	
}
