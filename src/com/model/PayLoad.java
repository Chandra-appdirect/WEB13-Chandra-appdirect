package com.model;

public class PayLoad
{
    private Order order;
    public PayLoad()
    {}
    public PayLoad(Order order, Company company, User user, Address address, AddOnInstance addonInstance,
			AddOnBinding addonBinding, Notice notice, Account account, Configuration configuration) {
		super();
		this.order = order;
		this.company = company;
		this.user = user;
		this.address = address;
		this.addonInstance = addonInstance;
		this.addonBinding = addonBinding;
		this.notice = notice;
		this.account = account;
		this.configuration = configuration;
	}
	private Company company;
    private User user;
    private Address address;
    private AddOnInstance addonInstance;
    private AddOnBinding addonBinding;
    private Notice notice;
    private Account account;
    private Configuration configuration;

    public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	

	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}

	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public AddOnInstance getAddoninstance() {
		return addonInstance;
	}
	public void setAddoninstance(AddOnInstance addoninstance) {
		this.addonInstance = addoninstance;
	}

	public AddOnBinding getAddonbinding() {
		return addonBinding;
	}
	public void setAddonbinding(AddOnBinding addonbinding) 
	{
		this.addonBinding = addonbinding;
	}

	public Notice getNotice() {
		return notice;
	}
	public void setNotice(Notice notice) {
		this.notice = notice;
	}

	public Configuration getConfiguration() {
		return configuration;
	}
	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}
}
    