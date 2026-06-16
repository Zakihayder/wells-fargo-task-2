package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PortfolioSecurityId implements Serializable {

    @Column(name = "portfolio_id")
    private Long portfolioId;

    @Column(name = "security_id")
    private Long securityId;

    public PortfolioSecurityId(Long portfolioId, Long securityId) {
        this.portfolioId = portfolioId;
        this.securityId = securityId;
    }

    public PortfolioSecurityId() {}

    // --- Getters & Setters ---

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(Long securityId) {
        this.securityId = securityId;
    }

    // equals() and hashCode() are required for composite keys to work correctly with JPA
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PortfolioSecurityId)) return false;
        PortfolioSecurityId that = (PortfolioSecurityId) o;
        return Objects.equals(portfolioId, that.portfolioId) &&
               Objects.equals(securityId, that.securityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portfolioId, securityId);
    }
}
